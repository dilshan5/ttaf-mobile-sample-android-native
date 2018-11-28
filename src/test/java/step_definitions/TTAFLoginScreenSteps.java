package step_definitions;

import com.automation.qa.ttafmobilecore.driver.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import screen.TTAFLoginScreen;

public class TTAFLoginScreenSteps {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFLoginScreenSteps.class));
    AppiumDriver driver = DriverManager.getDriver();
    TTAFLoginScreen ttafLoginScreen;

    @Given("I am on the Login Screen")
    public void i_am_on_the_Login_Screen() {
        ttafLoginScreen = new TTAFLoginScreen(driver);
    }

    @When("I fill {string} as Email address")
    public void i_fill_as_Email_address(String email) {
        ttafLoginScreen.set_Email(email);
        LOGGER.info("set Email address");
    }

    @When("I fill {string} as Password")
    public void i_fill_as_Password(String pwd) {
        ttafLoginScreen.set_Password(pwd);
        LOGGER.info("set Password");
    }

    @When("I click Login button")
    public void i_click_Login_button() {
        ttafLoginScreen.click_Login();
        LOGGER.info("Click Login button");
    }
}
