package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;


public class LoginPage {
	WebDriver driver;//declaration of Webdriver variables
	
	@Given("User should be on Login page")
	public void user_should_be_on_login_page() {
	    WebDriver driver = new ChromeDriver();//ChromeDriver overides Webdriver and initiation Chromedriver
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.navigate().to("https://para.testar.org/parabank/index.htm");
	    
	}
	
	@When("Title of Login Page is ParaBank Welcome Online Banking")
	public void  Title_of_Login_Page_is_ParaBank_Welcome_Online_Banking() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(ActualTitle,ExpectedTitle,"Title of Login Page matched Successfully");
	}

	@When("User enters valid Username")
	public void user_enters_valid_username() {
	    driver.findElement(By.xpath("//input[@class='input']")).sendKeys("john");
	}

	@When("User enters valid Password")
	public void user_enters_valid_password() {
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	   
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//input[@class='button']")).click();
	}

	@Then("User navigate to HomePage Dashboard")
	public void user_navigate_to_home_page_dashboard() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "ParaBank | Accounts Overview";
		Assert.assertEquals(ActualTitle,ExpectedTitle,"ParaBank | Accounts Overview");
	}

	@Then("User click on Logout")
	public void user_click_on_logout() {
	    driver.findElement(By.xpath("\\a[@href='Log out']")).click();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}


}
