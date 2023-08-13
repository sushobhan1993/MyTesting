package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://www.rediff.com/");

		driver.switchTo().frame("moneyiframe");

		String value =driver.findElement(By.id("bseindex")).getText();
		System.out.println(value);

	}

}
