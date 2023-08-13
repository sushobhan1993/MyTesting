package DemoMaven.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotCapture {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/tool-tips/");

		//Capture Full Screenshot
		//Step 1: Convert webdriver object into screenshot interface
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        String destinationPath = "C:\\Users\\91801\\eclipse-workspace\\Test1\\Screenshot1\\Screenshot2.png";

        // Copy the screenshot file to the destination path
        try {
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

		/*
		 * File src =screenshot.getScreenshotAs(OutputType.FILE);
		 *
		 * File destination = new File
		 * ("C:\\Users\\91801\\eclipse-workspace\\Test1\\Screenshot1");
		 *
		 * FileUtils.copyFile(src, destination);
		 */

	}

}
