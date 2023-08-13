package DemoMaven.Test1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();

		//Open Url

		driver.get("http://www.deadlinkcity.com/");
		//driver.get("https://www.toolsqa.com/selenium-webdriver/find-broken-links-in-selenium/");

		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Find links
		List <WebElement> FindLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links: "+FindLinks.size());

		//Store as a veriable
		int rescode=200;
		int brokenlinkcount = 0;


		//address the links

		for(WebElement  li : FindLinks ) {
			//capture the url & store
			String Url = li.getAttribute("href");

			try {

				//creating object as name of URL

				URL urllink = new URL(Url);

				HttpURLConnection urlcon = (HttpURLConnection)urllink.openConnection();
				//Sending request to all connection
				urlcon.setRequestMethod("HEAD");
				urlcon.connect();

				rescode =urlcon.getResponseCode();

				if(rescode>400) {
					System.out.println("Its broken - " +Url);
					brokenlinkcount++;
				}

				//MalformedURLException get from library
			}catch(MalformedURLException e) {

			}catch(Exception e) {

			}

		}
		System.out.println("Total Broken links "+brokenlinkcount);



	}

}
