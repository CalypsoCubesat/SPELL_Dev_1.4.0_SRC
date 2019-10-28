'''
Created on May 16, 2014

@author: akerch

Preference Page Setup:

# <Page>
#     <Name>SCDB Checker Page</Name>
#     <Id>SCDB_Checker</Id>
#     <Option>
#         <Text>SCDB Checker Options:</Text>
#         <Type>Label</Type>
#     </Option>
#     <Option>
#         <Type>Separator</Type>
#     </Option>
#     <Option>
#         <Name>CheckSCDBEntries</Name>
#         <Text>Check for missing SCDB entries.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option> 
#     <Option>
#         <Name>CheckGDBEntries</Name>
#         <Text>Check for missing GDB entries.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option> 
#     <Option>
#         <Name>CheckMissingUserLib</Name>
#         <Text>Check for missing UserLib functions.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>     
#     <Option>
#         <Name>CheckMissingStartProc</Name>
#         <Text>Check for missing Procedures used in StartProc.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>  
#     <Option>
#         <Name>CheckMissingImports</Name>
#         <Text>Check for Modules that have been imported but could not be found.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>   
#     <Option>
#         <Name>CheckMalformedDB</Name>
#         <Text>Check SCDB and GDB for malformed entries.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>  
#     <Option>
#         <Name>CheckMissingDict</Name>
#         <Text>Check if Dictionaries used in LoadDictionary exist.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>   
#     <Option>
#         <Name>CheckProcHeader</Name>
#         <Text>Check the procedure Header if its missing the correct SC.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option>  
#     <Option>
#         <Name>SPELL_FUNCTIONS</Name>
#         <Text>All vailable SPELL functions and definitions.</Text>
#         <Type>List</Type>
#         <Default>isinstance|Send|Verify|WaitFor|Finish|Step|DisableUserAction|EnableUserAction|Display|Prompt|SetUserAction|Abort|TIME|str|bool|int|GetTM|float|abs|sin|cos|acos|asin|tan|atan|LoadDictionary|len|sorted|list|set|range|Pause|Goto|all|filter|map|xrange|dict|DisplayStep|eval|CreateDictionary|SaveDictionary|BuildTC|ChangeLanguageConfig|type|DismissUserAction|Wait|RestoreNormalLimits|SetGroundParameter|GetLimits|LoadLimits|SetLimits|open|SetResource|DisableRanging|EnableRanging|Set_Limits|Exception|ref|pow|sqrt|repr|max|min|zip|floor|OpenFile|CloseFile|OpenWorkspace|CloseWorkspace|ReadFile|WriteFile|sum|bin|hex|radians|degrees|cmp|ReadDirectory|File|DeleteFile|Open|Close|Read|Write|Var|round|Event|EnableAlarm|DisableAlarm|TMTCLookup|MemoryLookup|trunc|CompareMemoryImages|GenerateMemoryReport|GetResource|AND|OR|log|UploadRAMPatch|BuildMemoryLoad|OpenDisplay|CloseDisplay|divmod|long|GetSharedData|SetSharedData|GetSharedDataScopes|ClearSharedData|GetSharedDataKeys|AddSharedDataScope|GetSharedDataKeys|globals|locals|Handle</Default>
#     </Option>    
</Page>

'''
import datetime, csv, os

import compiler.ast as ast
import compiler.visitor as visitor
import compiler
import re
import pkgutil
import inspect
import os
import sys
WORK_DIR = os.getenv('WORK_DIR')

sys.path.insert(0, WORK_DIR)
from OPA_Utils import *

CheckSCDBEntries = os.getenv('CheckSCDBEntries') == 'true'
CheckGDBEntries = os.getenv('CheckGDBEntries') == 'true'
CheckMissingUserLib = os.getenv('CheckMissingUserLib') == 'true'
CheckMissingStartProc = os.getenv('CheckMissingStartProc') == 'true'
CheckMissingImports = os.getenv('CheckMissingImports') == 'true'
CheckMalformedDB = os.getenv('CheckMalformedDB') == 'true'
CheckProcHeader = os.getenv('CheckProcHeader') == 'true'
CheckMissingDict = os.getenv('CheckMissingDict') == 'true'

