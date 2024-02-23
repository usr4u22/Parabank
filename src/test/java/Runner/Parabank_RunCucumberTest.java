package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Parabank//Features",glue= {"stepDefinitions"})
public class Parabank_RunCucumberTest extends AbstractTestNGCucumberTests{ 
	
	
	

}
