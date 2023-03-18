package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "step",
        plugin = {"pretty", "html:target/cucumber.html", "summary", "me.jvt.cucumber.report.PrettyReports:target/cucumber-html-reports"},
        tags = "@Logout"
)
public class runAll {
}
