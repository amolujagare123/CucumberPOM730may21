package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

    @Given("login page should be opened")
    public void login_page_should_be_opened() {

        System.out.println("login page should be opened");
    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("I enter valid username and valid password");

    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");

    }
    @Then("I should be redirected to homepage")
    public void i_should_be_redirected_to_homepage() {

        System.out.println("I should be redirected to homepage");
    }

}
