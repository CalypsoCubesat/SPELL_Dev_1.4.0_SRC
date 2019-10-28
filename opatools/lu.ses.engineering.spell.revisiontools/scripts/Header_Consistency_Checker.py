'''
# <Page>
#     <Name>Test Page</Name>
#     <Id>Header_Con_check</Id>
#     <Option>
#         <Text>Test Label:</Text>
#         <Type>Label</Type>
#     </Option>
#     <Option>
#         <Type>Separator</Type>
#     </Option>
#     <Option>
#         <Name>TestSCDBEntries</Name>
#         <Text>Check for missing SCDb entries.</Text>
#         <Type>Boolean</Type>
#         <Default>true</Default>
#     </Option> 
#     <Option>
#         <Name>StringTestOption</Name>
#         <Text>Sets the String TestOption.</Text>
#         <Type>String</Type>
#         <Default>empty</Default>
#     </Option> 
#     <Option>
#         <Name>RadioOption</Name>
#         <Text>Sets the String TestOption.</Text>
#         <Type>Radio</Type>
#         <Default>empty</Default>
#         <Value>empty</Value>
#         <Value>v1</Value>
#         <Value>v2</Value>
#         <Value>v3</Value>
#     </Option>  
#     <Option>
#         <Name>ComboOption</Name>
#         <Text>Sets the String ComboOption.</Text>
#         <Type>Combo</Type>
#         <Default>empty</Default>
#         <Value>empty:0</Value>
#         <Value>v1:1</Value>
#         <Value>v2:2</Value>
#         <Value>v3:3</Value>
#     </Option> 
#     <Option>
#         <Name>ListOption</Name>
#         <Text>Sets the ListOption.</Text>
#         <Type>List</Type>
#         <Default>1|2|3|4</Default>
#     </Option>    
#     <Option>
#         <Name>FileListOption</Name>
#         <Text>Sets the File ListOption.</Text>
#         <Type>List</Type>
#         <SubType>File</SubType>
#     </Option>    
# </Page>

'''

import datetime, csv
import os
import compiler.ast as ast
import compiler.visitor as visitor
import compiler
import re
import pkgutil
import inspect
import stat
import sys

WORK_DIR = os.getenv('WORK_DIR')

sys.path.insert(0, WORK_DIR)
from OPA_Utils import *

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')
CORRECT_ERRORS = os.getenv('CORRECT_ERRORS') == 'True'


def refactor_Proc_Header_SC(filepath):
    '''
    This function parses the procedure header and returns a list. This list contains the revision number and the date of the revision.
    '''
    try:
        current_Proc = open(filepath) 
        in_Header = False
        header = []
        lines = current_Proc.readlines()
        idx = -1
        #Display('Refactoring ' + filepath)
        for line in lines:
            idx += 1
            if line.startswith('# SPACECRAFT'):
                current_Proc.close()
                return (idx,lines)
            #ENDIF line start with '# '.
            if line.startswith('# SATELLITE'):
                current_Proc.close()
                return (idx,lines)
            #ENDIF line start with '# '.
        #ENDFOR lineNo
        current_Proc.close()
        return (-1,None)
    except:
        current_Proc.close()
        return (-1,None)
    #ENDTRY
#ENDDEF

def refactor_Proc_Header_FileName(filepath):
    '''
    This function parses the procedure header and returns a list. This list contains the revision number and the date of the revision.
    '''
    try:
        current_Proc = open(filepath) 
        in_Header = False
        header = []
        lines = current_Proc.readlines()
        idx = -1
        #Display('Refactoring ' + filepath)
        for line in lines:
            idx += 1
            if line.startswith('# NAME'):
                procName = line.split(':',1)[1].strip()
                
                current_Proc.close()
                return (idx,procName,lines)
            #ENDIF line start with '# '.
        #ENDFOR lineNo
        current_Proc.close()
        return (-1,None,None)
    except:
        current_Proc.close()
        return (-1,None,None)
    #ENDTRY
#ENDDEF

