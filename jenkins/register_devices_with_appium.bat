@echo off

rem  ====================== Execute on Windows Machine ======================
rem  Used for Start the Appium server
rem  coded by Dilshan fernando
rem start node appium.js -a 10.101.200.75 -p 3456 -bp 4567 --udid emulator-5556 --chromedriver-port 5745 --session-override
rem start node appium.js -a 10.101.200.75 -p 1345 -bp 2456 --udid ZX1G22TPD3 --chromedriver-port 5845 --session-override
rem start node appium.js -a 10.101.2.185 -p 1345 -bp 2456 --udid 32005115520f7000 --chromedriver-port 5845 --session-override
rem start appium -a 192.168.159.1 -p 1345 -bp 2456 --udid ZX1G22TPD3 --chromedriver-port 5845 --session-override
rem C:\Users\dilshanf\node_modules\appium\node_modules\.bin
rem  ============================================

echo Connecting all Android emulators with Appium-Server.....
echo.

rem  =======================             Execute on Windows Machine    =====================

start appium -a 127.0.0.1 -p 1234 -bp 2345 --udid gtest1:5554 --chromedriver-port 5645  --session-override --default-capabilities "{\"systemPort\":8200}"
start appium -a 127.0.0.1 -p 3456 -bp 4567 --udid emulator-5556 --chromedriver-port 5745 --session-override --default-capabilities "{\"systemPort\":8201}"
rem start appium -a 127.0.0.1 -p 1345 -bp 2456 --udid ES2BA80609004132 --chromedriver-port 5845 --session-override --default-capabilities "{\"systemPort\":8202}"
rem start appium -a 127.0.0.1 -p 1325 -bp 2656 --udid RF8M221HNRX --chromedriver-port 5545 --session-override --default-capabilities "{\"systemPort\":8203}"
rem start appium -a 127.0.0.1 -p 3457 -bp 2356 --udid 4f35ee04856fdd1c --chromedriver-port 5545 --session-override --default-capabilities "{\"systemPort\":8205}"



