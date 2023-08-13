package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("https://www.saucedemo.com/");

		//using css selector tag id # attribute
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		//using css selector tag id [attribute=name]
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		//for using css selector using id & attribute
		// tagid [attribute^=name] ------------ For starting
		// tagid [attribute$=name] ------------ For end
		// tagid [attribute*=name] ------------ For Any

		driver.findElement(By.cssSelector("button[id$=backpack]")).click();


	}

}
