package com.yahya.step_definitions;

import com.yahya.pages.WLoginPage;
import com.yahya.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class WebOrderLoginStepDef {

    WLoginPage loginPage;

    @Given("we are web order login page")
    public void we_are_web_order_login_page() {

        loginPage = new WLoginPage();
        loginPage.goTo();
    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        loginPage.login("Tester", "test");
    }
    @Then("we should see all order page")
    public void we_should_see_all_order_page() {

        // check that we are at the all orders page
        assertEquals("Web Orders", Driver.getDriver().getTitle());

    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {
    }
}
