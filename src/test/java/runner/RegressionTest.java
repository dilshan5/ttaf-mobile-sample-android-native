package runner;

import com.automation.qa.ttafmobilecore.driver.DriverFactory;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        dryRun = false,//Skip execution of glue code.
        strict = true,// Treat undefined and pending steps as errors.
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/regressionTestResults.json",
                "html:target/cucumber-reports"
        },
        monochrome = false,//Don't colour terminal output.
        tags = {"@regression"}
)
@Test
public class RegressionTest extends DriverFactory {
}

