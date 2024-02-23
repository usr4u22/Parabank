package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class Screenshot {
     WebDriver driver;
    public static void main(String[] args) throws IOException  {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://para.testar.org/parabank/transfer.htm");
	driver.manage().window().maximize();
	
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
