package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepDefs {


    @Given("I have a {string}")
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);
    }
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names");
    }
    @Then("They come to me")
    public void they_come_to_me() {
        System.out.println("Then they come to me");
    }
}
