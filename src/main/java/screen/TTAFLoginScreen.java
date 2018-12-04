package screen;

import com.automation.qa.ttafmobilecore.page.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class TTAFLoginScreen extends BaseScreen {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFLoginScreen.class));

    @AndroidFindBy(id = "com.sourcey.materialloginexample:id/input_email")
    private MobileElement emailField;

    @AndroidFindBy(id = "com.sourcey.materialloginexample:id/input_password")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.sourcey.materialloginexample:id/btn_login")
    private MobileElement loginButton;

    public TTAFLoginScreen(AppiumDriver driver) {
        super(driver);
        //    this.driver = driver;
        //close the keyboard if available
        if (((AndroidDriver) driver).isKeyboardShown()) {
            driver.hideKeyboard();
        }
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        waitUntilLoaded();
    }

    public void waitUntilLoaded() {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("com.sourcey.materialloginexample:id/input_email")));
    }

    public void set_Password(String password) throws Exception {
        passwordField.sendKeys(password);
        LOGGER.info("Fill Email address");
    }

    public void set_Email(String email) throws Exception {
        emailField.sendKeys(email);
        LOGGER.info("Fill password");
    }

    public void click_Login() throws Exception {
        loginButton.click();
        LOGGER.info("Fill password");
    }
}
