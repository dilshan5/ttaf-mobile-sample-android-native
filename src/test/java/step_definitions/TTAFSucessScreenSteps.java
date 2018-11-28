package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import screen.TTAFSucessScreen;

public class TTAFSucessScreenSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFSucessScreenSteps.class));
    AppiumDriver driver = DriverManager.getDriver();
    TTAFSucessScreen tTAFSucessScreen;

    @Then("I should see message as {string}")
    public void i_should_see_message_as(String msg) {
        tTAFSucessScreen = new TTAFSucessScreen(driver);
        tTAFSucessScreen.check_And_Validate_LoginMessage(msg);
    }
}
