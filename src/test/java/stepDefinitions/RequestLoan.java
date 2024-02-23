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

public class RequestLoan {
	WebDriver driver;
	@Given("User already on Dashboard Page")
	public void user_already_on_dashboard_page()
	{
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.navigate().to("https://para.testar.org/parabank/");	  
	}

	@When("User enters Loan Amount")
	public void user_enters_loan_amount() {
	    driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
	   
	}

	@When("User enters Down Payment")
	public void user_enters_down_payment() {
		driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys("30");
	}

	@When("User select From Account")
	public void user_select_from_account() {
	  WebElement From_Account= driver.findElement(By.xpath("//select[@id='fromAccountId']"));
	  Select FA= new Select(From_Account);
	  FA.selectByVisibleText("12345");
	}

	@When("User click on Apply Now Button")
	public void user_click_on_apply_now_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User gets Confimation Message")
	public void user_gets_confimation_message() throws IOException {
		WebElement Transaction_Complete= driver.findElement(By.xpath("//h1[@class='title']"));
		Transaction_Complete.click();
		File f1 = Transaction_Complete.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\utkarsh.singh\\git\\Parabank\\Parabank\\Screenshot\\_RequestLoanConfirmation.jpg"));
	}


}
