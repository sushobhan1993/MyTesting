package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*************************************************************************
 * XML file name :
 * Another class :
 * Program details :
 * It is with out page factory program. in LoginPage class we stored
 * web element in methods
 *
 *
 *************************************************************************/

public class LoginPage {

	WebDriver driver;



	//Constructor
	LoginPage(WebDriver d){

		driver = d;

	}

	//without page factory

	By username  = By.xpath("//*[@id='user-name']");
	By password  = By.xpath("//*[@id='password']");
	By loginbtn  = By.xpath("//*[@id='login-button']");

	//creating method

	public void enterusername(String uname) {

		driver.findElement(username).sendKeys(uname);
	}

public void enterpass(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

public void loginbt() {

	driver.findElement(loginbtn).click();
}



}
