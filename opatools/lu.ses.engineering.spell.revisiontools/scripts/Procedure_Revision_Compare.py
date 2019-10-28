'''

<Page>
    <Name>Spell Revision Compare</Name>
    <Id>Spell_Rev_Compare</Id>
    <Option>
        <Text>Options for Spell Revision Compare:</Text>
        <Type>Label</Type>
    </Option>
    <Option>
        <Type>Separator</Type>
    </Option>
    <Option>
        <Name>CHECK_LEVEL</Name>
        <Text>Select the thoroughness for the checks:</Text>
        <Type>Radio</Type>
        <Value>Check for Revision:REV</Value>
        <Value>Check for Revision and Date:REVDATE</Value>
        <Value>Check for Revision, Date, and Content:REVDATECONTENT</Value>
    </Option>    
</Page>

'''

import datetime
import sys
import time
import os
WORK_DIR = os.getenv('WORK_DIR')
sys.path.insert(0, WORK_DIR)
from OPA_Utils import *

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')
CHECK_LEVEL = os.getenv('CHECK_LEVEL')
#print 'Checking for: ' + CHECK_LEVEL
if CHECK_LEVEL == None:
    CHECK_LEVEL = 'REV'

def addProc(spacecraft,procName,procPath,rev,date,applicableSpacecrafts,skip):
    global Procedures
    if not spacecraft in Procedures:
        Procedures[spacecraft] = {}
        
    if not procName in Procedures[spacecraft]:
        if spacecraft in applicableSpacecrafts:
            Procedures[spacecraft][procName] = [(rev,date,applicableSpacecrafts,procPath)]
        #ENDIF
        if not skip:
            for sc in applicableSpacecrafts:
                addProc(sc,procName,procPath,rev,date,applicableSpacecrafts,True)
            #ENDFOR
        #ENDIF
    else:
        newRevision,newDate,spacecrafts,newProcPath = Procedures[spacecraft][procName][0]
        procList = Procedures[spacecraft][procName]
        
        if ParseRevision(rev) > ParseRevision(newRevision):
            # new revision found this might be a problem
            if spacecraft in applicableSpacecrafts:
                Procedures[spacecraft][procName] = [(rev,date,applicableSpacecrafts,procPath)]
            #ENDIF
            for (newRevision,newDate,spacecrafts,newProcPath) in procList:
                if not (procName,newProcPath,newRevision,newDate,spacecrafts) in Conflicting_Procedures:
                    Conflicting_Procedures.append((procName,newProcPath,newRevision,newDate,spacecrafts))
                #ENDIF
            #ENDFOR
            if not skip:
                for sc in applicableSpacecrafts:
                    addProc(sc,procName,procPath,rev,date,applicableSpacecrafts,True)
                #ENDFOR
            #ENDIF
        elif ParseRevision(rev) < ParseRevision(newRevision):
            #older revision found might also be a problem
            if not (procName,procPath,rev,date,spacecrafts) in Conflicting_Procedures:
                Conflicting_Procedures.append((procName,procPath,rev,date,spacecrafts))
            #ENDIF
        else:
            if 'DATE' in CHECK_LEVEL and CompareDate(date,newDate) > 0:
                # new revision found this might be a problem
                if spacecraft in applicableSpacecrafts:
                    Procedures[spacecraft][procName] = [(rev,date,applicableSpacecrafts,procPath)]
                #ENDIF
                for (newRevision,newDate,spacecrafts,newProcPath) in procList:
                    if not (procName,newProcPath,newRevision,newDate,spacecrafts) in Conflicting_Procedures:
                        Conflicting_Procedures.append((procName,newProcPath,newRevision,newDate,spacecrafts))
                    #ENDIF
                #ENDFOR
                if not skip:
                    for sc in applicableSpacecrafts:
                        addProc(sc,procName,procPath,rev,date,applicableSpacecrafts,True)
                    #ENDFOR
                #ENDIF
            elif 'DATE' in CHECK_LEVEL and CompareDate(date,newDate) < 0:
                if not (procName,procPath,rev,date,spacecrafts) in Conflicting_Procedures:
                    Conflicting_Procedures.append((procName,procPath,rev,date,spacecrafts))
                #ENDIF
            else:
                fileMap = {}
                index = getHashforFile(procPath)
                newIndex = getHashforFile(newProcPath)
                if 'CONTENT' in CHECK_LEVEL and index != newIndex:
                    lastModDate = time.ctime(os.path.getmtime(procPath))
                    newLastModDate = time.ctime(os.path.getmtime(newProcPath))
                    if lastModDate > newLastModDate:
                        # new revision found this might be a problem
                        procList = Procedures[spacecraft][procName]
                        
                        if spacecraft in applicableSpacecrafts:
                            Procedures[spacecraft][procName] = [(rev,date,applicableSpacecrafts,procPath)]
                        #ENDIF
                        for (newRevision,newDate,spacecrafts,newProcPath) in procList:
                            if not (procName,newProcPath,newRevision,newDate,spacecrafts) in Conflicting_Procedures:
                                Conflicting_Procedures.append((procName,newProcPath,newRevision,newDate,spacecrafts))
                            #ENDIF
                        #ENDFOR
                        if not skip:
                            for sc in applicableSpacecrafts:
                                addProc(sc,procName,procPath,rev,date,applicableSpacecrafts,True)
                            #ENDFOR
                        #ENDIF
                    else:
                        if not (procName,procPath,rev,date,spacecrafts) in Conflicting_Procedures:
                            Conflicting_Procedures.append((procName,procPath,rev,date,spacecrafts))
                        #ENDIF 
                    #ENDIF
                else:
                    Procedures[spacecraft][procName].append((rev,date,applicableSpacecrafts,procPath))
                #ENDIF
            #ENDIF
        #ENDIF
    #ENDIF
