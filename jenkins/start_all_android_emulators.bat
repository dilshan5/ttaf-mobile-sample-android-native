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

cd /d "F:\MobileTesting\sdk1\emulator"

start emulator -avd Nexus_4_API_22
start emulator -avd Pixel_2_API_28

