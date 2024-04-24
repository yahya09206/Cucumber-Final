package com.yahya.step_definitions;

import com.yahya.pages.WLoginPage;
import com.yahya.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

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
        loginPage.login("Testers", "test");
    }

    @Then("we should still be at the login page")
    public void weShouldStillBeAtTheLoginPage() {
        assertEquals("Web Orders Login", Driver.getDriver().getTitle());
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {
        loginPage.loginErrorMsgPresent();
    }

    @When("user provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialMap) {
//        String usernameFromTable = credentialMap.get("username");
//        String passwordFromTable = credentialMap.get("password");
        System.out.println(credentialMap);
        loginPage.login(credentialMap.get("username"), credentialMap.get("password"));
    }

    @Given("this is the product reference")
    public void thisIsTheProductReference(List<Map<String, Object>> productMapList) {

//        System.out.println("productMapList = " + productMapList);
//
//        for (Map<String, Object> stringObjectMap : productMapList) {
//            System.out.println("stringObjectMap = " + stringObjectMap);
//        }

        Map<String, Object> thirdRowMap = productMapList.get(2);
        System.out.println("thirdRowMap = " + thirdRowMap);
        // Print discount column of 3rd map
        System.out.println("thirdRowMap.get(\"Discount\") = " + thirdRowMap.get("Discount"));
    }
}
