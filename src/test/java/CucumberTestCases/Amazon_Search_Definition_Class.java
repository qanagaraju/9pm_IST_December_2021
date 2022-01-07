package CucumberTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppElements.Search_Elements;
import Cucumber_App_Utilities.App_Browser_Factory;
import Cucumber_App_Utilities.Property_Loader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Search_Definition_Class  
{
  
	static WebDriver driver;
	static App_Browser_Factory browser = new App_Browser_Factory();
	static Property_Loader prop = new Property_Loader();
	static Search_Elements pageElements;
	
	@Given("^user start amzon browser$")
	public void user_start_amzon_browser() {
		
		driver = browser.startBrowser(prop.getbrowsertype(), prop.geturl());
	    
	}
	
	
	@When("^user insert \"(.*)\" for products$")
	public void user_insert_search_for_products(String ProductDetails) {
	    
		pageElements = PageFactory.initElements(driver, Search_Elements.class);
		pageElements.insert_product_details(ProductDetails);
		System.out.println("User enters product details"+ProductDetails);
		
		
		
	}
	
	
	@Then("^user click search button$")
	public void user_click_search_button() throws InterruptedException {
		pageElements = PageFactory.initElements(driver, Search_Elements.class);
		pageElements.user_click_search_button();
		System.out.println("User clicking search button");
		
		Thread.sleep(3000);
		
	}
	
	
	@Then("^user match record$")
	public void user_match_record() {
	   
		pageElements = PageFactory.initElements(driver, Search_Elements.class);
		pageElements.verify_productName();
		System.out.println("Verify user product name");
	}
	
	
	@Then("^user close test$")
	public void user_close_test() {
	   
		driver.close();
		System.out.println("user closing browser");
	}
	
	

	
	
	
	
}
