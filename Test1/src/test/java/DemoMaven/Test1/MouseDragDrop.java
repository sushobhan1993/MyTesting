package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		//For drag & drop

		//Creating source & target

		WebElement source = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='box106']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(source, target).perform();


	}

}
