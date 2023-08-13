package DemoMaven.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("https://www.calculator.net/");

		//Find total link

		List <WebElement> linkElements = driver.findElements(By.tagName("a"));

		System.out.println("Total Links : " +linkElements.size() );

		//print all the links

		for (WebElement el:linkElements) {
			System.out.println(el.getText());
		}

	}

}
