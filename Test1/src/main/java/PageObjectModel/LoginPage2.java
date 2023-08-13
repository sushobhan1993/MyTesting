package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class LoginPage2 {


	WebDriver driver;
	LoginPage2(WebDriver d){

		driver = d;
		PageFactory.initElements(driver, this);
	}



	//identify elements using location strategy

	//username
	@FindBy(xpath="//*[@id='user-name']")
	WebElement username;

	//password
	@FindBy(xpath="//*[@id='password']")
	WebElement password;

	//loginbtn
	@FindBy(xpath="//*[@id='login-button']")
	WebElement loginbtn;


	public void enterusername(String uname) {

		username.sendKeys(uname);
	}

	public void enterpass(String pass) {

		password.sendKeys(pass);
	}

	public void loginbt() {

		loginbtn.click();
	}







}
