package com.yahya.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"//"//src/test/resources/features"
        ,glue = "com/yahya/step_definitions",
        plugin = {"pretty", "html:target/cucumber_report.html"},
        dryRun = false,
        tags = "@failed"
        )
public class TestRunner {
}
