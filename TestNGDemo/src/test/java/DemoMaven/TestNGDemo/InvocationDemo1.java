package DemoMaven.TestNGDemo;

import org.testng.annotations.Test;

/*************************************************************************
 * XML file name :
 * Another class :
 * Program details : helping with  @Test(invocationCount=4) wer can use one test case multiple time
 * 
 * 
 *************************************************************************/	

public class InvocationDemo1 {
  @Test(invocationCount=4)
  public void Test1() {
	  System.out.println("Testing 1");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Testing 2");
  }
}
