package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver = new ChromeDriver();
    @Given("user is on google search")
    public void user_is_on_login_page() {
        driver.get("http://www.google.com");
    }

    @When("user enters the word web driver in search")
    public void user_enters_username_and_password() {
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("webdriver");

    }

    @And("clicks on enter")
    public void clicks_on_login_button() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.submit();
    }

    @Then("user is navigated to the web driver search page")
    public void user_is_navigated_to_the_home_page() {

        System.out.println("Step - User was send to the home page");
    }
}
