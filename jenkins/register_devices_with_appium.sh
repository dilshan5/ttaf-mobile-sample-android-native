#!/usr/bin/env bash

#  ============= Execute on Ubuntu/Linux Machine ===============================
#  Used for Start the Appium server
#  coded by Dilshan fernando
# http://appium.io/docs/en/writing-running-appium/server-args/
# http://appium.io/docs/en/writing-running-appium/caps/
#  ============================================

appium -a 127.0.0.1 -p 1234 -bp 2345 --udid gtest1:5554 --chromedriver-port 5645 --default-capabilities "{\"systemPort\":8200}"