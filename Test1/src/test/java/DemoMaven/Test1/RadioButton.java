package DemoMaven.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("https://eudyam.com/");

		List <WebElement> radiobuttons = driver.findElements(By.xpath("//*[@class='mat-radio-input cdk-visually-hidden']"));

		System.out.println("Total radio buttons are : "+radiobuttons.size());



	}

}