print '<BOLD>'
print ('*' * 80)
print 'SPELL Proc Checker'
print 'Enabled Checks:'
if CheckSCDBEntries:
    print '    Check for missing SCDB entries.'
#ENDIF
if CheckGDBEntries:
    print '    Check for missing GDB entries.'
#ENDIF
if CheckMissingUserLib:
    print '    Check for missing UserLib functions.'
#ENDIF
if CheckMissingStartProc:
    print '    Check for missing Procedures used in StartProc.'
#ENDIF
if CheckMissingImports:
    print '    Check for Modules that have been imported but could not be found.'
#ENDIF
if CheckMalformedDB:
    print '    Check SCDB and GDB for malformed entries.'
#ENDIF
if CheckMissingDict:
    print '    Check if Dictionaries used in LoadDictionary exist.'
#ENDIF
if CheckProcHeader:
    print '    Check the procedure Header if its missing the correct SC.'
#ENDIF

print ('*' * 80)
print '<!BOLD>'
SPELL_FUNCTIONS = os.getenv('SPELL_FUNCTIONS')
if SPELL_FUNCTIONS == None:
    SPELL_FUNCTIONS = set(['isinstance','Send','Verify','WaitFor','Finish','Step','DisableUserAction','EnableUserAction','Display','Prompt','SetUserAction','Abort','TIME','str','bool','int',\
                            'GetTM','float','abs','sin','cos','acos','asin','tan','atan','LoadDictionary','len','sorted','list','set','range','Pause','Goto','all','filter','map','xrange','dict' ,\
                            'DisplayStep','eval','CreateDictionary','SaveDictionary','BuildTC','ChangeLanguageConfig','type','DismissUserAction','Wait','RestoreNormalLimits','SetGroundParameter','GetLimits','LoadLimits','SetLimits',\
                            'open','SetResource','DisableRanging','EnableRanging','Set_Limits','Exception','ref','pow','sqrt','repr','max','min','zip','floor','OpenFile','CloseFile','OpenWorkspace','CloseWorkspace',\
                            'ReadFile','WriteFile','sum','bin','hex','radians','degrees','cmp','ReadDirectory','File','DeleteFile','Open','Close','Read','Write','Var','round','Event','EnableAlarm',\
                            'DisableAlarm','TMTCLookup','MemoryLookup','trunc','CompareMemoryImages','GenerateMemoryReport','GetResource','AND','OR','log','UploadRAMPatch','BuildMemoryLoad','OpenDisplay','CloseDisplay','divmod','long',\
                            'GetSharedData','SetSharedData','GetSharedDataScopes','ClearSharedData','GetSharedDataKeys','AddSharedDataScope','GetSharedDataKeys','globals','locals','Handle'])
else:
    SPELL_FUNCTIONS = set(SPELL_FUNCTIONS.split('|'))
#ENDIF
BuiltInImports = set(['datetime','math','__main__','sys'])

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')

for loader,name,ispkg in pkgutil.iter_modules():
    BuiltInImports.add(name)
#ENDFOR

