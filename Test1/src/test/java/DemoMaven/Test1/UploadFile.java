package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/upload-download");

		//File upload using type file so send keys used

		driver.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("D:\\Test.txt");

	}

}
