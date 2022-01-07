package Cucumber_App_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App_Browser_Factory 
{
	
	static WebDriver driver;
	
	public  WebDriver startBrowser(String browsername,String appurl) {
		
		if(browsername.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			//options.addArguments("--incognito");
			
			driver = new ChromeDriver(options);
			
		}else if(browsername.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browsername.equals("ie")) {
			
			try {
				
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}else if(browsername.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		driver.get(appurl);
		
		return driver;
		
}
	
	
}
