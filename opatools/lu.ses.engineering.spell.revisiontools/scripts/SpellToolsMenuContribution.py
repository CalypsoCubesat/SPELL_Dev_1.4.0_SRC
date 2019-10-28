'''

<Menu>
    <Text>Refactor SPELL Procedure</Text>
    <DynamicOption>REFACTOR_SPELL|utils.refactorSPELLProcedure()</DynamicOption>
</Menu>
<Menu>
    <Text>SPELL Project Tools</Text>
    <Menu>
        <Text>Create Working Sets for SPELL Projects</Text>
        <DynamicOption>CREATE_WORKING_SETS|utils.recreateWorkingSets()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Open SPELL Projects</Text>
        <DynamicOption>OPEN_PROJECTS|utils.openWorkingSets()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Close SPELL Projects</Text>
        <DynamicOption>CLOSE_PROJECTS|utils.closeWorkingSets()</DynamicOption>
    </Menu>
    <Menu>
        <Text>Update Database path for SPELL Satellites</Text>
        <DynamicOption>UPDATE_DATABASES|utils.updateProjectsDatabases('webapi','valb-opasrv1/cgi-bin/redis?%SC%')</DynamicOption>
    </Menu>
</Menu>
<Menu>
    <Text>Fix SPELL END tags</Text>
    <DynamicOption>FIX_END_TAGS|utils.fixSpellEndTags()</DynamicOption>
</Menu>
<Menu>
    <Text>SPELL TM Page Tools</Text>
    <Menu>
        <Text>Create Vision Page for SPELL Procedure</Text>
        <DynamicOption>VISION_PAGE|utils.createTMPage("Vision")</DynamicOption>
    </Menu>
    <Menu>
        <Text>Create HiFly Page for SPELL Procedure</Text>
        <DynamicOption>HIFLY_PAGE|utils.createTMPage("HiFly Views")</DynamicOption>
    </Menu>
    <Menu>
        <Text>Create Workspace for SPELL Procedure</Text>
        <DynamicOption>CREATE_WS|utils.createTMWorkspace()</DynamicOption>
    </Menu>
</Menu>
'''

import sys
import os 
WORK_DIR = os.getenv('WORK_DIR')
sys.path.insert(0, WORK_DIR)
from OPA_Utils import *



logSuccess( "<BOLD>Executing!")