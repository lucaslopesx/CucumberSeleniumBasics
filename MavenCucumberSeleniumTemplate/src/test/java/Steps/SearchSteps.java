package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchSteps {
    WebDriver driver = new ChromeDriver();
    private String word;
    @Given("is on google search")
    public void is_on_google_search() {

        driver.get("https://www.google.com.br/");
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
    @When("enters the {string} in search")
    public void enters_the_in_search(String word) {
        this.word = word;
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(word);

    }
    @Then("the word is searched")
    public void the_word_is_searched() {
        WebElement element = driver.findElement(By.name("q"));
        element.submit();
    }
}
