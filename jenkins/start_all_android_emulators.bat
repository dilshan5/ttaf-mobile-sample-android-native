@echo off

rem  ====================== Execute on Windows Machine ======================
rem  Used for Starting all android emulators
rem  coded by Dilshan fernando
rem  ============================================

echo Starting All Android emulators..........
echo.

rem PATH to android emulator
cd /d "C:\Users\dilshanf\AppData\Local\Android\Sdk\emulator"

start emulator -avd Pixel_2_API_28
start emulator -avd Nexus_4_API_22

