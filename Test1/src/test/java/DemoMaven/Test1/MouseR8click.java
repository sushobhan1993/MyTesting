package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseR8click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/buttons");

		//For right click

		WebElement r8click = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));

		Actions act = new Actions(driver);

		act.contextClick(r8click).build().perform();


	}

}
