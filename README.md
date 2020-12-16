# Tronium Test Automation Framework - Mobile Native Application Test
This is a Cucumber - Android test automation project for native applications.

## Prerequisites:

1. Install Appium
2. Install Android SDK
3. Create Emulator(s) 

# Getting Started
1. In a Terminal/Command session, install Git, navigate/make a folder, then:

   ```
   git clone https://github.com/dilshan5/ttaf-mobile-sample-android-native.git
   cd ttaf-mobile-sample-android-native
   ```
2. Goto `configuration.properties` file and set,
    1. mobile-platform , (if needed)
    2. mobile-app-location 
    3. mobile-app-name , (if needed)
    4. mobile-app-package , (if needed)
    5. mobile-app-launch-activity , (if needed)
3. Paste your apk file into `appstore` folder.  

# Set your android test device 
1. If you use a real android device then, 
    1. NO need to run `start_all_android_emulators` file. 
    2. Plug the device(s) 
    3. To get `mobile-device-id` (Unique Device Identifier or UDID), run command `adb devices` on CLI
    4. Edit `register_devices_with_appium` file and run

1. If you use a real android emulator then,  
    1. Edit `start_all_android_emulators` file and change the emulator name(s) (eg: `gtest1`)
    2. Set path to your local install emulator folder in SDK folder 
    3. Run `start_all_android_emulators` file
    3. Edit `register_devices_with_appium` file and run

  Please follow the following format:
  ```
  appium -a 127.0.0.1 -p <appium-server-port> -bp 2345 --udid <mobile-device-id> --chromedriver-port 5645  --session-override --default-capabilities "{\"systemPort\":8200}"
  ```  
  
  **Notes :** 
  
  - If you want to run the same test on multiple devices in parallel, then please make sure to register those devices with Appium server with unique `appium-server-port` and `systemPort` for each device.
  - For Windows machine use BAT files and for Linux versions use Shell Scripts

 # Edit Test suite
 
 Go to the `SmokeTest_Parallel.xml`.
 
 You can change the `mobile-device-id`, `appium-server-port` and `mobile-device-name` according to your emulator/mobile device.
 

# Running the test suite via test suite

Go to the `SmokeTest_Parallel.xml` . Right click and run the suite.

# Running the test suite via CLI
 Make sure you successfully import all the maven dependencies. After that run the following command to start the execution,

 mvn clean install -P<suite_name>
 
 ``
 mvn clean install -PSmokeTest_Parallel
 `` 
  
# Enable Selenium grid

Set Up the selenium grid and change the Selenium grid URL in the `configuration.properties` file. Then run your distributed test suite.

# View Allure report 

## In Windows

First, you need to download allure from https://github.com/allure-framework/allure2/releases

Then add the bin folder location into your PATH variable.Once you run your test suite, 'allure-results' directory will create inside target directory. Copy the path of it. Then open the command prompt. Run the following command,

``
allure serve <location to your allure-results directory>
``

## In Ubuntu

````
curl -o allure-2.6.0.tgz -Ls https://dl.bintray.com/qameta/generic/io/qameta/allure/allure/2.6.0/allure-2.6.0.tgz   
sudo tar -zxvf allure-2.6.0.tgz -C /opt/   
sudo ln -s /opt/allure-2.6.0/bin/allure /usr/bin/allure  
allure --version 
````

Once you run your test suite, 'allure-results' directory will create inside target directory. Copy the path of it. Then open the command prompt. Run the following command,

``
allure serve <location to your allure-results directory>
``