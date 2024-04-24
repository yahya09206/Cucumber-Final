package com.yahya.step_definitions;

import com.yahya.pages.GoogleHomePage;
import com.yahya.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDef {

    GoogleHomePage googleHomePage;


    @Given("user is at homepage")
    public void user_is_at_homepage() {

        googleHomePage = new GoogleHomePage();
        googleHomePage.goTo();
    }
    @When("user searches for keyword {string}")
    public void user_searches_for_keyword(String keyword) {

        googleHomePage.searchKeyword(keyword);
    }
    @Then("we should see results page")
    public void we_should_see_results_page() {
        System.out.println("I can check the title in the next method");

    }
    @Then("the title should start with {string}")
    public void the_title_should_start_with(String keyword) {
        //import static org.junit.Assert.assertTrue;
        assertTrue(Driver.getDriver().getTitle().startsWith(keyword));
    }
}
