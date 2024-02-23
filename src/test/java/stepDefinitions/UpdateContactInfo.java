package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateContactInfo {
	WebDriver driver;
	@Given("User already on dashboard")
	public void user_already_on_dashboard() {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.navigate().to("https://para.testar.org/parabank/");
	}

	@When("click on Update Info link")
	public void click_on_update_info_link() {
	    driver.findElement(By.xpath("//a[@href='/parabank/updateprofile.htm']")).click();
	}

	@When("User enter First Name")
	public void user_enter_first_name() {
	    driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("john");
	}

	@When("User enters Last Name")
	public void user_enters_last_name() {
		 driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("demo");
	}

	@When("User enters Address")
	public void user_enters_address() {
	    driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("DemoAddressUser");
	    
	}

	@When("User enters City")
	public void user_enters_city() {
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("jodhpur");
		
	    	}

	@When("User enters State")
	public void user_enters_state() {
	    driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Uttar Pradesh");
	}

	@When("User enters Zip Code")
	public void user_enters_zip_code() {
	    driver.findElement(By.xpath("//input[ @id='customer.address.zipCode']")).sendKeys("123");
	}

	@When("User enters Phone number")
	public void user_enters_phone_number() {
	    driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567891");
	}
	@When("User click on Update Profile button")
	public void user_click_on_update_profile_button() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Display User update info confirmation message")
	public void display_user_update_info_confirmation_message() throws IOException {
		WebElement Transaction_Complete= driver.findElement(By.xpath("//h1[@class='title']"));
		Transaction_Complete.click();
		File f1 = Transaction_Complete.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\utkarsh.singh\\git\\Parabank\\Parabank\\Screenshot\\_Find_Transactions_Details.jpg"));
	}




}
