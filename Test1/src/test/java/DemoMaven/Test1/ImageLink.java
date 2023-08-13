package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        //Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@title='OpenCart - Demo']")).click();

        if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
        	System.out.println("Test Passed");
        }else {
        	System.out.println("Test Failed");
        }

	}

}