#ENDDEF

def CompareDate(a,b):
    try:
        cmpA = datetime.datetime.strptime(a,"%d-%b-%Y")
    except:
        cmpA = None
    #ENDTRY
    try:
        cmpB = datetime.datetime.strptime(b,"%d-%b-%Y")
    except:
        cmpB = None
    #ENDTRY
    if cmpA == cmpB:
        return 0
    if cmpA == None:
        return -1
    if cmpB == None:
        return 1
    if cmpA < cmpB:
        return -1
    return 1
    
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
                    addProc(Satellite,procFile,dirname + '\\' + procFile + procExt,revision,date,spacecrafts,False)
                #ENDFOR
            #ENDIF
        else:
            procFile = Folder.split('\\')[-1]
            procFile = procFile[0:-3]
            revision,date,spacecrafts =parse_Proc_Header(Folder)
            addProc(Satellite,procFile,Folder,revision,date,spacecrafts,False)
        #ENDIF
    #ENDFOR
    handledProcs = {}
    conflictProcsMap = {}
    for procName,procPath,rev,date,spacecrafts in Conflicting_Procedures:
        for sc in spacecrafts:
            if not sc in conflictProcsMap:
                conflictProcsMap[sc] = {}
            #ENDIF
            if not procName in conflictProcsMap[sc]:
                conflictProcsMap[sc][procName] = []
            #ENDIF
            if not (procPath,rev,date) in conflictProcsMap[sc][procName]:
                conflictProcsMap[sc][procName].append((procPath,rev,date))
            #ENDIF
        #ENDFOR
    #ENDFOR
    for procName,procPath,rev,date,spacecrafts in Conflicting_Procedures:
        skip = False
        for sc in spacecrafts:
            if sc in handledProcs and procName in handledProcs[sc]:
                skip = True
                break
            #ENDIF
        #ENDIF
        if skip:
            continue
        allConflictingProcs = conflictProcsMap[spacecrafts[0]][procName]
        if spacecrafts[0] not in handledProcs:
            handledProcs[spacecrafts[0]] = set()
        handledProcs[spacecrafts[0]].add(procName)
        
        setOutput('BOLD')
        Display('Procedure ' + procName + ' was found with different Revisions:')
        setOutput('!BOLD')
        fileMap = {}
        for (procPath,rev,date) in allConflictingProcs:
            color = getProcType(procPath)
            index = getFileIndex(procPath,fileMap,lambda val:(' ' * (9 - len(val))) + str(val))
            logError(index + ' <BOLD>' + color + rev + ' <ITALIC>' + date + '<resetFont><darkRed> in File ' + procPath)
            
        #ENDFOR
        setOutput('BOLD')
        Display('    Latest revision found:')
        setOutput('!BOLD')
        #fileMap = {}

        for sc in spacecrafts:
            for (curRev,curDate,_,procFile) in Procedures[sc][procName]:
                if (procFile,curRev,curDate) in allConflictingProcs:
                    continue
                #ENDIF
                if procFile in handledProcs:
                    continue
                #ENDIF
                color = getProcType(procFile)
                handledProcs[procFile] = procFile
                index = getFileIndex(procFile,fileMap,lambda val:(' ' * (9 - len(val))) + str(val))
                logError(index + ' <BOLD>' + color + curRev + ' <ITALIC>' + curDate + '<resetFont><darkRed> in File ' + procFile)
            #ENDFOR
        #ENDFOR
        Display( '*'*120)
    #ENDFOR
    
    #print Procedures
    #print Conflicting_Procedures
    print '<BOLD>'
    logSuccess( "Done!")
    print '<!BOLD>'
#ENDIF

