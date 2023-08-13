package CrossBrowserTestingTentNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestingDemo {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser) {


		switch(browser.toLowerCase()) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
			
		case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
            
            default :
            	driver = null;
            	break;
			
		}
	}




	@Test
	public void verifyTitle() {

		driver.get("https://www.saucedemo.com/");

		// Get the actual title of the webpage
		String actualTitle = driver.getTitle();

		// Define the expected title
		String expectedTitle = "Swag Labs";

		// Compare the actual and expected titles
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title verification passed!");
		} else {
			System.out.println("Title verification failed. Expected: " + expectedTitle + ", but got: " + actualTitle);
		}
	}
}
