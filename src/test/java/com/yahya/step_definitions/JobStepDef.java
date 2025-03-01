package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobStepDef {

    @Given("student attends all of the class")
    public void student_attends_all_of_the_class() {
        System.out.println("Given code goes here: student attends all of the class");
    }
    @When("student learns all of the topics")
    public void student_learns_all_of_the_topics() {
        System.out.println("When code goes here: student learns all of the topics");
    }
    @Then("student should be ready for the job")
    public void student_should_be_ready_for_the_job() {
        System.out.println("Then code goes here: student should be ready for the job");
    }

    @Given("student is prepared")
    public void student_is_prepared() {
        System.out.println("Given student is prepared");
    }
    @When("student uploads their resume")
    public void student_uploads_their_resume() {
        System.out.println("When student uploads their resume");
    }
    @Then("student will be in the market")
    public void student_will_be_in_the_market() {
        System.out.println("Then student will be in the market");
    }


    @Given("you are prepared for a job")
    public void you_are_prepared_for_a_job() {
        System.out.println("condition 1: you are prepared for a job");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("condition 2: you are in the market");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs_a_day(Integer int1) {
        System.out.println("When applying for " + int1 + " jobs a day");
    }
    @Then("you will eventually get the job")
    public void you_will_eventually_get_the_job() {
        System.out.println("Then you should get the job");
    }
}
