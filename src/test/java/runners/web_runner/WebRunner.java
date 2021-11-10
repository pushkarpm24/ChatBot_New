package runners.web_runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"./src/test/resources/web"},
        glue= {"step_definations/web_stepdef"},
        plugin = { "pretty", "html:test-output", "json:target/cucumberWeb.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
        },
        dryRun = true,
        strict = true,
        monochrome = true
        )
public class WebRunner {
}
