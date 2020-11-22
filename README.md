# Tronium Test Automation Framework - Mobile Native Application Test
This is a Cucumber - Android test automation project for native applications

## Prerequisites:

1. Install Appium
2. Install Android SDK
3. Create an Emulator

# Getting Started
1. In a Terminal/Command session, install Git, navigate/make a folder, then:

   ```
   git clone https://github.com/dilshan5/ttaf-mobile-sample-android-native.git
   cd ttaf-mobile-sample-android-native
   ```
2. Goto configuration.properties file and set,
    1. mobile-platform
    2. mobile-app-location
    3. mobile-app-name
3. Paste your apk file into `appstore` folder.  

 
# Set your android emulator/device 
  - Edit `start_all_android_emulators` file and change the device name
  - Set path to your local install emulator folder in SDK folder 
  - Edit `register_devices_with_appium` file as you need

  Please follow following format:
  ```
  appium -a 127.0.0.1 -p 1234 -bp 2345 --udid <emulatorname> --chromedriver-port 5645  --session-override --default-capabilities "{\"systemPort\":8200}"
  ```  
  
  After you done with changes, run the register_devices_with_appium and start_all_android_emulators BAT files. Then your emulators will start and connect with Appium server.
 
 **Note :** For Windows machine use BAT file and for Linux versions use Shell Script

# Edit Test suite

Go to the `SmokeTest_Parallel.xml`.

You can change the `mobile-device-id` and `mobile-device-name` according to your local machine.

# Running the test suite via test suite

Go to the `SmokeTest_Parallel.xml` . Right click and run the suite.

# Running the test suite via CLI
In the terminal window type following command,
  
       mvn clean install
  
 Make sure that you successfully import all the maven dependencies. After that run the following command to start the execution,

 mvn clean -P<suite_name>
  
      mvn clean -PSmokeTest
  
# Enable Selenium grid

Set Up the selenium grid and change the Selenium grid URL in the configuration.properties file. Then run your distributed test suite.

# View Allure report 

First you need to download allure from https://github.com/allure-framework/allure2/releases

Then add the bin folder location into your PATH variable.Once you run your test suite, 'allure-results' directory will create inside target directory. Copy the path of it. Then open the command prompt. Run following command,

      allure serve <location to your allure-results directory>
