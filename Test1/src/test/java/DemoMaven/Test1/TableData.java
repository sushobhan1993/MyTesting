package DemoMaven.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demo.guru99.com/test/web-table-element.php#");

		//Finding value from table
		String Tabletext = 	driver.findElement(By.xpath("(//table/tbody/tr[1]/td[3])[2]")).getText();
		//String Tabletext1 = 	driver.findElement(By.xpath("//div[1]/table[1]/tbody[1]/tr[2]/td[3]\r\n")).getText();


		System.out.println(Tabletext);


		//Find rowlist

		List <WebElement> rowlist = driver.findElements(By.xpath("//table/tbody/tr"));

		System.out.println("The row list :"+rowlist.size());

		List <WebElement> columnlist = driver.findElements(By.xpath("//table[1]/thead[1]/tr[1]/th"));

		System.out.println("The row list :"+columnlist.size());




	}

}
