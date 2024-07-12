package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/parellel_execution",
        glue = {"StepDefinations"}, monochrome = true,
        tags = "@LaunchGoogle and @LaunchBing",
        plugin = {"pretty", "html:target/HtmlReports.html",
                "timeline:target/cucumber"
        }
        )
        //tags = "@LaunchGoogle or @LaunchBing")
public class TestRunner {
}
