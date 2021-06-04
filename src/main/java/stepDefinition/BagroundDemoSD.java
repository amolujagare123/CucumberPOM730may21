package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BagroundDemoSD {



    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
        System.out.println("=============>>>>>>>>  I open browser >>>>>>");
    }



    @Given("^I am on the user forgot password page$")
    public void i_am_on_the_user_forgot_password_page() throws Throwable {
        System.out.println("I am on the user forgot password page");
    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        System.out.println("I am on the home page");
    }

    @When("^I enter details$")
    public void i_enter_details() throws Throwable {
        System.out.println("I enter details");
    }

    @When("^I enter email$")
    public void i_enter_email() throws Throwable {
        System.out.println("I enter email");
    }

    @When("^I click on the link open info$")
    public void i_click_on_the_link_open_info() throws Throwable {
        System.out.println("I click on the link open info");
    }

    @Then("^the user should be added$")
    public void the_user_should_be_added() throws Throwable {
        System.out.println("the user should be added");
    }

    @Then("^password should be reset$")
    public void password_should_be_reset() throws Throwable {
        System.out.println("password should be reset");
    }

    @Then("^I should be redirected to OpenInfo page$")
    public void i_should_be_redirected_to_openinfo_page() throws Throwable {
        System.out.println("I should be redirected to OpenInfo page");
    }

    @And("^click on subit button$")
    public void click_on_subit_button() throws Throwable {
        System.out.println("click on subit button");
    }

    @And("^click on reset button$")
    public void click_on_reset_button() throws Throwable {
        System.out.println("click on reset button");
    }


}
