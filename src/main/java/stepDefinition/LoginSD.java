package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    WebDriver driver;

    @Given("login page should be opened")
    public void login_page_should_be_opened() {

        System.out.println("login page should be opened");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");

    }

    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        System.out.println("I enter valid username and valid password");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");

    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

    }
    @Then("I should be redirected to homepage")
    public void i_should_be_redirected_to_homepage() {

        System.out.println("I should be redirected to homepage");

        String expected ="http://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals("incorrect page",expected,actual);
    }

    @When("I enter invalid username and valid password")
    public void i_enter_invalid_username_and_valid_password() {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dsds");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dsds");

    }
    @Then("I should get error message")
    public void i_should_get_error_message() {

        String expected ="http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
         String actual = driver.getCurrentUrl();
        Assert.assertEquals("incorrect page",expected,actual);

    }


    @When("^I dont enter username and password$")
    public void i_dont_enter_username_and_password() throws Throwable {

    }

    @Then("^I should get another error message$")
    public void i_should_get_another_error_message() throws Throwable {

        String expected ="http://stock.scriptinglogic.net/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("incorrect page",expected,actual);


    }

    @When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String username, String password)
             {
                 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
                 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

             }


}
