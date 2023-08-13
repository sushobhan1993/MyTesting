package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterGoogleSearch {
	
	/*************************************************************************
	 * XML file name : ParameterGoogleSearch
	 *************************************************************************/
	
	 @Parameters({"keyword"})
	  @Test
	 
	public void googlesearch(String searchdata) {
		
		  WebDriverManager.firefoxdriver().setup();
	        WebDriver driver = new FirefoxDriver();
	           
	        driver.get("https://www.google.com/");
	        
	        WebElement searchbox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
	        searchbox.sendKeys(searchdata);
	        
	        Assert.assertEquals(searchdata,searchbox.getAttribute("value") );
	}
	
	

}
