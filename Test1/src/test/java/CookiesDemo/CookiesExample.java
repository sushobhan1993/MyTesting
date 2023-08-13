package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  WebDriverManager.firefoxdriver().setup();
	      WebDriver driver = new FirefoxDriver();
	         
	      driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=2921081567629549895&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301812&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	       
          //Create cookies 
    	  
    	  Cookie cookieObj = new Cookie("Test cookie", "Sushobhan");
    	  
    	  //Add that cookies into browser 
    	  
    	  driver.manage().addCookie(cookieObj);
	      
	      //Capture all cookies 
	      Set <Cookie> cookiesList=driver.manage().getCookies();
		
	      //Size of cookies 
	      System.out.println(cookiesList.size());
	      
	      //Print name & value for all cookies 
	      for (Cookie ck:cookiesList) {
	    	  System.out.println(ck.getName() + ":"+ ck.getValue() );
	    	  
	  
	    	  }
	      
	  	  //Print cookies details 
    	  System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
    	  
    	  //Delete cookie
    	  
    	  driver.manage().deleteCookie(cookieObj);
    	  
    	  //Delete all cookie
    	  
    	  driver.manage().deleteAllCookies();
	  

	}

}
