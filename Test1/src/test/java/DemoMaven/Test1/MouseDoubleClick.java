package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/buttons");

		//For Double click

		WebElement Double = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));

		Actions act = new Actions(driver);

		act.doubleClick(Double).build().perform();


	}

}
