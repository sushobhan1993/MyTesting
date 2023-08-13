package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TextCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/buttons");

		//For right click

		WebElement r8click = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));

		Actions act = new Actions(driver);

		act.contextClick(r8click).build().perform();


		//Check the text is present in the website or not


		WebElement element = driver.findElement(By.xpath("//*[normalize-space()='You have done a right click']"));

		// Get the text from the element
		String pageText = element.getText();

		// Specify the text you want to check
		String searchText = "You have done a right click";
		if (pageText.contains(searchText)) {
			System.out.println("Text is present on the page.");
		} else {
			System.out.println("Text is not present on the page.");
		}
	}

}
