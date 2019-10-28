'''

<Page>
    <Name>Deployment of Satellite Files</Name>
    <Id>Sat_Deploy</Id>
    <Option>
        <Text>Options for deployment of satellite files:</Text>
        <Type>Label</Type>
    </Option>
    <Option>
        <Type>Separator</Type>
    </Option>
</Page>
<Menu>
    <Text>SPELL Deployment Tool</Text>
    <Menu>
        <Text>Deploy files to Satellites (Automatic)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>SELECTION_ALGO|AUTO_HEADER</Option>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Deploy files to Satellites (Automatic SIM only)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>SELECTION_ALGO|AUTO_HEADER</Option>
        <Option>SIM_ONLY|True</Option>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Deploy files to Satellites (Manual)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>SELECTION_ALGO|MANUAL</Option>
        <DynamicOption>MANUAL_DIRS|utils.queryProjectList()</DynamicOption>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Delete files from Satellites (Automatic)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>DELETE_MODE|True</Option>
        <Option>SELECTION_ALGO|AUTO_HEADER</Option>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Delete files from Satellites (Automatic SIM only)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>DELETE_MODE|True</Option>
        <Option>SELECTION_ALGO|AUTO_HEADER</Option>
        <Option>SIM_ONLY|True</Option>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Delete files from Satellites (Manual)</Text>
        <Description>Deployment Tool for Satellite procedures and input files.</Description>
        <Option>SELECTION_ALGO|MANUAL</Option>
        <Option>DELETE_MODE|True</Option>
        <DynamicOption>MANUAL_DIRS|utils.queryProjectList()</DynamicOption>
        <DynamicOption>ALL_PROJECT_LIST|utils.getAllProjects()</DynamicOption>
    </Menu>
</Menu>

'''

import datetime
import sys
import time
import os
import shutil

try:
    import pysvn
except:
    pysvn = None
#ENDTRY
import stat  
WORK_DIR = os.getenv('WORK_DIR')
sys.path.insert(0, WORK_DIR)
from OPA_Utils import *



REFACTOR_SPELL = os.getenv('REFACTOR_SPELL')
if REFACTOR_SPELL:
    print  "<green><BOLD>Refactoring SPELL Procedure!"
    #print  "<green><BOLD>Please wait until all Projects have been refreshed."
    #changed_Projects = eval(OPEN_PROJECTS)
    #for project in changed_Projects:
    #    print '<|U|'+project+'|><!BOLD><black>Refreshing project '+ project+''
    #ENDFOR
    logSuccess( "<BOLD>Done!")
    sys.exit()
#ENDIF

OPEN_PROJECTS = os.getenv('OPEN_PROJECTS')
if OPEN_PROJECTS:
    print  "<green><BOLD>Opening selected SPELL Projects!"
    #print  "<green><BOLD>Please wait until all Projects have been refreshed."
    #changed_Projects = eval(OPEN_PROJECTS)
    #for project in changed_Projects:
    #    print '<|U|'+project+'|><!BOLD><black>Refreshing project '+ project+''
    #ENDFOR
    logSuccess( "<BOLD>Done!")
    sys.exit()
#ENDIF

CLOSE_PROJECTS = os.getenv('CLOSE_PROJECTS')
if CLOSE_PROJECTS:
    print  "<green><BOLD>Opening selected SPELL Projects!"
    logSuccess( "<BOLD>Done!")
    sys.exit()
#ENDIF

ALL_PROJECT_LIST = os.getenv('ALL_PROJECT_LIST')
ALL_PROJECT_LIST = eval(ALL_PROJECT_LIST)

FIX_END_TAGS = os.getenv('FIX_END_TAGS')
if FIX_END_TAGS:
    print  "<green><BOLD>SPELL end tags in selected procedures have been fixed!"
    print  "<green><BOLD>Please wait until all Projects have been refreshed."
    changed_Projects = eval(FIX_END_TAGS)
    for project in changed_Projects:
        print '<|U|'+project+'|><!BOLD><black>Refreshing project '+ project+''
    #ENDFOR
    logSuccess( "<BOLD>Done!")
    sys.exit()
