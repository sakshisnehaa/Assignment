package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import java.util.NoSuchElementException;
@Test

public class Steps {
    Run excel = new Run("/home/knoldus/Desktop/Assignment/data/TestData.xlsx");
    public WebDriver driver;


    //Chrome Browser

    @Given("the user is on login page")
    public void the_user_is_on_login_page() throws TimeoutException {
        try {
            System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/Assignment/resources/chromedriver");
        }
        catch(WebDriverException e){
            System.out.println(e.getMessage());
        }

        driver= new ChromeDriver();

        //Maximize Browser
        driver.manage().window().maximize();

        //Implicit Timeout
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://admin-demo.nopcommerce.com/login");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials(){
        try {
            driver.findElement(By.cssSelector("input#Email")).sendKeys(excel.getData(0, 0, 0));
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        driver.findElement(By.cssSelector("input#Password")).sendKeys(excel.getData(0,0,1));
        try {
            driver.findElement(By.cssSelector(".button-1.login-button")).click();
        }
        catch (ElementNotVisibleException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully(){

            driver.quit();



    }


    //Firefox Browser

    @Given("the user is on login firefox browser")
    public void the_user_is_on_login_firefox_browser() throws TimeoutException {

            System.setProperty("webdriver.gecko.driver", "/home/knoldus/Desktop/Assignment/resources/geckodriver");


        driver= new FirefoxDriver();
        // Maximize browser
        driver.manage().window().maximize();

        //implict Timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://admin-demo.nopcommerce.com/login");
    }
    @When("the user should enter valid credentials for firefox browser")
    public void the_user_should_enter_valid_credentials_for_firefox_browser() {
        try {
            driver.findElement(By.cssSelector("input#Email")).sendKeys(excel.getData(0, 0, 0));
        }
        catch(NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
        driver.findElement(By.cssSelector("input#Password")).sendKeys(excel.getData(0,0,1));
        try {
            driver.findElement(By.cssSelector(".button-1.login-button")).click();
        }
        catch(ElementNotVisibleException e)
        {
            System.out.println(e.getMessage());
        }
    }
    @Then("the user should be logged in successfully in firefox browser")
    public void the_user_should_be_logged_in_successfully_in_firefox_browser() {

            driver.quit();


    }


    // Headless Browser

    @Given("I am in the login page of the demo site for automate Headless browser")
    public void i_am_in_the_login_page_of_the_demo_site_for_automate_headless_browser() {

            System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/Assignment/resources/chromedriver");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver= new ChromeDriver(options);

        // Maximize browser
        driver.manage().window().maximize();

        //implict Timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://admin-demo.nopcommerce.com/login");
    }
    @When("Take data from excel sheet for  Headless browser")
    public void take_data_from_excel_sheet_for_headless_browser() {
        try {
            driver.findElement(By.cssSelector("input#Email")).sendKeys(excel.getData(0, 0, 0));
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        driver.findElement(By.cssSelector("input#Password")).sendKeys(excel.getData(0,0,1));
        try {
            driver.findElement(By.cssSelector(".button-1.login-button")).click();
        }
        catch(ElementNotVisibleException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Then("Browser closed automatically for Headless browser")
    public void browser_closed_automatically_for_headless_browser() {
            driver.quit();

    }

}

