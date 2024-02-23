package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Registration_page {
	static WebDriver driver;
	@Given("user is already on register Page")
	public void user_is_already_on_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
	}

	@When("title of Register page is Parabank")
	public void title_of_register_page_is_parabank() {
	    // Write code here that turns the phrase above into concrete actions
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "ParaBank | Register for Free Online Account Access";
		Assert.assertEquals(ActualTitle,ExpectedTitle,"User on Registration Page");
		
		
	}

	@When("user enters First Name")
	public void user_enters_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("customer.firstName")).sendKeys("Standard");
	   
		
	}

	@When("user enters Last Name")
	public void user_enters_last_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("customer.lastName")).sendKeys("user");
	}

	@When("user enters Address")
	public void user_enters_address() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("customer.address.street")).sendKeys("abc@colony");
		
	}

	@When("user enters City")
	public void user_enters_city() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("customer.address.city")).sendKeys("Jaipur");
	}

	@When("user enters State")
	public void user_enters_state() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("customer.address.state")).sendKeys("Rajasthan");
	}

	@When("user enters Zip Code")
	public void user_enters_zip_code() {
	    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("customer.address.zipCode")).sendKeys("1234");
	}

	@When("user enters Phone #")
	public void user_enters_phone() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("customer.phoneNumber")).sendKeys("1234567890");
	}

	@When("user enters SSN")
	public void user_enters_ssn() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("customer.ssn")).sendKeys("QWERTY123");
	}

	@When("user enters Username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("customer.username")).sendKeys("StandardDemo11");
	}

	@When("user enters Password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("customer.password")).sendKeys("Parabank@123");
	}

	@When("user enters Confirm")
	public void user_enters_confirm() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("repeatedPassword")).sendKeys("Parabank@123");
	}

	@And("click on Register button")
	public void click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	@Then("user navigate to Home page")
	public void user_navigate_to_Home_page() {
		String actualTitle= driver.getTitle();
		String expectedTitle= "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle,expectedTitle, "User Successfully Landing on HomePage");
	}
	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
