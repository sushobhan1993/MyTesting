package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;



/*************************************************************************
 * XML file name :ParallelDemo1.xml
 * In the xml we need to add  for parallel methods running   <suite name="Suite" parallel="methods" thread-count="2">
 * Another class for data provider : 
 * Program details :
 * 1.Validate title
 * 2.Validate logo
 *************************************************************************/

public class ParallelDemo1 {
	
	
  @Test
  public void verifytitle() {
	  
	  
	  WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
         
      driver.get("https://www.saucedemo.com/");
      
      Assert.assertEquals(driver.getTitle(), "Swag Labs");
      
      
  }
  
  @Test
  public void verifylogo() {
	  
	  
	  WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
         
      driver.get("https://www.saucedemo.com/");
      
      //Assert.assertEquals(driver.getTitle(), "Swag Labs");
      
     WebElement logo= driver.findElement(By.xpath("//*[@class='login_logo']"));
     
     Assert.assertTrue(logo.isDisplayed());
      
      
  }
}
