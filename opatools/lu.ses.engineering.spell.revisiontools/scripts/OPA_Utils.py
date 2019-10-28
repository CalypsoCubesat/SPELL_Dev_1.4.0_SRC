
import datetime, csv, os
import hashlib
import compiler.ast as ast
import compiler.visitor as visitor
import compiler
import re
import pkgutil
import inspect

USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')

def fixSCDB(SCDB):
    if 'SC' not in SCDB and 'Spacecraft_Short_Name' in SCDB:
        SCDB['SC'] = SCDB['Spacecraft_Short_Name']
    elif 'Spacecraft_Short_Name' not in SCDB and 'SC' in SCDB:
        SCDB['Spacecraft_Short_Name'] = SCDB['SC']
    elif 'SC' not in SCDB and 'Spacecraft_Short_Name' not in SCDB:
        SCDB['SC'] = 'UNK'
        SCDB['Spacecraft_Short_Name'] = 'UNK'
    #ENDIF
    return SCDB
#ENDDEF

def Display(s):
    if USE_EXTERNAL_FORMATTER == 'True':
        print '<black>'
        print s
    else:
        sys.stderr.flush()
        sys.stdout.write(s+'\n')
        sys.stdout.flush()
    return
#ENDDEF

def logError(e):
    if USE_EXTERNAL_FORMATTER == 'True':
        print '<red>'
        print e
    else:
        sys.stdout.flush()
        sys.stderr.write(s+'\n')
        sys.stderr.flush()
    #ENDIF
    return
#ENDDEF

def logSuccess(s):
    if USE_EXTERNAL_FORMATTER == 'True':
        print '<green>'
        print s
    else:
        sys.stderr.flush()
        sys.stdout.write(s+'\n')
        sys.stdout.flush()
    return
#ENDDEF

def setOutput(color):
    if USE_EXTERNAL_FORMATTER == 'True' and color in ['black','green','red','BOLD','!BOLD','ITALIC','!ITALIC','resetFont']:
        print '<' + color +'>'
#ENDDEF


def prompt_Yes_No(question):
    '''
    This function returns a boolean corresponding to whether the operator chose Yes or No as an answer.
    '''
    ans = ''
    while ans.upper() not in ['Y', 'N']:
        if ans != '':
            logError('Invalid answer.')
        #ENDIF
        setOutput('black')
        ans = raw_input(question + '\nEnter Y or N:\t')
    #ENDWHILE
    return ans.upper() == 'Y'
#ENDDEF

def getHashforFile(procFile):
    content = ''
    current_Proc = open(procFile)
    for line in current_Proc.readlines():
        content += line + '\n'
    #ENDFOR
    current_Proc.close()
    return hashlib.sha224(content).hexdigest()
#ENDDEF

GLOBAL_ID = 0

def getFileIndex(procFile,fileMap,prefix=None):
    global GLOBAL_ID
    if prefix == None:
        prefix = lambda val: 'v' + str(val)
    #ENDIF
    fileHash = getHashforFile(procFile)
    if 'global_id' not in fileMap:
        global_id = GLOBAL_ID
        fileMap['global_id'] = global_id
        GLOBAL_ID += 1
    else: 
        global_id = fileMap['global_id']
    #ENDIF 
    if fileHash in fileMap:
        return '<|cmp|'  + prefix ( str(fileMap[fileHash])) + '|id' + str(global_id) + '|' + procFile + '|>'
        #return '[v' + str(fileMap[fileHash]) + ']'
    else:
        index = 0
        if 'lastIndex' in fileMap:
            index = fileMap['lastIndex']
        #ENDIF
        index += 1
        fileMap[fileHash] = index
        fileMap['lastIndex'] = index
        return '<|cmp|' + prefix ( str(index)) + '|id' + str(global_id) + '|' + procFile + '|>'
        #return '[v' + str(index) + ']'
    #ENDIF
#ENDDEF

