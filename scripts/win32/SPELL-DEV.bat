@echo off
REM ##############################################################################
REM # COPYRIGHT SES-ASTRA (c) 2007,2008
REM # 
REM # AUTHOR: R. Chinchilla, F. Bouleau
REM # DATE: 08/02/2008
REM ###############################################################################

setlocal

call :dirname %0
call :dirname "%DIRNAME:~0,-1%"
set SPELL_DEV_HOME=%DIRNAME:~0,-1%\
set SPELL_DEV_CONFIG=%SPELL_DEV_HOME%\config\
set SPELL_COTS=D:\Program Files\SPELL\cots
set SVN_SSH=%SPELL_COTS:\=/%/putty/plink.exe -i M:/%USERNAME%.ppk -batch -a -T -x

if "%SPELL_DEV_DATA%" == "" set SPELL_DEV_DATA=%SPELL_DEV_HOME%\data
if "%SPELL_LOG%" == "" set SPELL_LOG=%SPELL_DEV_HOME%\log

set WORKSPACE=M:\Workspace
if not "%1" == "" set WORKSPACE=%1

if not exist "%SPELL_LOG%" mkdir "%SPELL_LOG%"

echo SPELL DEV home  : %SPELL_DEV_HOME%
echo SPELL DEV data  : %SPELL_DEV_DATA%
echo SPELL DEV config: %SPELL_DEV_CONFIG%
echo SPELL DEV cots  : %SPELL_COTS%
echo Workspace       : %WORKSPACE%

set JRE=%SPELL_COTS%\JRE_1.6.0_07
PATH "%JRE%\bin";"%JRE%\lib";%PATH%

set RCP_HOME=%SPELL_DEV_HOME%\rcp\plugins
set LAUNCHER=%RCP_HOME%\equinox-launcher.jar
set DEV_HOME=%SPELL_DEV_HOME%\spel-dev
set DEV_RCP_CONFIG=%DEV_HOME%\configuration

reg import "%SPELL_DEV_HOME%\bin\known_hosts.reg" >nul 2>&1

if exist %WORKSPACE% (
		xcopy /i /y /q "%SPELL_DEV_HOME%\bin\org.tigris.subversion.subclipse.ui.prefs" "%WORKSPACE%\.metadata\.plugins\org.eclipse.core.runtime\.settings\"
		xcopy /i /y /q "%SPELL_DEV_HOME%\bin\svnProviderState" "%WORKSPACE%\.metadata\.plugins\org.tigris.subversion.subclipse.core\.svnProviderState"
)

REM # java process set errorlevel to 1 when asking for restarting the application (switch workspace or restart)
set MYKEY=M:\%USERNAME%.ppk
if not "%~1" == "" set MYKEY=%1

echo Using the key: %MYKEY%

:runit
"%SPELL_COTS%\JRE_1.6.0_07\bin\java.exe" -Xms256m -Xmx512m -jar "%LAUNCHER%" -showsplash "%DEV_HOME%\splash.bmp" -configuration "%DEV_RCP_CONFIG%" -os win32 -arch x86 -ws win32 -consoleLog -vm "%JRE%\bin\client\jvm.dll" -data %WORKSPACE%
if errorlevel 23 %0 %WORKSPACE%
endlocal
goto :EOF

:dirname
set DIRNAME=%~dp1
goto :EOF
