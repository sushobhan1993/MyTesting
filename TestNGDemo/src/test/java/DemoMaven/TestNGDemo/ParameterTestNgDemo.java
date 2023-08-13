package DemoMaven.TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//Xml file is ParameterTestNgDemo

public class ParameterTestNgDemo {
  
	
	@Test
	@Parameters({"i","j"})
  public void addition(int a, int b) {
		
		System.out.println(a+b);
  }
	
	@Test
	@Parameters({"i","j"})
	  public void Substract(int a, int b) {
			
			System.out.println(a-b);
	  }
	
	@Test
	@Parameters({"i","j"})
	  public void Multiplication(int a, int b) {
			
			System.out.println(a*b);
	  }
}
