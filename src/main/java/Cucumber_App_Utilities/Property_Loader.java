package Cucumber_App_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Loader {
	
	
	
	public static File file = new File("./AppFiles/login.properties");
	public static Properties prop;
	public Property_Loader() {
	
	try {
		
		
		
		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("browserturl"));
		
		
		
	} catch (IOException e) {
		
	System.out.println(e.getMessage());
	
	}finally {
		if(file.exists()) {
			System.out.println("File connected successfully");
			System.out.println("Exception applied successfully");
			
		}else
		{
			System.out.println("Not connected-Exception failed");
		}
	}

	}
	
	
	//Create methods for each property
	
	public String geturl() {
		return prop.getProperty("browserurl");
	}
	
	public String getbrowsertype() {
		return prop.getProperty("browsertype");
	}
	
	
}
