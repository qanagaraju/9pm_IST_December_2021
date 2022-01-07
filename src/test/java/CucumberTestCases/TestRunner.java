package CucumberTestCases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		//How to run multiple feature files
		
		features = {"E:\\SeleniumFrame_Works\\Cucumber_Amazon\\Cucumber_TestProject\\Features\\search.feature"},
		glue = "CucumberTestCases",
		//plugin = { "pretty", "html:target/cucumber-reports" }
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
		//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		
		dryRun = false,
		monochrome = false
		
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	
	
	
	
}
