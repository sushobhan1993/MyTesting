package DemoMaven.WebDrivewrMgr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgDemo {
	
	
	@Test
	public void verifyPageTitle() {
		
		WebDriverManager.firefoxdriver().setup();
	     WebDriver driver = new FirefoxDriver();
	     
	     // Navigate to a website
	        driver.get("https://www.google.com/");
	        
	         String actualtitle = "Google"; 
			 String Expectedtitle= driver.getTitle();
			 
			 Assert.assertEquals(actualtitle, Expectedtitle);
			 
	}

}
