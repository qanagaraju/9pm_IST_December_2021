package AppElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Search_Elements {
	
	static WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")private static  WebElement searchField;
	@FindBy(id="nav-search-submit-button")private static WebElement searchButton;
	@FindBy(css="span[class='a-color-state a-text-bold']")private static WebElement productName;
	
	
	
	public void insert_product_details(String product) {
		
		searchField.sendKeys(product);
		
	}
	
	public void user_click_search_button() {
		searchButton.click();
	}
	
	
	
	public String verify_productName() {
		
		
		
		String act_product_name = productName.getText();
		String spl_act_product_name = act_product_name.replace("\"", "");
		System.out.println(spl_act_product_name);
		
		return act_product_name;
		
	}
	

}
