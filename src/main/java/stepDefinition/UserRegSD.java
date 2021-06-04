package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegSD {

    /*@Given("^I am on the user registration page$")
    public void i_am_on_the_user_registration_page() throws Throwable {

        System.out.println("I am on the user registration page");
    }

    @When("^I enter below data$")
    public void i_enter_below_data() throws Throwable {

    }

    @Then("^user should be added$")
    public void user_should_be_added() throws Throwable {
        System.out.println("ser should be added");
    }*/

    @Given("I am on the user registration page")
    public void i_am_on_the_user_registration_page() {
        System.out.println("I am on the user registration page");
    }


    @When("I enter below data")
    public void i_enter_below_data(DataTable dataTable) {

       List<String> data =  dataTable.asList(); // all the 4 values
        System.out.println(data.size());

        System.out.println("name="+data.get(0));
        System.out.println("phone="+data.get(1));
        System.out.println("email="+data.get(2));
        System.out.println("city="+data.get(3));

    }


    @Then("user should be added")
    public void user_should_be_added() {
        System.out.println("ser should be added");
    }

}
