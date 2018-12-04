@echo off

rem  ============================================
rem
rem  Used for Starting andriod device
rem  coded by Dilshan fernando
rem start node appium.js -a 10.101.200.75 -p 3456 -bp 4567 --udid emulator-5556 --chromedriver-port 5745 --session-override
rem start node appium.js -a 10.101.200.75 -p 1345 -bp 2456 --udid ZX1G22TPD3 --chromedriver-port 5845 --session-override
rem start node appium.js -a 10.101.2.185 -p 1345 -bp 2456 --udid 32005115520f7000 --chromedriver-port 5845 --session-override
rem start appium -a 192.168.159.1 -p 1345 -bp 2456 --udid ZX1G22TPD3 --chromedriver-port 5845 --session-override
rem C:\Users\dilshanf\node_modules\appium\node_modules\.bin
rem  ============================================

echo Connecting all Andriod emulators with Appium-Server.....
echo.


start appium -a 127.0.0.1 -p 1234 -bp 2345 --udid emulator-5554 --chromedriver-port 5645  --session-override --default-capabilities "{\"systemPort\":8200}"
start appium -a 127.0.0.1 -p 3456 -bp 4567 --udid emulator-5556 --chromedriver-port 5745 --session-override --default-capabilities "{\"systemPort\":8201}"


