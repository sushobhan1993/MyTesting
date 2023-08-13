package DemoMaven.TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2a {
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
}
