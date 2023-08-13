package DemoMaven.WebDrivewrMgr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMngClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * // Create an instance of ChromeDriver WebDriver driver = new ChromeDriver();
		 */
	        
	        // Navigate to a website
	        driver.get("https://www.google.com/");
      
	        
	        String findtitle =driver.getTitle();
	        System.out.println(findtitle);
	}

}
