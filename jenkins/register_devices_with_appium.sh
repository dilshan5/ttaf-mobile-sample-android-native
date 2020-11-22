#!/usr/bin/env bash

rem  ============= Execute on Ubuntu/Linux Machine ===============================
rem  Used for Start the Appium server
rem  coded by Dilshan fernando
rem  ============================================

appium -a 127.0.0.1 -p 1234 -bp 2345 --udid gtest1:5554 --chromedriver-port 5645  --session-override --default-capabilities "{\"systemPort\":8200}"