class SpellNodeVisitor():
    def __init__(self):
        self.scdb = set()
        self.gdb = set()
        self.imports = {}
        self.startProc = {}
        self.definedFunc = {}
        self.definedClasses = {}
        self.functionCall = {}
        self.referencedDict = {}
        self.node = None
        self._cache = {}
    #ENDDEF
    
    def default(self, node, *args):
        for child in node.getChildNodes():
            child.ctx = node
            self.dispatch(child, *args)
        #ENDFOR
    #ENDDEF
    
    def dispatch(self, node, *args):
        self.node = node
        klass = node.__class__
        meth = self._cache.get(klass, None)
        if meth is None:
            className = klass.__name__
            meth = getattr(self, 'visit' + className, self.default)
            self._cache[klass] = meth
        #ENDIF
        return meth(node, *args)
    #ENDDEF
        
    '''
        see for possible visit functions 
            https://docs.python.org/release/2.5/lib/module-compiler.ast.html
    ''' 
    
    def visitClass(self,node,*args):
        '''
            Handler function that is called for a class definition
        '''
        #print 'classdef '  + repr(node)
        self.definedClasses[node.name] = node.lineno
        for baseClass in node.bases:
            self.functionCall[baseClass.name] = node.lineno
        #ENDFOR
        self.default(node)
    #ENDDEF
    def visitFrom(self,node,*args):
        '''
            Handler function for from * import statements
        '''
        #print node
        self.imports[node.modname] = node.lineno
        for importName in node.names:
            #print str(node.lineno) + ' ' + repr(importName)
            importedName = importName[1]
            if importedName == None:
                importedName = importName[0]
            #ENDIF
            self.definedFunc[importedName] = node.lineno
        #ENDFOR
        self.default(node)
    #ENDDEF
    def visitImport(self, node,*args):
        '''
            Handler function for import statements
        '''
        #print node 
        for aliasName in node.names:
            self.imports[aliasName[0]] = node.lineno
            importedName = aliasName[1]
            if importedName == None:
                importedName = aliasName[0]
            #ENDIF
            self.definedFunc[importedName] = node.lineno
        #ENDFOR
        self.default(node)
    #ENDDEF
    
    def visitFunction(self,node,*args):
        '''
            Handler function for function definitions        
        '''
        #print 'FunctionDef: ' + repr(node) 
        self.definedFunc[node.name] = node.lineno
        self.default(node)
    #ENDDEF
    
    def visitLambda(self,node,*args):
        '''
            Handler function for lambda statements
        '''
        #print 'Lambda: ' + repr(node) 
        if isinstance(node.ctx,ast.Assign):
            for n in node.ctx.nodes:
                if isinstance(n,ast.Name):
                    self.definedFunc[n.name] = node.lineno
                #ENDIF
            #ENDFOR
        #ENDIF   
        self.default(node)     
    #ENDDEF
    
    def visitName(self, node,*args):
        '''
            Handler function for names escpeaily when used as name for an array or for a function call
        '''
        
        if node.name == 'SCDB':
            self.scdb.add(node.ctx)
        elif node.name == 'GDB':
            self.gdb.add(node.ctx)
        elif node.name == 'StartProc' and isinstance(node.ctx.args[0],ast.Const):
            self.startProc[node.ctx.args[0].value] = node.ctx.lineno
        elif node.name == 'LoadDictionary' and isinstance(node.ctx,ast.CallFunc) and node.ctx.node == node:
            firstArg = node.ctx.args[0]
            if isinstance(firstArg,ast.Const):
                self.referencedDict[firstArg.value] = node.ctx.lineno
            #ENDIF
        elif isinstance(node.ctx,ast.CallFunc) and node.ctx.node == node:
            #print 'funccall: ' + repr(node.ctx)  
            self.functionCall[node.name] = node.ctx.lineno
        #ENDIF
        self.default(node)
    #ENDDEF
#ENDCLASS




