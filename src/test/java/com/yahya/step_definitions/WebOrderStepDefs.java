package com.yahya.step_definitions;

import com.yahya.pages.WCommonArea;
import com.yahya.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WebOrderStepDefs {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);

        WCommonArea commonArea = new WCommonArea();
        commonArea.viewOrders.click();
    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOption) {

        WOrderPage orderPage = new WOrderPage();

        WebElement dropdown = orderPage.productDropdown;
        Select prodObj = new Select(dropdown);

        // getOptions method from select class is used
        // to return all dropdown options as List of WebElements
        List<WebElement> allProductOptions = prodObj.getOptions();
        // this is the list to store actual options, so we can compare with expected
        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : allProductOptions) {
            System.out.println("eachOption.getText() = " + eachOption.getText());
            actualOptions.add(eachOption.getText());
        }
    }
}
