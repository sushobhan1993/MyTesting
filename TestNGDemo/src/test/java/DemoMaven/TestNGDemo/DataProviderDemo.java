package DemoMaven.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*************************************************************************
 * XML file name : DataProviderGoogleSearch.xml
 *************************************************************************/


//1. India Qutub Minar
//2. Agra Taj Mahal
//3. Hydrabad charminar




public class DataProviderDemo {
	
	@DataProvider(name="searchdataset")
	//Adding array to store data 

	public Object [][] searchdata(){
		
		Object [][] searchKeyword = new Object[3][2];
		searchKeyword[0][0]= "India";
		searchKeyword[0][1]= "Qutub Minar";
		
		searchKeyword[1][0]= "Agra";
		searchKeyword[1][1]= "Taj Mahal";
		
		searchKeyword[2][0]= "Hydrabad";
		searchKeyword[2][1]= "charminar";
		
		
		return searchKeyword;
		
	}

	
	
  @Test(dataProvider ="searchdataset")
  public void TestCaseGoogleSeArch(String country, String Monument) {
	  
	  WebDriverManager.firefoxdriver().setup();
      WebDriver driver = new FirefoxDriver();
         
      driver.get("https://www.google.com/");
      
      WebElement searchbox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
      
      searchbox.sendKeys(country + "" + Monument);
      
      driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).submit();
  }
  
}
