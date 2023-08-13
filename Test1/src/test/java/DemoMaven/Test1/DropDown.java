package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("https://myudyogaadhar.org/");

		//Add dropdown value

		WebElement element = driver.findElement(By.xpath("//*[contains(@id,'gender')]"));

		Select dropdown = new Select(element);

		dropdown.selectByVisibleText("Male");

		// checking dropdown is capable for for adding multiple value or not

		if (dropdown.isMultiple()) {

			System.out.println("Multiple suppoted");
		}
		else {
			System.out.println("Multiple value not supported");
		}

	}

}
