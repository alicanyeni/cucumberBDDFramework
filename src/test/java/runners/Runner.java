package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//renkli yazdirmak icin
                "html:target/cucumber-report.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/features"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitaions", "hooks"},
        tags = "@Practice",
        dryRun = false
)

public class Runner {

}
