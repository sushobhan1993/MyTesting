package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  WebDriverManager.firefoxdriver().setup();
	      WebDriver driver = new FirefoxDriver();

	      //create object for login page

	      LoginPage  pg = new LoginPage(driver);



	      driver.get("https://www.saucedemo.com/");
	      pg.enterusername("standard_user");
	      pg.enterpass("secret_sauce");
	      pg.loginbt();

	}

}
