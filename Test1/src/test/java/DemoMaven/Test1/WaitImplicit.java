package DemoMaven.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Stopwatch;

//import com.google.inject.internal.util.Stopwatch;


public class WaitImplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/tool-tips/");

		//using implicit timeout

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//create stopwatch to major after how many times its showing error

		Stopwatch watch = null;

		try {
			watch =Stopwatch.createStarted();

		String actualtooltips =driver.findElement(By.xpath("//*[@id=\"toolTipButton22\"]")).getAttribute("title");
		}catch(Exception e){
			System.out.println(e);
			watch.stop();
			System.out.println("The time took "+watch.elapsed(TimeUnit.SECONDS));
		}
		String ExpectedToolTip = "You hovered over the Button";

		//System.out.println(actualtooltips);
	}

}
