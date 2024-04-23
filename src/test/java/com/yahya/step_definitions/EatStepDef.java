package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDef {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("This is @Given code when john_is_hungry");
    }
    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer int1) {
        System.out.println("This is @When code he_eats_cucumbers");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("This is @Then code he_will_be_full");
    }

    @Given("Ivan is hungry")
    public void ivan_is_hungry() {
        System.out.println("This is @Given code when ivan_is_hungry");
    }
    @Then("he faints")
    public void he_faints() {
        System.out.println("This is @Then code he_faints");
    }
}
