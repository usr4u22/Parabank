package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Transfer_Funds{
	WebDriver driver;
	@Given("User on dashboard Page")
	public void user_on_dashboard_page() {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.navigate().to("https://para.testar.org/parabank/");
	    
	}

	@When("Click on Transfer funds link")
	public void click_on_transfer_funds_link() {
	    driver.findElement(By.xpath("//a[@href='/parabank/transfer.htm']")).click();
	    
	}

	@When("User enters amount")
	public void user_enters_amount() {
	   driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10");
	   
	}

	@When("select account field first")
	public void select_account_field_first() {
	   WebElement first_field=driver.findElement(By.xpath("//select[@id='fromAccountId']"));
	   Select FF= new Select(first_field);
	   FF.selectByVisibleText("12345");
	}

	@When("Select account field second")
	public void select_account_field_second() {
	   WebElement second_field = driver.findElement(By.xpath("//select[@id='toAccountId']"));
	   Select SF= new Select(second_field);
	   SF.selectByVisibleText("12456");
	   
	}

	@When("Click on Tranfer Button")
	public void click_on_tranfer_button() {
		driver.findElement(By.xpath("//input[@value='Transfer']")).click();
	}

	@Then("Verify Confirmation of Tranfer Complete")
	public void verify_confirmation_of_tranfer_complete() throws IOException {
		//Full Screenshot
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\utkarsh.singh\\git\\Parabank\\Parabank\\Screenshot\\Transaction_Complete.jpg"));
		
		//Partial Screenshot
		
		WebElement Transaction_Complete= driver.findElement(By.xpath("//h1[@class='title']"));
		Transaction_Complete.click();
		File f1 = Transaction_Complete.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\\\Users\\\\utkarsh.singh\\\\git\\\\Parabank\\\\Parabank\\\\Screenshot\\\\_Partial_Transaction_Complete.jpg"));
		}
	 


} 