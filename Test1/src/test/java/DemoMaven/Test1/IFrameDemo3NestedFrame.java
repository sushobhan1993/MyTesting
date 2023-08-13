package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameDemo3NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame("frame1");//Parent frame
		driver.switchTo().frame("frame3");//switch to child frame

		driver.findElement(By.xpath("//*[@id='a']")).click();

		driver.switchTo().parentFrame();//switch to parent
		driver.findElement(By.tagName("input")).sendKeys("Sushobhan");

		driver.switchTo().defaultContent();//Switch to default

	}

}
