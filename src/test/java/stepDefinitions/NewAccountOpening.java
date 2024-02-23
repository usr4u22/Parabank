package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountOpening {
	WebDriver driver;
	@Given("User is on Paranbank account overiew Page")
	public void user_is_on_parabank_account_overview_page() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://para.testar.org/parabank/index.htm");
		
	    
	    
	} 
	@When("User Login to parabank ")
	public void user_login_to_parabank() {
		driver.findElement(By.name("username")).sendKeys("john");
	    driver.findElement(By.name("password")).sendKeys("demo");
	    driver.findElement(By.xpath("//input[@class='button']")).click();
		
	}
	@And("User click on Open New account Link")
	public void user_click_on_open_new_account_link() {
		String actualTitle = driver.getTitle();
		String expectedTitle= "ParaBank | Accounts Overview";
		Assert.assertEquals(actualTitle,expectedTitle,"Title Matched");
		driver.findElement(By.linkText("Open new Account")).click();
		
		
	}
	@And("User click on type of account opening option")
	public void user_click_on_type_of_account_opening_option() {
		WebElement type = driver.findElement(By.xpath("//select[@id='type']"));
		Select account_type= new Select(type);
		account_type.selectByVisibleText("SAVINGS");
		
		
		
	}
	@And("User select deposit amount")
	public void user_select_deposit_amount() {
		WebElement deposit = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		Select account_deposit= new Select(deposit);
		account_deposit.selectByVisibleText("22113");
	}
	@And("User click on Open New account button")
	public void user_click_on_open_new_account_button() {
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	@Then("User  get the confirmation message with ID")
	public void user_get_the_confirmation_message_with_ID() {
		driver.findElement(By.xpath("//*[Contains(text(),'Congratulations, your account is now open.')]"));
		driver.quit();
	}
    
    	
    	
    }

