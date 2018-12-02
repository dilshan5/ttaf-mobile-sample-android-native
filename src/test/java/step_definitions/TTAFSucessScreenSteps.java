package step_definitions;

import com.automation.qa.ttafmobilecore.driver.TestBase;
import com.automation.qa.ttafmobilecore.driver.ThreadLocalDriver;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import screen.TTAFSucessScreen;

public class TTAFSucessScreenSteps extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFSucessScreenSteps.class));
    TTAFSucessScreen tTAFSucessScreen;

    @Then("^I should see message as \"([^\"]*)\"$")
    public void i_should_see_message_as(String msg) throws Throwable {
        tTAFSucessScreen = new TTAFSucessScreen(ThreadLocalDriver.getTLDriver());
        tTAFSucessScreen.check_And_Validate_LoginMessage(msg);
    }
}
