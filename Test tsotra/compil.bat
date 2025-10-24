@echo off
REM chemin vers le dossier source
set SRC_DIR=.
set BIN_DIR=bin

REM création du dossier bin
if not exist %BIN_DIR% mkdir %BIN_DIR%

REM compilation
javac -d %BIN_DIR% %SRC_DIR%\judi\*.java %SRC_DIR%\judi\controller\*.java %SRC_DIR%\judi\controllerBe\*.java %SRC_DIR%\judi\controllerKely\*.java

REM exécution
cd %BIN_DIR%
java judi.Main
