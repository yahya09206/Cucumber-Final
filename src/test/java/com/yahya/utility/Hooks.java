package com.yahya.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    /**
     * Set up a hooks class that contains
     * methods that run before and after each scenario
     * or even when tags are used
     */

    @Before
    public void setupDriver(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown(){
        Driver.closeBrowser();
    }
}
