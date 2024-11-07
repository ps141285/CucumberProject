package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Login.feature", // Path to the feature file
        glue = "stepDefinition",                     // Path to step definitions package
        dryRun = true,
        plugin = {"pretty", "html:test-output"}, // Report plugins
        monochrome = true                             // Makes console output readable
)
public class TestRunner {
    // This class will run the Cucumber tests
}