package com.yahya.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This file only serves one purpose which is to re-run failed scenarios
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/yahya/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
