'''
Created on May 16, 2014

@author: akerch

Preference Page Setup:

<Page>
    <Name>Refactor Procedure Header</Name>
    <Id>Refactor_Procedure_Header</Id>
    <Option>
        <Text>Refactor Procedure Header Options:</Text>
        <Type>Label</Type>
    </Option>
    <Option>
        <Type>Separator</Type>
    </Option>
    <Option>
        <Name>HEADER_ENTRIES</Name>
        <Text>All entries for a standardized Header.</Text>
        <Type>List</Type>
        <Default>################################################################################|
#|
# NAME          : %(NAME;locals.ProcName)s|
# DESCRIPTION   : %(DESCRIPTION;IMPORTANT NOTE)s|
# FILE          : %(FILE;locals.FileName)s|
# SPACECRAFT    : %(SPACECRAFT;SATELLITE;SCDB.SC)s|
# SPECIFICATION : %(SPECIFICATION;default:Not Available)s|
# HISTORY       : %(HISTORY;REVISION HISTORY;default:\n
#\n
# DATE           REV    AUTHOR       DESCRIPTION \n
# ===========    ===    =========    ===========================================\n#\n#\n#\n################################################################################)s</Default>
    </Option>    
</Page>

'''
import datetime, csv, os
import re
import pkgutil
import inspect
import os
import sys
import stat
import collections
WORK_DIR = os.getenv('WORK_DIR')

sys.path.insert(0, WORK_DIR)
from OPA_Utils import *

HEADER_ENTRIES = os.getenv('HEADER_ENTRIES')
if HEADER_ENTRIES == None:
    HEADER_ENTRIES = ['################################################################################',
                      '#',
                      '# NAME          : %(NAME;locals.ProcName)s',
                      '# DESCRIPTION   : %(DESCRIPTION;IMPORTANT NOTE)s',
                      '# FILE          : %(FILE;locals.FileName)s',
                      '# SPACECRAFT    : %(SPACECRAFT;SATELLITE;SCDB.SC)s',
                      '# SPECIFICATION : %(SPECIFICATION;default:Not Available)s',
                      '# HISTORY       : %(HISTORY;REVISION HISTORY;default:\n#\n# DATE           REV    AUTHOR       DESCRIPTION \n# ===========    ===    =========    ===========================================\n#\n#\n#\n################################################################################)s'
                     ]
else:
    HEADER_ENTRIES = HEADER_ENTRIES.split('|')
#ENDIF

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')

class FormattingDict(collections.defaultdict):
    def __init__(self,prefix):
        super(collections.defaultdict,self).__init__()
        self.__prefix = prefix
        return
    def __missing__(self,key):
        return ''
    def __getitem__(self, *args, **kwargs):
        key = args[0]
        keys = key.split(';')
        for key in keys:
            #print 'test ' + key
            if key.startswith(self.__prefix):
                if collections.defaultdict.__getitem__(self, key):
                    #print 'val ' + collections.defaultdict.__getitem__(self, key)
                    return collections.defaultdict.__getitem__(self, key)
                #ENDIF
            #ENDIF
        #ENDFOR
        #print 'val None'
        return '%(' + args[0] + ')s'    
#ENDCLASS

class DefaultDict(collections.defaultdict):
    def __init__(self):
        super(collections.defaultdict,self).__init__()
        return
    def __missing__(self,key):
        return ''
    def __getitem__(self, *args, **kwargs):
        key = args[0]
        keys = key.split(';')
        for key in keys:
            if key.startswith('default:'):
                return key[8:]
            #ENDIF
        #ENDFOR
        #print 'val None'
        return ''    
#ENDCLASS


#=======================================================================

class HeaderClass(collections.defaultdict):
    def __init__(self):
        super(collections.defaultdict,self).__init__()
        self.__header = []
        self.__lastId = None
        return
    def __missing__(self,key):
        return ''
    def getHeaderLines(self):
        return self.__header
    def parseHeaderLine(self,line):
        if not line.strip():
            return True
        if line[0] != '#':
            return False
        self.getHeaderLines().append(line)
        match = re.search('#\\s{0,6}(?P<identifier>\\w(\\w|\\s)*)\\s*:', line)
        if match:
            newId = match.group('identifier')
            
            if len(line[:line.index(':')-1].strip()) < 21:
                self.__lastId = newId.strip()
                
                line = line[line.index(':')+1:].lstrip(' ')
                
                self[newId.strip()] = line
                #print 'new  ' + str(newId) + ' = ' + str(line)
            elif self.__lastId:
                self[self.__lastId] += line
            #ENDIF
        elif self.__lastId:
            self[self.__lastId] += line
            #print 'addTo ' +  str(self.__lastId) + ' = ' + str(line)
        else:
            pass
        #ENDIF    
        return True
    def addFormattedHeaderLine(self,line,*args):
        formattedLine = line
        for arg in args:
            formattedLine = formattedLine%(arg)
        #ENDFOR
        formattedLine = formattedLine%(DefaultDict())
        self.__header += [formattedLine.replace('\\n','\n')]
    def __getitem__(self, *args, **kwargs):
        key = args[0]
        keys = key.split(';')
        for key in keys:
            #print 'test ' + key
            if collections.defaultdict.__getitem__(self, key):
                #print 'val ' + collections.defaultdict.__getitem__(self, key)
                return collections.defaultdict.__getitem__(self, key)
        #ENDFOR
        #print 'val None'
        return '%(' + args[0] + ')s' 
