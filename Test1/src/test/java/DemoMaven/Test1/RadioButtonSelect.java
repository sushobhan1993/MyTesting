package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("https://demo.guru99.com/test/radio.html");

		 // Locate and interact with the radio buttons

		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
		WebElement radiobutton2 =driver.findElement(By.xpath("//*[@id='vfb-7-2']"));


		radiobutton1.click();
	        System.out.println("Radio Button Option 1 Selected");
		/*
		 * boolean select =radiobutton1.isSelected(); System.out.println(radiobutton1);
		 *
		 * if (select=false) { radiobutton1.click(); }
		 *
		 * WebElement radiobutton2 =
		 * driver.findElement(By.xpath("//*[@id='historical-douglass']"));
		 *
		 * boolean sel =radiobutton2.isDisplayed(); if(sel=true) { radiobutton2.click();
		 * }
		 */


	}

}
