package DemoMaven.Test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://the-internet.herokuapp.com/upload");

		WebElement button=driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));


		Actions act =  new Actions (driver);
		act.moveToElement(button).click().perform();

		try {
			Runtime.getRuntime().exec("C://Users//91801//Desktop//AutoFileUpload1.exe" + " " + "D:\\chromedriver\\Test.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block

			System.out.println(e);
			e.printStackTrace();

			//Not working Date 20 th june
		}
	}

}
