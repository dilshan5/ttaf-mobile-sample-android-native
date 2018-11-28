package screen;

import com.automation.qa.ttafmobilecore.page.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

public class TTAFSucessScreen extends BaseScreen {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(TTAFSucessScreen.class));

    @AndroidFindBy(id = "txtSuccess")
    private MobileElement sucessText;

    public TTAFSucessScreen(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        waitUntilLoaded();
    }

    public void waitUntilLoaded() {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtSuccess")));

    }

    public void check_And_Validate_LoginMessage(String expected) {
        assertTrue(sucessText.getText().equals(expected));
        LOGGER.info("Validate ! Retry Message.");
    }
}
