package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverFactory;
import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import screen.TTAFSucessScreen;

public class TTAFSucessScreenSteps extends DriverFactory {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFSucessScreenSteps.class));
    private TTAFSucessScreen tTAFSucessScreen;

    @Then("^I should see message as \"([^\"]*)\"$")
    public void i_should_see_message_as(String msg) throws Throwable {
        tTAFSucessScreen = new TTAFSucessScreen(DriverManager.getTLDriver());
        tTAFSucessScreen.check_And_Validate_LoginMessage(msg);
    }
}
