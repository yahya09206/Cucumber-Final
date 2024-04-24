package com.yahya.step_definitions;

import com.yahya.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
    public void tearDown(){
        Driver.closeBrowser();
    }
}