#ENDIF
CREATE_WORKING_SETS = os.getenv('CREATE_WORKING_SETS')
if CREATE_WORKING_SETS:
    if 'ERROR' in CREATE_WORKING_SETS:
        print  "<red><BOLD>Workings Sets was not created successfully:"
        print CREATE_WORKING_SETS
        sys.exit()
    elif 'True' == CREATE_WORKING_SETS: 
        print  "<green><BOLD>Workings Sets have been created successfully!"
        sys.exit()
    else:
        print  "<green><BOLD>Got unknown status!"
        print CREATE_WORKING_SETS
        sys.exit()
    #ENDIF
#ENDIF
UPDATE_DATABASES= os.getenv('UPDATE_DATABASES')
if UPDATE_DATABASES:
    if 'ERROR' in UPDATE_DATABASES:
        print  "<red><BOLD>Databases have not been updated successfully:"
        print UPDATE_DATABASES
        sys.exit()
    elif 'True' == UPDATE_DATABASES: 
        print  "<green><BOLD>Databases have been updated successfully!"
        sys.exit()
    else:
        print  "<red><BOLD>Got unknown status!"
        print UPDATE_DATABASES
        sys.exit()
    #ENDIF
#ENDIF

SIM_ONLY = os.getenv('SIM_ONLY') == 'True'
DELETE_MODE = os.getenv('DELETE_MODE') == 'True'

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')
AUTOMATIC_SELECTION = os.getenv('SELECTION_ALGO') == 'AUTO_HEADER'


import compiler.ast as ast
import compiler.visitor as visitor
import compiler


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
        return [],[],[],None
#ENDDEF

MANUAL_DIRS = os.getenv('MANUAL_DIRS')
if not AUTOMATIC_SELECTION:
    if MANUAL_DIRS == None:
        sys.exit()
    MANUAL_DIRS = eval(MANUAL_DIRS)
#ENDIF
#print 'Checking for: ' + CHECK_LEVEL
def ensure_dir(f,dir_mode):
    if dir_mode:
        d = f
    else:
        d = os.path.dirname(f)
    #ENDIF
    if not os.path.exists(d):
        os.makedirs(d)
    #ENDIF
    return 
#=================================================================================
def _samefile(src, dst):
    # Macintosh, Unix.
    if hasattr(os.path, 'samefile'):
        try:
            return os.path.samefile(src, dst)
        except OSError:
            return False

    # All other platforms: check for same pathname.
    return (os.path.normcase(os.path.abspath(src)) ==
            os.path.normcase(os.path.abspath(dst))) 
def deploy_Procedure(orig_path,target_Project,dir_mode=False):
    global sourceFiles
    target_File = target_Project
    #print orig_path
    #print target_Project
    abs_Path,relative_File_Path = make_Relative_SPELL_PATH(orig_path)
    
    target_File += '\\' + relative_File_Path
    #print target_File
    if not DELETE_MODE:
        ensure_dir(target_File,dir_mode)
    #ENIF    
    try:
        if not _samefile(orig_path, target_File):
            if DELETE_MODE:
                try:
                    os.remove(target_File)
                except:
                    return False
                #ENDTRY 
                sourceFiles[orig_path] = True
            else:
                if not dir_mode:
                    shutil.copyfile(orig_path, target_File)        
                #ENDIF
            #ENDIF
        else:
            return False
        #ENDIF
        return True
    except:
        try:
            st = os.stat(target_File)
            os.chmod(target_File, st.st_mode | stat.S_IWRITE)
            if not _samefile(orig_path, target_File):
                if DELETE_MODE:
                    try:
                        os.remove(target_File)
                    except:
                        return False
                    #ENDTRY
                    sourceFiles[orig_path] = True
                else:
                    if not dir_mode:
                        shutil.copyfile(orig_path, target_File)
                    #ENDIF
                #ENDIF
                return True
            
            else:
                return False
            #ENDIF
        except:
            return False
        #ENDIF
    #ENDTRY
#=================================================================================
def is_OPS(p):
    if SIM_ONLY:
        try :
            if pysvn:
                client = pysvn.Client()
                entry = client.info(p)
                if 'branches/OPS/PROCS' in entry.url:
                    return True
                #ENDIF
                if 'branches/OPS' in entry.url and '/PROCS' in entry.url:
                    return True
                #ENDIF
            else:
                if '_OPS' in p:
                    return True
                #ENDIF
            #ENDIF
        except:
            if '_OPS' in p:
                return True
            #ENDIF
            pass
        #ENDTRY
    #ENDIF
    return False
#=================================================================================