if __name__ == '__main__':
    amt = os.getenv('AMOUNT_PROJECTS')
    
    allPaths = []
    for i in range(0,int(amt)):
        allPaths.append(os.getenv('FULLPATH' + str(i)))
    #ENDFOR
    comparison_Result = {}
    
    Procedures = {}
    Conflicting_Procedures = []
    
    for Folder in allPaths:
   
        Drive, Workspace,Satellite = Folder.split('\\')[0:3]

        SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SpacecraftDB\\SCDB.DB'
        Alt_SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB'
        
        if os.path.isfile(SCDB_Path):
            SCDB = loadDatabaseFile('SCDB',SCDB_Path) 
        else:
            SCDB = loadDatabaseFile('SCDB',Alt_SCDB_Path)
        #ENDDEF
        
        missingSatErrorLog = []
        missingProcNameLog = []
        malformedHeaderErrorLog = []
        if os.path.isdir(Folder):
            for dirname, dirnames, f in os.walk(Folder):
                if '.svn' in dirname:
                    continue
                #ENDIF
                if '\\SAE_Comments' in dirname or '\\TEST' in dirname or '\\Test' in dirname or '\\Regression' in dirname or '/SAE_Comments' in dirname or '/TEST' in dirname or '/Test' in dirname or '/Regression' in dirname:
                    continue
                #ENDIF
                for procFile in f:
                    if procFile[0] == '.':
                        continue
                    #ENDIF
                    if not procFile[-3:] =='.py' and not procFile[-3:] =='.DB'  :
                        continue
                    #ENDIF
                    procExt = procFile[-3:]
                    procFile = procFile[0:-3]
                    revision,date,spacecrafts =parse_Proc_Header(dirname + '\\' + procFile + procExt)
                    fixSCDB(SCDB)
                    idx,headerName,lines = refactor_Proc_Header_FileName(dirname + '\\' + procFile + procExt)
                    if CORRECT_ERRORS:
                        if idx == -1:
                            if procExt != '.DB' and (dirname + '\\' + procFile + procExt,'procedure NAME') not in malformedHeaderErrorLog:
                                malformedHeaderErrorLog.append((dirname + '\\' + procFile + procExt,'procedure NAME'))
                            #ENDIF
                        elif idx != -1 and headerName != procFile:
                            line = lines[idx]
                            if line[-2] == '\r':
                                lines[idx] = line.split(':',1)[0] + ':' + ' ' + procFile +'\r\n'
                            else:
                                lines[idx] = line.split(':',1)[0] + ':' + ' ' + procFile + '\n'
                            #ENDIF
                            if (dirname + '\\' + procFile + procExt,headerName,procFile) not in missingProcNameLog:
                                missingProcNameLog.append((dirname + '\\' + procFile + procExt,headerName,procFile))
                            #ENDIF
                        #ENDIF
                    else:
                        if idx == -1:
                            if procExt != '.DB' and (dirname + '\\' + procFile + procExt,'procedure NAME') not in malformedHeaderErrorLog:
                                malformedHeaderErrorLog.append((dirname + '\\' + procFile + procExt,'procedure NAME'))
                            #ENDIF
                        elif idx != -1 and headerName != procFile:
                            if (dirname + '\\' + procFile + procExt,headerName,procFile) not in missingProcNameLog:
                                missingProcNameLog.append((dirname + '\\' + procFile + procExt,headerName,procFile))
                            #ENDIF
                        #ENDIF
                    #ENDIF
                    if not SCDB['SC'] in spacecrafts and SCDB['Spacecraft_Short_Name'] not in spacecrafts:
                        if CORRECT_ERRORS:
                            idx,_ = refactor_Proc_Header_SC(dirname + '\\' + procFile + procExt)
                            if idx == -1:
                                if (dirname + '\\' + procFile + procExt,'satellite or spacecraft') not in malformedHeaderErrorLog:
                                    malformedHeaderErrorLog.append((dirname + '\\' + procFile + procExt,'satellite or spacecraft'))
                                #ENDIF
                           
                            else:
                                scName = SCDB['SC']
                                line = lines[idx]
                                #print line
                                if line.strip()[-1] == ',':
                                    if line[-2] == '\r':
                                        lines[idx] = lines[idx].strip() + ' '+ scName + '\r\n'
                                    else:
                                        lines[idx] = lines[idx].strip() + ' '+ scName + '\n'
                                    #ENDIF
                                else:
                                    if line[-2] == '\r':
                                        lines[idx] = lines[idx].strip() + ', ' +scName + '\r\n'
                                    else:
                                        lines[idx] = lines[idx].strip() + ', ' +scName + '\n'
                                    #ENDIF
                                #ENDIF
                                try:
                                    fileAtt = os.stat(dirname + '\\' + procFile + procExt)[0]
                                    resetReadOnly = False
                                    if (not fileAtt & stat.S_IWRITE):
                                        # File is read-only, so make it writeable
                                        resetReadOnly = True
                                        os.chmod(dirname + '\\' + procFile + procExt, stat.S_IWRITE)
                                    #ENDIF
                                    current_Proc = open(dirname + '\\' + procFile + procExt,'w') 
                                    for line in lines:
                                        current_Proc.write(line)
                                    #ENDFOR
                                    current_Proc.close()
                                    if resetReadOnly:
                                        os.chmod(dirname + '\\' + procFile + procExt, stat.S_IREAD)
                                    #ENDIF
                                except:
                                    raise
                                #ENDTRY
                            #ENDIF
                        #ENDIF
                        idx,_ = refactor_Proc_Header_SC(dirname + '\\' + procFile + procExt)
                        if idx == -1:
                            if (dirname + '\\' + procFile + procExt,'satellite or spacecraft') not in malformedHeaderErrorLog:
                                malformedHeaderErrorLog.append((dirname + '\\' + procFile + procExt,'satellite or spacecraft'))
                            #ENDIF                       
                        else:
                            if (dirname + '\\' + procFile + procExt,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))) not in missingSatErrorLog:
                                missingSatErrorLog.append((dirname + '\\' + procFile + procExt,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))))
                            #ENDIF
                        #ENDIF
                    #ENDIF
                #ENDFOR
            #ENDIF
        else:
            procFile = Folder.split('\\')[-1]
            procFile = procFile[0:-3]
            revision,date,spacecrafts =parse_Proc_Header(Folder)
            fixSCDB(SCDB)
            idx,headerName,lines = refactor_Proc_Header_FileName(Folder)
            if CORRECT_ERRORS:
                if idx == -1:
                    if (Folder,'procedure NAME') not in malformedHeaderErrorLog:
                        malformedHeaderErrorLog.append((Folder,'procedure NAME'))
                    #ENDIF
                elif idx != -1 and headerName != procFile:
                    line = lines[idx]
                    if line[-2] == '\r':
                        lines[idx] = line.split(':',1)[0] + ':' + ' ' + procFile +'\r\n'
                    else:
                        lines[idx] = line.split(':',1)[0] + ':' + ' ' + procFile + '\n'
                    #ENDIF
                    if (Folder,headerName,procFile) not in missingProcNameLog:
                        missingProcNameLog.append((Folder,headerName,procFile))
                    #ENDIF
                #ENDIF
            else:
                if idx == -1:
                    if (Folder,'procedure NAME') not in malformedHeaderErrorLog:
                        malformedHeaderErrorLog.append((Folder,'procedure NAME'))
                    #ENDIF
                elif idx != -1 and headerName != procFile:
                    if (Folder,headerName,procFile) not in missingProcNameLog:
                        missingProcNameLog.append((Folder,headerName,procFile))
                    #ENDIF
                #ENDIF
            #ENDIF
            if not SCDB['SC'] in spacecrafts and SCDB['Spacecraft_Short_Name'] not in spacecrafts:
                if CORRECT_ERRORS:
                    idx,_ = refactor_Proc_Header_SC(Folder)
                    if idx == -1:
                        if (Folder,'satellite or spacecraft') not in malformedHeaderErrorLog:
                            malformedHeaderErrorLog.append((Folder,'satellite or spacecraft'))
                        #ENDIF
                   
                    else:
                        scName = SCDB['SC']
                        line = lines[idx]
                        #print line
                        if line.strip()[-1] == ',':
                            if line[-2] == '\r':
                                lines[idx] = lines[idx].strip() + ' '+ scName + '\r\n'
                            else:
                                lines[idx] = lines[idx].strip() + ' '+ scName + '\n'
                            #ENDIF
                        else:
                            if line[-2] == '\r':
                                lines[idx] = lines[idx].strip() + ', ' +scName + '\r\n'
                            else:
                                lines[idx] = lines[idx].strip() + ', ' +scName + '\n'
                            #ENDIF
                        #ENDIF
                        try:
                            fileAtt = os.stat(Folder)[0]
                            resetReadOnly = False
                            if (not fileAtt & stat.S_IWRITE):
                                # File is read-only, so make it writeable
                                resetReadOnly = True
                                os.chmod(Folder, stat.S_IWRITE)
                            #ENDIF
                            current_Proc = open(Folder,'w') 
                            for line in lines:
                                current_Proc.write(line)
                            #ENDFOR
                            current_Proc.close()
                            if resetReadOnly:
                                os.chmod(Folder, stat.S_IREAD)
                            #ENDIF
                        except:
                            raise
                        #ENDTRY
                    #ENDIF
                #ENDIF
                idx,_ = refactor_Proc_Header_SC(Folder)
                if idx == -1:
                    if (Folder,'satellite or spacecraft') not in malformedHeaderErrorLog:
                        malformedHeaderErrorLog.append((Folder,'satellite or spacecraft'))
                    #ENDIF                       
                else:
                    if (Folder,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))) not in missingSatErrorLog:
                        missingSatErrorLog.append((Folder,SCDB['SC'],SCDB['Spacecraft_Short_Name'],list(set(spacecrafts))))
                    #ENDIF
                #ENDIF
            #ENDIF
        #ENDIF
    #ENDFOR
    
    #print Procedures
    #print Conflicting_Procedures
    if (len(missingSatErrorLog) + len(malformedHeaderErrorLog) + len(missingProcNameLog)) > 0:
        
        logError('All errros found in procedures:')
        logError((80 * '*'))
            
        for (proc,sc,scsn,spacecrafts) in missingSatErrorLog:
            if CORRECT_ERRORS:
                logError('Fixed: Procedure %s is missing %s or %s in its applicable spacecrafts (%s)'%(proc,sc,scsn,repr(spacecrafts)))
            else:
                logError('Error: Procedure %s is missing %s or %s in its applicable spacecrafts (%s)'%(proc,sc,scsn,repr(spacecrafts)))
            #ENDIF
        #ENDFOR
        if len(missingSatErrorLog) > 0:
            logError((80 * '*'))   
        #ENDIF
        
        for (proc,headerType) in malformedHeaderErrorLog:
            logError('Error: Procedures %s header is malformed. Could not find entry for %s!'%(proc,headerType))
        #ENDFOR
        if len(malformedHeaderErrorLog) > 0:
            logError((80 * '*'))   
        #ENDIF

        for (proc,headerName,realName) in missingProcNameLog:
            if CORRECT_ERRORS:
                logError('Fixed: Procedures %s header is malformed. Name entry in header is %s but should be %s!'%(proc,headerName,realName))
            else:
                logError('Error: Procedures %s header is malformed. Name entry in header is %s but should be %s!'%(proc,headerName,realName))
        #ENDFOR
        if len(missingProcNameLog) > 0:
            logError((80 * '*'))   
        #ENDIF
            
    else:
        print '<BOLD>'
        logSuccess('No errors have beeen found.')
    #ENDIF
    print '<BOLD>'
    logSuccess( "Done!")
    print '<!BOLD>'
#ENDIF

