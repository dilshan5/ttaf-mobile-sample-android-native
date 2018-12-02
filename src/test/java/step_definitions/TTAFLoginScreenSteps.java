package step_definitions;

import com.automation.qa.ttafmobilecore.driver.TestBase;
import com.automation.qa.ttafmobilecore.driver.ThreadLocalDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import screen.TTAFLoginScreen;

public class TTAFLoginScreenSteps extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFLoginScreenSteps.class));

    TTAFLoginScreen ttafLoginScreen;

    @Given("^I am on the Login Screen$")
    public void i_am_on_the_Login_Screen() throws Throwable {
        ttafLoginScreen = new TTAFLoginScreen(ThreadLocalDriver.getTLDriver());
    }

    @When("^I fill \"([^\"]*)\" as Email address$")
    public void i_fill_as_Email_address(String email) throws Throwable {
        ttafLoginScreen.set_Email(email);
        LOGGER.info("set Email address");
    }

    @When("^I fill \"([^\"]*)\" as Password$")
    public void i_fill_as_Password(String pwd) throws Throwable {
        ttafLoginScreen.set_Password(pwd);
        LOGGER.info("set Password");
    }

    @When("^I click Login button$")
    public void i_click_Login_button() throws Throwable {
        ttafLoginScreen.click_Login();
        LOGGER.info("Click Login button");
    }
}