def parseFileAST(filepath):
    if '\\SAE_Comments/' in filepath:
        return [],[],[],None
    #ENDIF
    if '\\TEST/' in filepath or '\\Test/' in filepath:
        return [],[],[],None
    #ENDIF
    try:
        current_Proc = open(filepath)
        SCDB_Entries = []
        GDB_Entries = []
        sourceCode = ''
        for line in current_Proc.readlines():
            sourceCode += line
        #ENDFOR
        
        astTree = compiler.parse(sourceCode + '\n')
        parser = SpellNodeVisitor()
    
        parser.default(astTree)
        
        #print 'Called functions:'
        #print parser.functionCall.keys()
            
            
        #print 'Defined functions:'
        #print parser.definedFunc.keys()
        
       
        missingUserLib = map(lambda key:(key,parser.functionCall[key]),  filter(lambda val: val not in parser.definedFunc.keys() and \
                                                                                            val not in SPELL_FUNCTIONS and \
                                                                                            val not in definedUserLibFunctions and \
                                                                                            val not in parser.definedClasses.keys(), parser.functionCall))
        for scdbEntry in parser.scdb:
            if isinstance(scdbEntry,ast.Subscript):
                if scdbEntry.flags == 'OP_APPLY':
                    #scdbEntry is in the form SCDB[someExpr]
                    if isinstance(scdbEntry.subs[0],ast.Const):
                        #SCDB is called with a String or a number
                        if scdbEntry.subs[0].value not in SCDB_Entries:
                            SCDB_Entries.append((scdbEntry.subs[0].value,scdbEntry.lineno))
                    elif isinstance(scdbEntry.subs[0],ast.Name):
                        #SCDB is called with a variable. Might want to issue a warning
                        pass
                    else:
                        #should not happen
                        pass   
                    #ENDIF
                #ENDIF 
        #ENDFOR
        
        for gdbEntry in parser.gdb:
            if isinstance(gdbEntry,ast.Subscript):
                if gdbEntry.flags == 'OP_APPLY':
                    #scdbEntry is in the form SCDB[someExpr]
                    if isinstance(gdbEntry.subs[0],ast.Const):
                        #SCDB is called with a String or a number
                        if gdbEntry.subs[0].value not in GDB_Entries:
                            GDB_Entries.append((gdbEntry.subs[0].value,gdbEntry.lineno))
                    elif isinstance(gdbEntry.subs[0],ast.Name):
                        #SCDB is called with a variable. Might want to issue a warning
                        pass
                    else:
                        #should not happen
                        pass 
                    #ENDIF
                #ENDIF
            #ENDIF
        #ENDFOR
        
        current_Proc.close()
        
        return SCDB_Entries,GDB_Entries,missingUserLib,parser
    except:
        #raise
        Display("Error while parsing procedure:"+ str(sys.exc_info()))
        try:
            return parseFile(filepath),[],[],None
        except:
            Display("Error while in fallback function:"+ str(sys.exc_info()))
            return [],[],[],None
#ENDDEF

def parseFile(filepath):
    offset = 0
    lineno = 1
    current_Proc = open(filepath)
    SCDB_Entries = []
    for line in current_Proc.readlines():
        line = line.strip()
        # now check if you can find an SCDB[ string in the line
        if 'SCDB[' in line:
            for item in line.split():
                # parse the line to filter out the key
                if 'SCDB[' in item :
                    #print item
                    #print item.find('SCDB[')+5
                    #print item[item.find('SCDB[')+5]
                    if item[item.find('SCDB[')+5] == "'":
                        offset = 1                        
                    #ENDIF
                    
                    start = item.find('SCDB[')+5+offset
                    end   = item[start:].find(']')-offset+start
                    #print item[start:end]
                    if end == -1:
                        #didnt find the closing brace in the substring ]
                        end = len(item)
                    if offset == 0:
                        Display('Attention SCDB key %s might be a variable inheriting the SCDB key ' %item[start:end] )
                    if item[start:end] not in SCDB_Entries:
                        SCDB_Entries.append((item[start:end],lineno))
                    #ENDIF    
                    offset = 0
                #ENDIF    
            #ENDFOR
        #ENDIF    
        lineno += 1
    #ENDFOR
    current_Proc.close()
    return  SCDB_Entries      
#ENDDEF 

def checkForMissingEntries(entries,DB,proc,name):
    global errorLog
    global errorsFound
    for item,lineno in entries:
        if item not in DB.keys():   
            errorsFound = True                
            logError((80 * '*'))
            logError('Error: %s of %s was not found in %s line %s' %(item,proc,name,str(lineno)))  
            if (item,proc,name,lineno) not in errorLog:
                errorLog.append((item,proc,name,lineno))
            logError((80 * '*'))

        #ENDIF
    #ENDFOR
#ENDDEF


#******************************************************************************

