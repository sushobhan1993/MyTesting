package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

				WebDriver driver = new FirefoxDriver();

				//Open Url

				driver.get("https://www.saucedemo.com/");

				//using relative xpath
				driver.findElement(By.xpath("//*[@class='input_error form_input'][@id='user-name']")).sendKeys("standard_user");

				driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");

				//Xpath using and expression

				driver.findElement(By.xpath("//*[@id='login-button' and @name='login-button']")).click();

		        //xpath using or exception

				driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-backpack' or @name='login-button']")).click();

				// normalize space x path
				// example -   //a[normalize-space()='For Teachers']

	}

}
