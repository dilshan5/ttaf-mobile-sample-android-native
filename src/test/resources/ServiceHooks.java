package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverManager;
import com.automation.qa.ttafmobilecore.util.Constant;
import cucumber.api.java.After;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;

public class ServiceHooks {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ServiceHooks.class));

    @After
    public void closeDriver() throws Exception {
        AppiumDriver driver = DriverManager.getDriver();
        try {
            if (Constant.MOBILE_APP_TYPE.equalsIgnoreCase("WEB")) {
                driver.quit();
                LOGGER.info("TTAF MESSAGE: Closing the " + Constant.BROWSER_NAME + " browser...");
            } else if (Constant.MOBILE_APP_TYPE.equalsIgnoreCase("NATIVE") || Constant.MOBILE_APP_TYPE.equalsIgnoreCase("HYBRID")) {
                driver.closeApp();
                LOGGER.info("TTAF MESSAGE: Closing the " + Constant.MOBILE_APP_NAME + " application...");
            } else {
                System.out.print("TTAF MESSAGE: Invalid Application type..Exit from the execution..");
                System.exit(1);
            }
        } catch (Throwable e) {
            throw new Exception(e.getCause().toString());
        }
    }
}
