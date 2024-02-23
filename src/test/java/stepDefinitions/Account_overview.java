package stepDefinitions;

import org.testng.Assert;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Account_overview {
	WebDriver driver;

	@Given("User already on  parabank Dashboard")
	public void user_already_on_parabank_dashboard() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://para.testar.org/parabank/");
		}
	@When("Click on account overview link")
	public void click_on_account_overview_link() {
		driver.findElement(By.xpath("//div[@id=\"leftPanel\"]/ul/li[2]/a")).click();
	}
	
	@And("click on particular account link")
	public void click_on_particular_account_link() {
		driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")).click();
		}
	@And("Verify the account summary details")
	public void Verify_the_account_summary_details() {
		String ActualMessage= driver.findElement(By.xpath("")).getText();
		String ExpectedMessage= "";
		Assert.assertEquals(ActualMessage,ExpectedMessage,"Message Successfully Matched");
		//
	}
	@And("Select Account Period")
	public void select_account_Period() {
	WebElement AP= driver.findElement(By.id("month"));
	Select sc= new Select(AP);
	sc.selectByVisibleText("All");
	}
	@And("Select type  of transaction")
	public void select_type_of_transaction() {
		WebElement type= driver.findElement(By.id("transactionType"));
		Select transaction = new Select(type);
		transaction.selectByVisibleText("All");
		
	}
	@And("Click on Go button")
	public void click_on_Go_button() {
		driver.findElement(By.xpath("//input[@value='Go']"));
	    driver.quit();	
		}
	
	
}
