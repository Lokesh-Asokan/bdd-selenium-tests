package com.test.lokesh.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"com.test.lokesh.stepDefs", "com.test.lokesh.hooks"},
        plugin = { "pretty", "json:target/cucumber-reports/reports.json",
                "html:target/cucumber-reports/cucumber.html"},
        monochrome = true,
        tags = "@Automation"
)
public class SampleRunner {
}
