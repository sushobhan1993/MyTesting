package DemoMaven.Test1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//08-July-2022;

		String expectedDay = "8";
		String expectedMonthYear = "July 2022";

		//launch chrome browser
        System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");
        WebDriver driver = new FirefoxDriver();

		//maximise browser
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.redbus.in/");


		//find date picker webelement to perform click action

		WebElement datepicker = driver.findElement(By.id("onward_cal"));
		datepicker.click();

		while(true)
		{
			String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if(calenderMonthYear.equals(expectedMonthYear))
			{
				driver.findElement(By.xpath("//td[text()='" + expectedDay+ "']")).click();

				break;
			}
			else
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}