def split_SPELL_PATH(path):
    dir_name = path
    while dir_name and not os.path.isdir(dir_name + '\\Procedures') and not dir_name == os.path.dirname(dir_name):
        dir_name = os.path.dirname(dir_name)
    dir_name,sat = os.path.split(dir_name)
    drive,dir_name = os.path.splitdrive(dir_name)
    return drive,dir_name,sat

def make_Relative_SPELL_PATH(path):
    dir_name = path
    rel_path = ''
    while dir_name and not os.path.isdir(dir_name + '\\Procedures'):
        dir_name,rel_fragment = os.path.split(dir_name)
        if rel_path:
            rel_path = rel_fragment + '\\' + rel_path
        else:
            rel_path = rel_fragment
    return dir_name,rel_path
 
if __name__ == '__main__':
    amt = os.getenv('AMOUNT_PROJECTS')
    
    allPaths = []
    for i in range(0,int(amt)):
        allPaths.append(os.getenv('FULLPATH' + str(i)))
    #ENDFOR
    refreshProjects = {}
    sourceFiles = {}
    idx = -1 
    for path in allPaths:
        idx += 1
        if AUTOMATIC_SELECTION:
            Drive, Workspace,Satellite = split_SPELL_PATH(path)
            relative_File_Path = path.split('\\')[3:]
            if not os.path.isfile(path):
                Display('<BOLD><15>        skipping ' + path + '(no Auto for directories).<black><!BOLD>') 
                continue
            else:
                procFile = path.split('\\')[-1]
                if procFile[-3:] == '.py':
                    procFile = procFile[0:-3]
                #ENDIF
                _,_,spacecrafts = parse_Proc_Header(path)
            #ENDIF
            p = Drive + '\\' + Workspace + '\\' + Satellite
            SCDB_Path = p + '\\InputFiles\\SpacecraftDB\\SCDB.DB'
            Alt_SCDB_Path = p + '\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB'
            if os.path.isfile(SCDB_Path):
                db_path = SCDB_Path
                ORIG_SCDB = loadDatabaseFile('SCDB',SCDB_Path) 
            elif os.path.isfile(Alt_SCDB_Path):
                db_path = Alt_SCDB_Path
                ORIG_SCDB = loadDatabaseFile('SCDB',Alt_SCDB_Path)
            else:
                continue
            #ENDIF
            if DELETE_MODE:
                Display('<BOLD>Deleting ' + procFile + ':<!BOLD>')
            else:
                Display('<BOLD>Deployment of ' + procFile + ':<!BOLD>')
            #ENDIF
            for projectName,p in sorted(ALL_PROJECT_LIST.iteritems()):
                #print p
                _, _,target_Sat = split_SPELL_PATH(p)
                if os.path.isfile(p):
                    continue
                else: 
                    
                    SCDB_Path = p + '\\InputFiles\\SpacecraftDB\\SCDB.DB'
                    Alt_SCDB_Path = p + '\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB'
                    try:
                        if os.path.isfile(SCDB_Path):
                            #print 'Trying ' + SCDB_Path
                            db_path = SCDB_Path
                            SCDB = loadDatabaseFile('SCDB',SCDB_Path) 
                        elif os.path.isfile(Alt_SCDB_Path):
                            #print 'Trying ' + Alt_SCDB_Path
                            db_path = Alt_SCDB_Path
                            SCDB = loadDatabaseFile('SCDB',Alt_SCDB_Path)
                        else:
                            #print 'Skipping'
                            continue
                        #ENDIF
                    except:
                        import traceback
                        traceback.print_exc()
                        
                    if 'SC' in SCDB and SCDB['SC'] in spacecrafts:
                        #print 'Try deploy to ' + SCDB['SC']
                        if is_OPS(p):
                            Display('<BOLD><15>        skipping ' + p + '(SIM Only).<black><!BOLD>') 
                            continue
                        #ENDIF
                        success = deploy_Procedure(path, p)  
                    elif 'Spacecraft_Short_Name' in SCDB and SCDB['Spacecraft_Short_Name'] in spacecrafts:
                        #print 'Try deploy to ' + SCDB['Spacecraft_Short_Name']
                        if is_OPS(p):
                            Display('<BOLD><15>        skipping ' + p + '(SIM Only).<black><!BOLD>') 
                            continue
                        #ENDIF
                        success = deploy_Procedure(path, p)
                    elif 'SC' in SCDB and 'SC' in ORIG_SCDB and SCDB['SC'] == ORIG_SCDB['SC']:
                        #print 'Try deploy to ' + SCDB['SC']
                        if is_OPS(p):
                            Display('<BOLD><15>        skipping ' + p + '(SIM Only).<black><!BOLD>') 
                            continue
                        #ENDIF
                        success = deploy_Procedure(path, p)  
                    elif 'Spacecraft_Short_Name' in SCDB and 'Spacecraft_Short_Name' in ORIG_SCDB and SCDB['Spacecraft_Short_Name'] == ORIG_SCDB['Spacecraft_Short_Name']:
                        #print 'Try deploy to ' + SCDB['Spacecraft_Short_Name']
                        if is_OPS(p):
                            Display('<BOLD><15>        skipping ' + p + '(SIM Only).<black><!BOLD>') 
                            continue
                        #ENDIF
                        success = deploy_Procedure(path, p)  
                    else:
                        success = False
                    #ENDIF
                    #print success
                    if success:
                        refreshProjects[projectName] = idx
                        if DELETE_MODE:
                            Display('<BOLD>        has been deleted from ' + p + '.<!BOLD>')
                        else:
                            Display('<BOLD>        has been deployed to ' + p + '.<!BOLD>') 
                            scdb,gdb,_,_ = parseFileAST(path)
                            for entry,lineno in scdb:
                                if entry not in SCDB.keys():
                                    Display('<BOLD><red>                SCDB entry ' + str(entry) + ' is missing from '+str(target_Sat)+'\'s SCDB (line '+str(lineno)+' in procedure).<black><!BOLD>') 
                                #ENDIF
                            #ENDFOR
                        #ENDIF
                        
                    #ENDIF
                #ENDIF
            #ENDFOR
        else:
            if not os.path.isfile(path):
                procFile = path.split('\\')[-1]
                if not procFile:
                    procFile = path.split('\\')[-2]
                #ENDIF
                dir_mode = True
            else:
                procFile = path.split('\\')[-1]
                procFile = procFile[0:-3]
                dir_mode = False
            #ENDIF
            if DELETE_MODE:
                Display('<BOLD>Deleting Procedure ' + procFile + ':<!BOLD>')
            else:
                Display('<BOLD>Deployment of Procedure ' + procFile + ':<!BOLD>')
            #ENDIF
            for targetSat in MANUAL_DIRS:
                success = deploy_Procedure(path,targetSat,dir_mode)
                if success:
                    _, _,projectName = targetSat.split('\\')[0:3]
                    refreshProjects[projectName] = idx
                    if DELETE_MODE:
                        Display('<BOLD>    has been deleted from ' + targetSat + '.<!BOLD>') 
                    else:
                        Display('<BOLD>    has been deployed to ' + targetSat + '.<!BOLD>') 
                    #ENDIF
                    
                else:
                    if DELETE_MODE:
                        Display('<BOLD><red>    could not be deleted from ' + targetSat + '.<black><!BOLD>') 
                    else:
                        Display('<BOLD><red>    could not be deployed to ' + targetSat + '.<black><!BOLD>') 
                    #ENDIF
                #ENDIF
            #ENDFOR
        #ENDIF
    #ENDFOR
   
    if DELETE_MODE:
        for sourceFile in sourceFiles.keys():
            try:
                os.remove(sourceFile)
            except:
                st = os.stat(sourceFile)
                os.chmod(sourceFile, st.st_mode | stat.S_IWRITE)
                os.remove(sourceFile)
            #ENDTRY
            Display('<BOLD>Deleting selected Procedure ' + sourceFile + '.<!BOLD>')
            _, _,projectName = sourceFile.split('\\')[0:3]
            refreshProjects[projectName] = idx
        #ENDFOR
    #ENDIF

    print '<BOLD>'
    logSuccess( "<black>Please wait until all changed Projects have been refreshed!")
    for projectName in sorted(refreshProjects.keys()):
        if 'OPS' in projectName:
            print '<|U|'+projectName+'|><!BOLD><black>Refreshing project '+ projectName+''
        elif 'SIM' in projectName:
            print '<|U|'+projectName+'|><!BOLD><black>Refreshing project '+ projectName+''
        else:
            print '<|U|'+projectName+'|><!BOLD><black>Refreshing project '+ projectName+''
            print '<|U|'+projectName+'_SIM|><!BOLD><black>Refreshing project '+ projectName+'_SIM'
        #ENDIF
       
    #ENDFOR
    logSuccess( "<BOLD>Done!")
    print '<!BOLD>'
#ENDIF