#ENDCLASS
#=======================================================================

def createDict(prefix,dictionary):
    newDictionary = FormattingDict(prefix)
    for key in dictionary.keys():
        newDictionary[prefix + key] = dictionary[key]
    #ENDFOR
    return newDictionary
#=======================================================================
def parseOldHeader(fileName):
    fd = open(fileName)
    lineNum = 0
    header = HeaderClass()
    for line in fd:
        if not header.parseHeaderLine(line):
            break;
        lineNum += 1
    #ENDFOR
    fd.close()
    return header,lineNum-1
#=======================================================================
def addLinesToNewHeader(fileName,newHeader,skip):
    fd = open(fileName)

    for line in fd.readlines():
        if skip >= 0:
            skip -= 1
        else:
            newHeader.getHeaderLines().append(line)
        #ENDIF
    #ENDFOR
    fd.close()
    return newHeader.getHeaderLines()
#=======================================================================

def writeLinesToFile(fileName,lines):
    os.chmod(fileName, stat.S_IWRITE)
    fd = open(fileName,'w')
    
    for line in lines:
        if line[-1] == '\n':
            fd.write(line)
        else:
            fd.write(line + '\n')
        #ENDIF
    #ENDFOR
    fd.close()
    return
#=======================================================================

if __name__ == '__main__':
    global ProcName 
    global FileName 
    amt = os.getenv('AMOUNT_PROJECTS')
    
    allPaths = []
    for i in range(0,int(amt)):
        allPaths.append(os.getenv('FULLPATH' + str(i)))
    #ENDFOR

    for Folder in allPaths:
   
        Drive, Workspace,Satellite = Folder.split('\\')[0:3]

        SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SpacecraftDB\\SCDB.DB'
        Alt_SCDB_Path = os.path.join(Drive + '\\', Workspace,Satellite) + '\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB'
        
        if os.path.isfile(SCDB_Path):
            SCDB = loadDatabaseFile('SCDB',SCDB_Path) 
        else:
            SCDB = loadDatabaseFile('SCDB',Alt_SCDB_Path)
        #ENDDEF
        fixSCDB(SCDB)
        SCDB = createDict('SCDB.',SCDB)

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
                    if not procFile[-3:] =='.py' and not procFile[-3:] =='.DB' and not procFile[-3:] =='.db' and not procFile[-3:] =='.imp' and not procFile[-3:] =='.IMP'  :
                        continue
                    #ENDIF
                    procExt = procFile[-3:]
                    procFile = procFile[0:-3]

                    oldHeader,lastLine = parseOldHeader(dirname + '\\' + procFile + procExt)
                    
                    newHeader = HeaderClass()
                    
                    ProcName = procFile

                    FileName = procFile + procExt
                    
                    for entry in HEADER_ENTRIES:
                        newHeader.addFormattedHeaderLine(entry,oldHeader,SCDB,createDict('locals.',globals()))
                    #ENDFOR

                    fileLines = addLinesToNewHeader(dirname + '\\' + procFile + procExt,newHeader,lastLine)
                    
                    writeLinesToFile(dirname + '\\' + procFile + procExt,fileLines)
                #ENDFOR
            #ENDIF
        else:
            procFile = Folder.split('\\')[-1]
            FileName = procFile
            procFile = procFile[0:-3]
            
            oldHeader,lastLine =parseOldHeader(Folder)
             
            newHeader = HeaderClass()
            ProcName = procFile
            for entry in HEADER_ENTRIES:
                newHeader.addFormattedHeaderLine(entry,oldHeader,SCDB,createDict('locals.',globals()))
            #ENDFOR
            
            fileLines = addLinesToNewHeader(Folder,newHeader,lastLine)
            
            writeLinesToFile(Folder,fileLines)
        #ENDIF
    #ENDFOR
#ENDIF
print '<BOLD>'
logSuccess('Finished.')
print '<!BOLD>'    
