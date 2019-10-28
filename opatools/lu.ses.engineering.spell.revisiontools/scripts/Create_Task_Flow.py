'''
Created on May 16, 2014

@author: jgall

<Page>
    <Name>Task Flow Generator</Name>
    <Id>TaskFlowGen</Id>
    <Option>
        <Text>Options for generating Task Flows:</Text>
        <Type>Label</Type>
    </Option>
    <Option>
        <Type>Separator</Type>
    </Option>
    <Option>
        <Name>DotPath</Name>
        <Text>File Path to dot executable.</Text>
        <Type>FILE</Type>
        <Default>R:\graphviz-2.38\bin\dot.exe</Default>
    </Option> 
    <Option>
        <Name>DotArguments</Name>
        <Text>Dot arguments passed to Dot executable.</Text>
        <Type>String</Type>
        <Default>-Tsvg</Default>
    </Option> 
    <Option>
        <Name>DotTargetExt</Name>
        <Text>Dot Target extension used for output file.</Text>
        <Type>String</Type>
        <Default>.svg</Default>
    </Option>  
    <Option>
        <Name>DotTarget</Name>
        <Text>Target Folder for Dot Graph.</Text>
        <Type>String</Type>
        <Default>/FlowDiagrams</Default>
    </Option>  
    <Option>
        <Name>DotGraphOrientation</Name>
        <Text>Orientation for Flow Chart</Text>
        <Type>COMBO</Type>
        <Default>TB</Default>
        <Value>TB</Value>
        <Value>LR</Value>
        <Value>BT</Value>
        <Value>RL</Value>
    </Option>  
    <Option>
        <Name>DotSplineType</Name>
        <Text>Select the type for all splines in the flow diagram</Text>
        <Type>COMBO</Type>
        <Default>spline</Default>
        <Value>Default:spline</Value>
        <Value>Orthogonal Splines:ortho</Value>
        <Value>Polygon Splines:polyline</Value>
        <Value>Curved overlapping Splines:curved</Value>
        <Value>Direct overlapping Splines:line</Value>
        <Value>normal non-overlapping Splines:spline</Value>
        <Value>no Splines:none</Value>
    </Option>  
    <Option>
        <Name>DotShowStartProc</Name>
        <Text>Show StartProc statements in diagram</Text>
        <Type>Boolean</Type>
        <Default>true</Default>
    </Option>  
    <Option>
        <Name>DotShowPrompt</Name>
        <Text>Show Prompt statements in diagram</Text>
        <Type>Boolean</Type>
        <Default>true</Default>
    </Option> 
    <Option>
        <Name>DotDebug</Name>
        <Text>Enable debug output for Create Task Flow script.</Text>
        <Type>Boolean</Type>
        <Default>false</Default>
    </Option>  
</Page>
<Menu>
    <Text>Flow Chart Generator</Text>
    <Menu>
        <Text>Generate Task Flow From Steps</Text>
        <Description>Task Flow Generator Tool for Satellite procedures.</Description>
        <DynamicOption>FLOW_CHART_DOT_GRAPH|utils.createDotGraph(null)</DynamicOption>
    </Menu>
    <Menu>
        <Text>Generate Detailed Task Flow From Steps</Text>
        <Description>Detailed Task Flow Generator Tool for Satellite procedures.</Description>
        <DynamicOption>FLOW_CHART_DOT_GRAPH|utils.createDotGraph("DETAILED")</DynamicOption>
    </Menu>
</Menu>

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
import subprocess
import shlex

WORK_DIR = os.getenv('WORK_DIR')

sys.path.insert(0, WORK_DIR)
from OPA_Utils import *

FLOW_CHART_DOT_GRAPH = eval(os.getenv('FLOW_CHART_DOT_GRAPH'))
DotPath = os.getenv('DotPath')
DotArguments = os.getenv('DotArguments')
DotTarget = os.getenv('DotTarget')
DotTargetExt = os.getenv('DotTargetExt')
DotDebug = (os.getenv('DotDebug') or '').lower() == 'true'
print '<BOLD>'
print ('*' * 80)
print 'SPELL Task Flow Generator'
print ('*' * 80)
if FLOW_CHART_DOT_GRAPH:
    print 'Generating Flow Chart from Steps only.'
    print "    using " + str(DotPath) + " with arguments \"" + str(DotArguments) + "\""
    
    for proc,graph in FLOW_CHART_DOT_GRAPH.iteritems(): 
        try:
            print "Handling " + str(proc)
            if DotDebug:
                print 'DEBUG: Dot Graph: \n' + str(graph)
            targetDir = proc
            targetDir,lastDir = os.path.split(targetDir)
            if DotDebug:
                print 'DEBUG: ' + targetDir
            relDir = ''
            oldDir = targetDir
            while lastDir != 'Procedures':
                targetDir,lastDir = os.path.split(targetDir)
                if lastDir != 'Procedures':
                    relDir = lastDir + '/' + relDir
                if not lastDir:
                    targetDir = oldDir
                    relDir = ''
                    break
                if DotDebug: 
                    print 'DEBUG: ' + targetDir
            #ENDWHILE
            targetDir += DotTarget + '/' +  relDir 
            
            targetFile = os.path.splitext(os.path.split(proc)[1])[0] + DotTargetExt
            sourceFile = os.path.splitext(os.path.split(proc)[1])[0] + '.dot'
            targetDir = os.path.normpath(targetDir)
            if DotDebug: print 'DEBUG: ' + targetDir
            if not os.path.exists(targetDir):
                if DotDebug: print 'DEBUG: Creating '  + targetDir
                os.makedirs(targetDir)
                if DotDebug: print 'DEBUG: success in Creating '  + targetDir
            
            f = open(os.path.normpath("" + targetDir + "/"+ sourceFile + ""),'w')
            f.write(graph)
            f.close()
        
            if DotDebug:print 'DEBUG: ' + targetFile
            arguments = shlex.split( str(DotArguments))
            imageProcess = None
            mapProcess = None
            if '-Tcmap' in str(DotArguments):
                arguments = [str(DotPath),os.path.normpath("" + targetDir + "/"+ sourceFile + "")] + arguments + ["-o",os.path.normpath("" + targetDir + "/"+ targetFile + "")]
                if DotDebug:print 'DEBUG: ' + str(DotPath) + " " + str(DotArguments) + " \"" + targetDir + "/" + targetFile + "\""
                if DotDebug:print 'DEBUG: ' + repr(arguments)
                mapProcess = subprocess.Popen(arguments)
                arguments = [str(DotPath),os.path.normpath("" + targetDir + "/"+ sourceFile + "")] + ["-Tsvg"] + ["-o",os.path.normpath("" + targetDir + "/"+  os.path.splitext(os.path.split(proc)[1])[0] + ".svg")]
                if DotDebug:print 'DEBUG: ' + str(DotPath) + " " + str(DotArguments) + " \"" + targetDir + "/" + targetFile + "\""
                if DotDebug:print 'DEBUG: ' + repr(arguments)
                imageProcess = subprocess.Popen(arguments)
            else:
                arguments = [str(DotPath),os.path.normpath("" + targetDir + "/"+ sourceFile + "")] + arguments + ["-o",os.path.normpath("" + targetDir + "/"+ targetFile + "")]
                if DotDebug:print 'DEBUG: ' + str(DotPath) + " " + str(DotArguments) + " \"" + targetDir + "/" + targetFile + "\""
                if DotDebug:print 'DEBUG: ' + repr(arguments)
                imageProcess = subprocess.Popen(arguments)
            #ENDIF
            if DotDebug:
                arguments = [str(DotPath),os.path.normpath("" + targetDir + "/"+ sourceFile + ""),"-o",os.path.normpath("" + targetDir + "/"+ os.path.splitext(os.path.split(proc)[1])[0] + '.gv' + "")]
                dotProcess = subprocess.Popen(arguments)
                dotProcess.wait()
            imageProcess.wait()
            if mapProcess:
                mapProcess.wait()
            if not DotDebug:
                if os.path.exists(os.path.normpath("" + targetDir + "/"+ os.path.splitext(os.path.split(proc)[1])[0] + '.gv' + "")):
                    os.remove(os.path.normpath("" + targetDir + "/"+ os.path.splitext(os.path.split(proc)[1])[0] + '.gv' + ""))
                os.remove(targetDir + "/"+ sourceFile)
            
            print '    Graph ' + str(targetFile) + ' has been saved successfully.'
            print ''
        except:
            print 'Failed to create graph for ' + str(proc)
            print 'Reason: ' + repr(sys.exc_info())
            raise sys.exc_info()[1]
#ENDIF


print ('*' * 80)
print '<!BOLD>'
USE_EXTERNAL_FORMATTER = os.getenv('USE_EXTERNAL_FORMATTER')

#******************************************************************************

if __name__ == '__main__':
    
    
    
    print '<BOLD>'
    logSuccess('Finished.')
    logSuccess('Please refresh all Projects involved.')
    
    print '<!BOLD>'    
