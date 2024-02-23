package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bill_Pay {
	WebDriver driver;
	@Given("User Already on HomePage Dashboard")
	public void user_already_on_home_page_dashboard() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://para.testar.org/parabank/billpay.htm");
		
	    	}

	@When("Click on Bill pay Link")
	public void click_on_bill_pay_link() {
		driver.findElement(By.xpath("//a[@href='/parabank/billpay.htm']")).click();
		
	}

	@When("Enter Payee Name")
	public void enter_payee_name() {
		driver.findElement(By.xpath("//input[//input[@name='payee.name']]")).sendKeys("DemoUser");
		
	}

	@When("Enter  Address")
	public void enter_address() {
		driver.findElement(By.xpath("//input[@name='payee.address.street']")).sendKeys("DemoUserAddress");
	}

	@When("Enter City")
	public void enter_city() {
		driver.findElement(By.xpath("//input[@name='payee.address.city']")).sendKeys("Jaipur");
	}

	@When("Enter State")
	public void enter_state() {
		driver.findElement(By.xpath("//input[@name='payee.address.state']")).sendKeys("Rajasthan");
	}

	@When("Enter ZipCode")
	public void enter_zip_code() {
		driver.findElement(By.xpath("//input[@name='payee.address.zipCode']")).sendKeys("123");
		}

	@When("Enter phone#")
	public void enter_phone() {
		driver.findElement(By.xpath("//input[@name='payee.phoneNumber']")).sendKeys("1234567890");
		
	}

	@When("Enter Account Number")
	public void enter_account_number() {
		driver.findElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys("13899");
	}

	@When("Verify Account Number")
	public void verify_account_number() {
		driver.findElement(By.xpath("//input[@name='verifyAccount']")).sendKeys("13899");
	}

	@When("Enter Amount")
	public void enter_amount() {
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("10");
	}

	@When("Select from Account")
	public void select_from_account() {
	    WebElement From_account= driver.findElement(By.xpath("//select[@name='fromAccountId']"));
	    Select FA= new Select(From_account);
	    FA.selectByVisibleText("12345");
	}

	@When("Click on Send Payment")
	public void click_on_send_payment() {
	    driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
	}

	@Then("User gets message Bill payment Complete")
	public void user_gets_message_bill_payment_complete() throws IOException {
		WebElement Transaction_Complete= driver.findElement(By.xpath("//h1[@class='title']"));
		Transaction_Complete.click();
		File f1 = Transaction_Complete.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\utkarsh.singh\\git\\Parabank\\Parabank\\Screenshot\\Bill_Payment_Complete.jpg"));
		
		
	}



}
