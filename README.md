# Tronium Test Automation Framework - Mobile Native Application Test
This is a Cucumber - Android test automation project for native applications

# Getting Started
 First you need to clone the 'master' branch of this project into your local machine. After that you can open configuration.properties file
 and set your desired device for testing. 
 Paste your apk file into 'appstore' folder. 
 Set your Mobile platform (Android/iOS)
 Change your device ID and Appium port
 
# Set your android emulator/device 
  - Edit 'start_all_android_emulators.bat' file and change the device name
  - Set path to your local install emulator folder in SDK folder 
  - Edit 'start_all_android_emulators.bat' file as you need
  
  After you done with changes, run the both BAT files. Then your emulators will start and connect with Appium server.
 
# Run individual Test scenario

Goto Feature file and right mouse click on the scenario which you want to run.

# Running the test suite
In the terminal window type following command,
  
       mvn clean install
  
 Make sure that you successfully import all the maven dependencies. After that run the following command to start the execution,

 mvn clean -P<suite_name>
  
      mvn clean -PSmokeTest
  
# Edit existing Test suite

You can change the platform, Browser name and browser version according to your local machine.

# Enable Selenium grid

Set Up the selenium grid and change the Selenium grid URL in the configuration.properties file. Then run your distributed test suite.

# View Allure report 

First you need to download allure from https://github.com/allure-framework/allure2/releases

Then add the bin folder location into your PATH variable.Once you run your test suite, 'allure-results' directory will create inside target directory. Copy the path of it. Then open the command prompt. Run following command,

      allure serve <location to your allure-results directory>
