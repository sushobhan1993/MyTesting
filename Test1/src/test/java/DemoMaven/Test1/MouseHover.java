package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://sellglobal.ebay.in/seller-center/");

		WebElement element = driver.findElement(By.linkText("Payments & Fees"));
		//Mouse hover
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}

}
