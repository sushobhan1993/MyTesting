package DemoPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithOutPom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  WebDriverManager.firefoxdriver().setup();
	      WebDriver driver = new FirefoxDriver();

	      Thread.sleep(3000);
	      driver.get("https://www.saucedemo.com/");
	      driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user\r\n");
	      driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
	      driver.findElement(By.xpath("//*[@id='login-button']")).click();


	}

}
