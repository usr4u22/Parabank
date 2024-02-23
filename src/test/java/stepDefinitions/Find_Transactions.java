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


public class Find_Transactions {
	WebDriver driver;
	@Given("User already on homepage Dashboard")
	public void User_already_on_homepage_Dashboard(){
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://para.testar.org/parabank/");
	}	
	 
	@When("Click on Find Transactions")
	public void click_on_find_transactions() {
		driver.findElement(By.xpath("//a[@href='/parabank/findtrans.htm']")).click();
		}

	@When("Click on Select Account")
	public void click_on_select_account() {
	    WebElement Account =driver.findElement(By.xpath("//select[@id='accountId']"));
	    Select ac= new Select(Account);
	    ac.selectByValue("123567");
	    }

	@When("click on Find Transaction By date")
	public void click_on_find_transaction_by_date() {
	  driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys("02-21-2024");
	}

	@When("Click on Find  Transaction Button")
	public void click_on_find_transaction_button() {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
   @Then("User Gets Transaction Details")
    public void User_Gets_Transaction_Details() throws IOException {
	   WebElement Transaction_Complete= driver.findElement(By.xpath("//h1[@class='title']"));
		Transaction_Complete.click();
		File f1 = Transaction_Complete.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\utkarsh.singh\\git\\Parabank\\Parabank\\Screenshot\\_Find_Transactions_Details.jpg"));
		
	   
	
}


}
