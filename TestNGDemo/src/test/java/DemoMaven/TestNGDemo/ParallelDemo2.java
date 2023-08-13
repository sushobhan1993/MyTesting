package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


/*************************************************************************
 * This is for connection another class from ParallelDemo1
 * We need to use for parralel classes       <suite name="Suite" parallel="classes" thread-count="2">
 *************************************************************************/

public class ParallelDemo2 {
  @Test
  public void verifylogin() {
	  
	  
	  WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
         
      driver.get("https://www.saucedemo.com/");
      
      driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
      driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
      driver.findElement(By.xpath("//*[@id='login-button']")).click();
      
      Assert.assertEquals(driver.getTitle(), "Swag Labs");
      
      }
}
