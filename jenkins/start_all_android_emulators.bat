@echo off

rem  ============================================
rem
rem  Used for Starting all andriod emulators
rem  coded by Dilshan fernando
rem  start emulator -avd test
rem start emulator -avd Samsung_S7
rem  ============================================

echo Starting All Andriod emulators..........
echo.

cd /d "C:\Users\dilshanf\AppData\Local\Android\Sdk\emulator"

start emulator -avd Pixel_2_API_28
start emulator -avd Nexus_S_API_22

