package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/tool-tips/");

		String actualtooltips =driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]")).getAttribute("title");

		String ExpectedToolTip = "You hovered over the Button";

		System.out.println(actualtooltips);
		if(actualtooltips.equals(ExpectedToolTip)) {
			System.out.println("Its Match");

		}else {
			System.out.println("Not Match");
		}

	}

}
