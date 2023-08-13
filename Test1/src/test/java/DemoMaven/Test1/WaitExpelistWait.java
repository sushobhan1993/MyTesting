package DemoMaven.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class WaitExpelistWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/tool-tips/");

		//using explicit timeout
		  WebDriverWait wait = new WebDriverWait(driver, 10);


		Stopwatch watch = null;

		try {
			watch =Stopwatch.createStarted();

	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("//*[@id=\\\"toolTipButton22\\\"]")));

		//String actualtooltips =driver.findElement(By.xpath("//*[@id=\"toolTipButton22\"]")).getAttribute("title");
		}catch(Exception e){
			System.out.println(e);
			watch.stop();
			System.out.println("The time took "+watch.elapsed(TimeUnit.SECONDS));
		}
		String ExpectedToolTip = "You hovered over the Button";

		//System.out.println(actualtooltips);

	}

}
