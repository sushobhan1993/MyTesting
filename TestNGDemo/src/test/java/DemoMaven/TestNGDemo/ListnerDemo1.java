package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

/*************************************************************************
 * XML file name :Listeners.xml
 * Another class for add on litsner : ListenerClass
 * Program details : 3 test cases are there , one is for pass, one is for failed, one is for skipped
 * Adding Listener annotation
 * 
 
 *************************************************************************/
//Add listener annotation
@Listeners(DemoMaven.TestNGDemo.ListenerClass.class)
public class ListnerDemo1 {
  @Test
  public void login() throws InterruptedException {
	  
	  WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
         
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
      driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
      
      driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      
      Assert.assertEquals(driver.getTitle(), "OrangeHRM");
      
  }
  
	
	  @Test public void Failed() {
	  
	  System.out.println("Failed test case");
	  Assert.assertTrue(false); }
	 
  
	
	  @Test public void Skipped() {
	  
	  System.out.println("Skipped test case"); 
	  throw new SkipException("Skipped exception....");
	  
	 }
	 
  
}
