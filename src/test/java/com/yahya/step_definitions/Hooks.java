package com.yahya.step_definitions;

import com.yahya.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    /**
     * Set up a hooks class that contains
     * methods that run before and after each scenario
     * or even when tags are used
     */

    @Before("@ui")
    public void setupDriver(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @After("@ui")
    public void tearDown(Scenario scenario){

        // Check if the scenario failed or not
        if (scenario.isFailed()){
            // this is how we take screenshots in selenium
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Failed scenario");
        }
        Driver.closeBrowser();
    }
}
