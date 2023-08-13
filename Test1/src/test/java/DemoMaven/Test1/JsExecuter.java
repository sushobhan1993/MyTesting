package DemoMaven.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();


		driver.get("https://demoqa.com/books");

		JavascriptExecutor js = (JavascriptExecutor)driver;
        //JavascriptExecutor js = (JavascriptExecutor) driver;

		//1.To type text box
		//js.executeScript("document.getElementByxpath('//*[@id='searchBox']').value='ABC';");
		js.executeScript("document.getElementById('searchBox').value='Aliya';");

		//2.Click on Find button
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		 * js.executeScript("arguments[0].click;", element);
		 */
		//3.Browser Refresh

		/* js.executeScript("history.go(0)"); */

		//4.Finding domain name
		/*
		 * String domain = js.executeScript("return document.domain;").toString();
		 * System.out.println("Domain is:" + domain);
		 */

		 //5.Capture title
			/*
			 * String title = js.executeScript("return document.title;").toString();
			 * System.out.println("Title is :" + title);
			 */

		 //6.Find URL
			/*
			 * String url = js.executeScript("return document.URL;").toString();
			 * System.out.println("Url is :" + url);
			 */

	 //7.Zooming
		//js.executeScript("document.body.style.zoom='250%'");
		/* js.executeScript("document.body.style.zoom = '1.5'"); */


		//8.Return Height & Width
		/*
		 * System.out.println(js.executeScript("return window.innerHeight;").toString())
		 * ;
		 * System.out.println(js.executeScript("return window.innerWidth;").toString());
		 */

		//9.scroll vertically till the end
		/*
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 */
				//10.scroll vertically page up
				/* js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); */

		//12.Navigate Url
				js.executeScript("window.location = 'https://www.amazon.in/s?k=amazon+com&hvadid=73048880413275&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_4cc5demh34_e'");


				//Scroll vertically down by 500 pixels so wait using thread sleep

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//11.Scroll vertically down by 500 pixels
				/* js.executeScript("window.scrollBy(0,700)"); */

				//12.Scroll till visibility the element

				//WebElement element = driver.findElement(By.xpath("(//*[@class=\"a-section a-spacing-small puis-padding-left-small puis-padding-right-small\"])[16]"));
				WebElement element = driver.findElement(By.linkText("Nutella Hazelnut Spread with Cocoa (Labels may vary), 350g"));
				js.executeScript("arguments[0].scrollIntoView();",element );
	}

}