def parse_Proc_Header(filepath):
    '''
    This function parses the procedure header and returns a list. This list contains the revision number and the date of the revision.
    '''
    try:
        current_Proc = open(filepath) 
        in_Header = False
        header = []
        foundRevHistory = False
        for line in current_Proc.readlines():
            line = line.strip()
            if line.startswith('# DATE'):
                foundRevHistory = True
                in_Header = True
            if line.count('#') == len(line) and len(line) > 1:
                in_Header = not in_Header # Start the header if not started, ends it otherwise.
            #ENDIF if find header
            if in_Header or not foundRevHistory:
                header.append(line)
            elif len(header) > 0: # This means we have reached the end of the header (before manufacturer disclaimer)
                break
            #ENDIF in_Header
        #ENDFOR line in readlines
        current_Proc.close()
        Display('Parsing ' + filepath)
        # At the end of this loop, we have the header. Let's parse it backwards.
        date = ''
        revision = ''
        spacecrafts = set()
        lineNo = 0
        #print header
        for lineNo in range(len(header)):
            line = header[-lineNo]
            #print 'line ' + str(lineNo) + '/' + str(len(header))  + '=='+ str(line)
            # The lines are stripped before adding them to our header, so if there's a space, then we know there will be date afterwards.
            if line.startswith('# '):
                if len(line) < 14:
                    continue
                date = line[2:13]
                if len(date.strip()) == 0: # This may happen if the revision comment spans over several lines.
                    continue
                #ENDIF
                revision = line[13:].split()[0]
                revNum = ParseRevision(revision)
                #print revision + '==>' + str(revNum)
                if line.startswith('# DATE'):
                    break
                if revNum == -2:
                    continue
                #print 'Revision ' + revision + ' is dated as ' + date + '.'
                break # We can leave now that we have all the information.
            #ENDIF line start with '# '.
        #ENDFOR lineNo
        for lineNo in range(lineNo,len(header)):
            line = header[-lineNo]
            # The lines are stripped before adding them to our header, so if there's a space, then we know there will be date afterwards.
            if line.startswith('# SPACECRAFT'):
                scs = line.split(':',1)[1].split(',')
                for sc in scs:
                    spacecrafts.add(sc.strip())
                #ENDFOR 
                spacecrafts = tuple(spacecrafts)
                break # We can leave now that we have all the information.
            #ENDIF line start with '# '.
            if line.startswith('# SATELLITE'):
                scs = line.split(':',1)[1].split(',')
                for sc in scs:
                    spacecrafts.add(sc.strip())
                #ENDFOR 
                spacecrafts = tuple(spacecrafts)
                break # We can leave now that we have all the information.
            #ENDIF line start with '# '.
        #ENDFOR lineNo
    
        return [revision, date,spacecrafts]
    except:
        return [-2,'not available','UNK']
    #ENDTRY
#ENDDEF


def ParseRevision(rev):
    try:
        return float(str(rev).replace(',','.'))
    except:
        if '===' in str(rev):
            return -1
        if 'PIL2SPELL' in str(rev):
            return -1
        return -2
    #ENDTRY
#ENDDEF

def loadDatabaseFile(dbName,DB_Path,faultyLines=None):
    fh =  open(DB_Path)
    DB_File = fh.read() 
    fh2 =  open(DB_Path)
    DB_File_lines = fh2.readlines() 
    if faultyLines == None:
        faultyLines = []
    expr = re.compile('^\\s*(\\w\\S+)[ \t]*([^\n]*)$',re.MULTILINE);
    replacementExpr = '%s["\\1"]=\\2'%(dbName)
    
    
    oldContent = None
    while oldContent != DB_File:
        oldContent = DB_File
        DB_File = re.sub(r'\\[\s\r]*\n','',DB_File,re.MULTILINE)
    #ENDWHILE
    
    
    DB_File = re.sub(expr,replacementExpr,DB_File)

    
    
    oldContent = None
    while oldContent != DB_File:
        oldContent = DB_File
        DB_File = re.sub(r'([\\])\s+\n',r'',DB_File,re.MULTILINE)
    #ENDWHILE
    exec(dbName + ' = {}')
    dbEntries = DB_File.strip().split('\n')
    
    for e in dbEntries:
        try:
            exec(e + '\n')
            #print e
        except:
            #print 'ch: '+ re.sub('(%s\\["\\w\\S+"\\])=.*'%(dbName),'\\1={}',e)
            faultyEntry = re.sub('%s\\["(\\w\\S+)"\\]=(.*)'%(dbName),'\\1|=|\\2',e).split('|=|')
            idx = -1
            if len(faultyEntry) > 1:
                for line in DB_File_lines:
                    idx += 1
                    if faultyEntry[0] in DB_File_lines[idx] and faultyEntry[1] in DB_File_lines[idx]:
    
                        if re.match(r'^\s*%s[ \t]*%s\s*$'%(faultyEntry[0],faultyEntry[1].replace('+','\\+')),DB_File_lines[idx]):
                            if (idx+1,faultyEntry) not in faultyLines:
                                faultyLines.append((idx+1,faultyEntry))
                                break
                            #ENDIF
                        #ENDIF
                    #ENDIF
                #ENDFOR
            #ENDIF
            #print e
            #print re.sub('(%s\\["\\w\\S+"\\])=.*'%(dbName),'\\1={}',e)
            #print re.sub('%s\\["(\\w\\S+)"\\]=(.*)'%(dbName),'\\1|=|\\2',e).split('|=|')
            #print faultyLines
            try:
                exec(re.sub('(%s\\["\\w\\S+"\\])=.*'%(dbName),'\\1={}',e) + '\n')
            except:
                pass
            #ENDTRY
        #ENDTRY
    #ENDFOR
    
    #exec(DB_File.strip() + '\n')
    fh.close()
    return eval(dbName)
#ENDDEF

def getProcType(procPath):
    procPath = procPath.replace('/','\\')
    if '\\Validation\\' in procPath:
        return '<12>'
    if '\\Bus\\' in procPath:
        return '<3>'
    return '<9>'