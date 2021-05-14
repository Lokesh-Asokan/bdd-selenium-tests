package com.test.lokesh.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/test.feature",
        glue= {"com.test.lokesh.stepDefs"},
        tags = "@hooks_web"
)
public class SampleRunner {
}
