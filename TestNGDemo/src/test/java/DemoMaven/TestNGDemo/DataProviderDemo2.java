package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo2 {
	
	/*************************************************************************
	 * XML file name :DataProviderDemo2
	 * Another class for data provider : DataProviderDemo2a
	 *************************************************************************/
	//Add another class to get data from another class 
	@Test(dataProvider ="searchdataset", dataProviderClass =DataProviderDemo2a.class)
	  public void TestCaseGoogleSeArch(String country, String Monument) {
		  
		  WebDriverManager.firefoxdriver().setup();
	      WebDriver driver = new FirefoxDriver();
	         
	      driver.get("https://www.google.com/");
	      
	      WebElement searchbox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
	      
	      searchbox.sendKeys(country + "" + Monument);
	      
	      driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).submit();
	  }
}
