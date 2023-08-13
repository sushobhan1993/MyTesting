package DemoMaven.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*************************************************************************
 * Parent class is : ListnerDemo1
 * XML file name :Listeners.xml
 * Here we using ITestListener
 
 
 
 *************************************************************************/


public class ListenerClass implements ITestListener {
 /* @Test
  public void f() {
  }
}
*/
	
	//@Override
    public void onStart(ITestContext context) {
        // Test run starts
    	System.out.println("On start methods");
    	
    }

    //@Override
    public void onFinish(ITestContext context) {
        // Test run finishes
    	
    	System.out.println("On finish methods");
    }

	
	  // @Override
	  public void onTestStart(ITestResult result)
	   { // Test method starts
		  
		  System.out.println("Start test methods name "+result.getName());
		  }
	   
	 

   // @Override
    public void onTestSuccess(ITestResult result) {
        // Test method succeeds
    	System.out.println("Success test methods name "+result.getName());
    	
    }

   // @Override
    public void onTestFailure(ITestResult result) {
        // Test method fails
    	System.out.println("Failed test methods name "+result.getName());
    }

   // @Override
    public void onTestSkipped(ITestResult result) {
        // Test method is skipped
    	System.out.println("Skipped test methods name "+result.getName());
    }	
	
	
	
}