@echo off
set APP_NAME=test_depoloiment
set SRC_DIR=src\main\java
set WEB_DIR=src\main\webapp
set BUILD_DIR=build
set LIB_DIR=lib
set TOMCAT_WEBAPPS_SOURCE="C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps"
set "TOMCAT_WEBAPPS=%TOMCAT_WEBAPPS_SOURCE%"
set "APP_PATH=%TOMCAT_WEBAPPS%\%APP_NAME%.war"

REM Suppression et recreation du dossier temporaire
if exist %BUILD_DIR% rmdir /s /q %BUILD_DIR%
mkdir %BUILD_DIR%\WEB-INF\classes
mkdir %BUILD_DIR%\WEB-INF\lib

REM Copier les fichiers JAR necessaires dans WEB-INF/lib
xcopy "%LIB_DIR%" "%BUILD_DIR%\WEB-INF\lib" /E /I /Y

REM Compilation des fichiers Java avec le JAR des Servlets et autres dependances
dir /s /b %SRC_DIR%\*.java > sources.txt

echo " eto mintsy"
for /f "usebackq delims=" %%f in ("sources.txt") do (
    javac -cp "%LIB_DIR%\*"; -d "%BUILD_DIR%\WEB-INF\classes" "%%f"
)
del sources.txt

REM Copier les fichiers web
xcopy %WEB_DIR% %BUILD_DIR% /E /I /Y

REM Creation du fichier .war dans le dossier build
cd %BUILD_DIR%
jar -cvf %APP_NAME%.war *
cd ..

REM Deploiement vers Tomcat
if exist %APP_PATH% del %APP_PATH%
copy %BUILD_DIR%\%APP_NAME%.war %TOMCAT_WEBAPPS_SOURCE%

echo Deploiement termine avec succes.