package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFramDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.switchTo().frame(0);

		driver.findElement(By.linkText("org.openqa.selenium")).click();

		//Return back to main frame

		driver.switchTo().defaultContent();

		//Find How many i frame

		int frameno =driver.findElements(By.tagName("iframe")).size();
		System.out.println("The total frame presents : "+frameno);

	}

}