if __name__ == '__main__':
    
    import sys,os   
    amt = os.getenv('AMOUNT_PROJECTS')
  
    selProject = os.getenv('FULLPATH0')
    if selProject == None: 
        path = os.getenv('Selected_Folder') 
    else:
        path = selProject
    print path
    
    allPaths = [path]
    for i in range(1,int(amt)):
        allPaths.append(os.getenv('FULLPATH' + str(i)))
    #ENDFOR
    errorLog = []
    userLibErrorLog = []
    inputFilesErrorLog = []
    startProcErrorLog = []
    importProcErrorLog = []
    missingSatErrorLog = []
    faultySCDBLines = []
    faultyGDBLines = []
    for path in allPaths:
        definedUserLibFunctions = set()
        availableProcedures = set()

        Drive, Workspace,Satellite = path.split('\\')[0:3]
        
        Folders = path.split('\\')[3:]
        SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SpacecraftDB\\SCDB.DB'
        Alt_SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB'
        GDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\GroundDB\\GDB.DB'
        Alt_GDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SPELL_FORMAT\\GroundDB\\GDB.DB'
        UserLib_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\UserLib'
        InputFilesUserBasePath = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\User'
        InputFilesMMDBasePath = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\ManeuvreMessage'
        ProcedureBasePath = os.path.join(Drive + '\\', Workspace,Satellite) + '\\Procedures'
        
        for dirname, dirnames, f in os.walk(UserLib_Path):
            for userLibFile in f:
            
                
                if userLibFile[-3:] == '.py': 
                    current_Proc = open(dirname + '/' + userLibFile)
                    sourceCode = ''
                    for line in current_Proc.readlines():
                        sourceCode += line
                    #ENDFOR
                    procFile = userLibFile[0:-3]
                    splitPath = dirname.split('\\')
                    curPath = ''
                    i = len(splitPath)-1
                    while i >= 0:
                        availableProcedures.add(curPath + procFile)
                        curPath = splitPath[i] + '\\' + curPath
                        i-=1
                    #ENDWHILE
                    astTree = compiler.parse(sourceCode + '\n')
                    parser = SpellNodeVisitor()
                    parser.default(astTree)
                    for key in parser.definedFunc.keys():
                        definedUserLibFunctions.add(key)
                    #ENDFOR  
                    for key in parser.definedClasses.keys():
                        definedUserLibFunctions.add(key)
                    #ENDFOR  
                #ENDIF          
            #ENDFOR
        #ENDFOR
        for dirname, dirnames, f in os.walk(ProcedureBasePath):
            for procFile in f:
                procFile = procFile[0:-3]
                splitPath = dirname.split('\\')
                curPath = ''
                i = len(splitPath)-1
                while i >= 0:
                    availableProcedures.add(curPath + procFile)
                    curPath = splitPath[i] + '\\' + curPath
                    i-=1
                #ENDWHILE
            #ENDFOR
        #ENDIF
        
        Display(80*'-')
        faultyLines = []
        db_path = None
        
        if os.path.isfile(SCDB_Path):
            db_path = SCDB_Path
            SCDB = loadDatabaseFile('SCDB',SCDB_Path,faultyLines) 
        else:
            db_path = Alt_SCDB_Path
            SCDB = loadDatabaseFile('SCDB',Alt_SCDB_Path,faultyLines)
        #ENDIF
        if not CheckMalformedDB:
            faultyLines = []
        for idx,faultyAssignment in faultyLines:
            if (db_path,idx,faultyAssignment[0],faultyAssignment[1]) not in faultySCDBLines:
                faultySCDBLines.append((db_path,idx,faultyAssignment[0],faultyAssignment[1]))
            #ENDIF
        #ENDIF
        faultyLines = []
        fixSCDB(SCDB)
        if os.path.isfile(GDB_Path):
            db_path = GDB_Path
            GDB = loadDatabaseFile('GDB',GDB_Path,faultyLines)  
        else:
            db_path = Alt_GDB_Path
            GDB = loadDatabaseFile('GDB',Alt_GDB_Path,faultyLines)  
        if not CheckMalformedDB:
            faultyLines = []
        for idx,faultyAssignment in faultyLines:
            if (db_path,idx,faultyAssignment[0],faultyAssignment[1]) not in faultyGDBLines:
                faultyGDBLines.append((db_path,idx,faultyAssignment[0],faultyAssignment[1]))
            #ENDIF
        #ENDIF
        #print SCDB_File
    
        filenames = []
        if not os.path.isdir(path):
              path, filename = os.path.split(path)
              if not ('\\Regression' in path or '/Regression' in path or '\\SAE_Comments' in path or '\\TEST' in path or '\\Test' in path or '/SAE_Comments' in path or '/TEST' in path or '/Test' in path):   
                  filenames=[path + '/' + filename]
        else:         
            for dirname, dirnames, f in os.walk(path):
                # filenames contains a list of all the files in this directory.
                #print 'f: ' + repr(f)
                if not ('\\Regression' in dirname or '/Regression' in dirname or '\\SAE_Comments' in dirname or '\\TEST' in dirname or '\\Test' in dirname or '/SAE_Comments' in dirname or '/TEST' in dirname or '/Test' in dirname):   
                    filenames += map(lambda file: dirname + '/' + file, f)
            #ENDFOR
        #ENDIF  
        for proc in filenames:
            if proc[-3:] != '.py': 
                continue
            #ENDIF    
            Display( '\nParsing %s :'%proc)
            Display((80 * '-'))
            
            #comparison_Result = parseFile(path +'/' + proc)
            #result += comparison_Result            
            #sys.stdout.write('SCDB related parameters detected in file:\n')
            #sys.stdout.write(repr(comparison_Result)+'\n')
            #sys.stdout.write(str(len(comparison_Result))+' items found\n')
            #sys.stdout.flush()
    
            SCDB_Entries,GDB_Entries,missingUserLib,parser = parseFileAST( proc)
            #print missingUserLib
            #result += comparison_Result            
            Display('SCDB related parameters detected in file using AST:')
            Display(repr(SCDB_Entries))
            #sys.stdout.write(str(len(comparison_Result))+' items found\n')     

           
            Display('GDB related parameters detected in file using AST:')
            Display(repr(GDB_Entries))
            #sys.stdout.write(str(len(comparison_Result))+' items found\n')     

            errorsFound = False
            if CheckSCDBEntries:
                checkForMissingEntries(SCDB_Entries,SCDB,proc,'SCDB')
            if CheckGDBEntries:
                checkForMissingEntries(GDB_Entries,GDB,proc,'GDB')
            if CheckMissingUserLib:
                for item,lineno in missingUserLib:     
                    errorsFound = True             
                    logError((80 * '*'))
                    logError('Error: UserLib function %s was not found in %s line %s' %(item,proc,str(lineno)))  
                    if (item,proc,lineno) not in userLibErrorLog:
                        userLibErrorLog.append((item,proc,lineno))
                    #ENDIF
                    logError((80 * '*'))
                #ENDFOR
            if parser != None:
                missingStartProc = map(lambda key:(key,parser.startProc[key]),  filter(lambda val: val.replace('/','\\') not in availableProcedures, parser.startProc))
                if not CheckMissingStartProc:
                    missingStartProc = {}
                missingImports = map(lambda key:(key,parser.imports[key]),  filter(lambda val: val.replace('.','\\') not in availableProcedures and val not in BuiltInImports, parser.imports))
                if not CheckMissingImports:
                    missingImports = {}
                rev,date,spacecrafts = parse_Proc_Header(proc)
                
                if CheckProcHeader and SCDB['SC'] not in spacecrafts and SCDB['Spacecraft_Short_Name'] not in spacecrafts:
                    logError((80 * '*'))
                    errorsFound = True
                    if (proc,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))) not in missingSatErrorLog:
                        missingSatErrorLog.append((proc,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))))
                    logError('Error: Procedure %s is missing %s or %s in its applicable spacecrafts %s'%(proc,SCDB['SC'],SCDB['Spacecraft_Short_Name'],repr(spacecrafts)))
                    logError((80 * '*'))
                #ENDIF
                for item,lineno in missingStartProc:
                    errorsFound = True
                    logError((80 * '*'))
                    logError('Error: Procedure %s was not found in %s line %s' %(item,proc,str(lineno)))  
                    if (item,proc,lineno) not in startProcErrorLog:
                        startProcErrorLog.append((item,proc,lineno))
                    #ENDIF
                    logError((80 * '*'))
                #ENDFOR
                for item,lineno in missingImports:
                    errorsFound = True
                    logError((80 * '*'))
                    logError('Error: imported Procedure %s was not found in %s line %s' %(item,proc,str(lineno)))  
                    if (item,proc,lineno) not in importProcErrorLog:
                        importProcErrorLog.append((item,proc,lineno))
                    #ENDIF
                    logError((80 * '*'))
                    
                #ENDFOR
                if CheckMissingDict:
                    for dic,lineno in parser.referencedDict.items():
                        dic = dic.replace('usr://',InputFilesUserBasePath + '/').replace('mmd://',InputFilesMMDBasePath + '/')
                        if not os.path.isfile(dic):
                            if not os.path.isfile(dic + '.imp'):
                                errorsFound = True
                                logError((80 * '*'))
                                logError('Error: Referenced Dictionary %s was not found in %s line %s' %(dic,proc,str(lineno)))  
                                if (dic,proc,lineno) not in inputFilesErrorLog:
                                    inputFilesErrorLog.append((dic,proc,lineno))
                                #ENDIF
                                logError((80 * '*'))
                                
                            #ENDIF
                        #ENDIF
                    #ENDFOR
                #ENDIF
            #ENDIF
            if not errorsFound:
                logSuccess('No errors have been found in procedure.')
            Display((80 * '-') + '\n')

          #ENDIF    
        #ENDFOR
    #ENDFOR
    
    
    if (len(errorLog) + len(userLibErrorLog) + len(inputFilesErrorLog) + len(startProcErrorLog) + len(importProcErrorLog) + len(missingSatErrorLog) + len(faultySCDBLines) + len(faultyGDBLines) ) > 0:
        
        logError('All errros found in procedures:')
        logError((80 * '*'))
        for (item,proc,name,lineno) in errorLog:
            logError('Error: "%s" of %s was not found in %s line %s' %(item,proc,name,str(lineno)))  
            
        #ENDFOR
        if len(errorLog) > 0:
            logError((80 * '*'))
        for (item,proc,lineno) in userLibErrorLog:
            logError('Error: UserLib function "%s" was not found in %s line %s' %(item,proc,lineno))     
            
        #ENDFOR
        if len(userLibErrorLog) > 0:
            logError((80 * '*'))
        for (item,proc,lineno) in inputFilesErrorLog:
            logError('Error: Referenced Dictionary "%s" was not found in %s line %s' %(item,proc,str(lineno)))   
            
        #ENDFOR
        if len(inputFilesErrorLog) > 0:
            logError((80 * '*'))
        for (item,proc,lineno) in startProcErrorLog:
            logError('Error: Procedure "%s" was not found in %s line %s' %(item,proc,str(lineno)))  
            
        #ENDFOR
        if len(startProcErrorLog) > 0:
            logError((80 * '*'))
        for (item,proc,lineno) in importProcErrorLog:
            logError('Error: imported Procedure "%s" was not found in %s line %s' %(item,proc,str(lineno)))  
            
        #ENDFOR
        if len(importProcErrorLog) > 0:
            logError((80 * '*'))
            
        for (proc,sc,scsn,spacecrafts) in missingSatErrorLog:
            logError('Error: Procedure %s is missing %s or %s in its applicable spacecrafts (%s)'%(proc,sc,scsn,repr(spacecrafts)))
        #ENDFOR
        if len(missingSatErrorLog) > 0:
            logError((80 * '*'))    
            
        for (db_path,idx,faultyName,faultyValue) in faultySCDBLines:
            logError('Error: The SCDB %s line %s contains a key "%s" with a value "%s" that can\'t be parsed by Python.'%(db_path,idx,faultyName,faultyValue))
        #ENDFOR
        if len(faultySCDBLines) > 0:
            logError((80 * '*'))    
            
        for (db_path,idx,faultyName,faultyValue) in faultyGDBLines:
            logError('Error: The GDB %s line %s contains a key "%s" with a value "%s" that can\'t be parsed by Python.'%(db_path,idx,faultyName,faultyValue))
        #ENDFOR
        if len(faultyGDBLines) > 0:
            logError((80 * '*'))  
    else:
        print '<BOLD>'
        logSuccess('No Errors found.')  
    #ENDIF
    print '<BOLD>'
    logSuccess('Finished.')
    print '<!BOLD>'    
