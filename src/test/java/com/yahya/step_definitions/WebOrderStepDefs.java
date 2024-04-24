package com.yahya.step_definitions;

import com.yahya.pages.WCommonArea;
import com.yahya.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WebOrderStepDefs {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);

        WCommonArea commonArea = new WCommonArea();
        commonArea.viewOrders.click();
    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOption) {

        System.out.println("expectedOption = " + expectedOption);
        WOrderPage orderPage = new WOrderPage();

        // this is the list to store actual options, so we can compare with expected
        List<String> actualOptions = new ArrayList<>();

        // assert that these two lists are equal
        assertEquals(expectedOption, actualOptions);
    }
}
