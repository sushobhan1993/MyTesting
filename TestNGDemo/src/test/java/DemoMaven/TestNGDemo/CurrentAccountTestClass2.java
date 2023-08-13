package DemoMaven.TestNGDemo;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

/******************************XML Name ****************************************/
//(enabled=false) means we dont want to show this case. In class
//(enabled=true) means we want to show this case. In class
//<exclude name="WebLoginPersonalLoan"/> use this on XML file if we dont want to show this. In XML
//<include name="WebLoginPersonalLoan"/> use this on XML file if we  want to show this.In XML
//For description we can use like this --   @BeforeClass(description="This is for description")
// We can set as priority. priority value is -5000 to 5000. we can set like this 	@Test(priority=1)
//We can use for depending methods so if any test methods depend on another . like this @Test(dependsOnMethods= {"test1"})
//We can forcefully fail the test cases using Assert.assertTrue(false); in the methods 




public class CurrentAccountTestClass2 {
	
@BeforeClass(description="This is for description")
	 public void BeforeClass() {
	     System.out.println("Its for before class,so it will run 1st ");
	  }

@AfterClass 
public void AfterClass() {
    System.out.println("Its for after class,so it will run 1st ");
 }


	

	 @BeforeMethod 
	 public void BeforeMethod() {
	     System.out.println("Its for before method");
	  }
	
	@Test(priority=1)
	  public void test1() {
	     System.out.println("CurrentAccount 1");
	     Assert.assertTrue(false);
	  }
	  
	  @Test(dependsOnMethods= {"test1"})
	  public void test2() {
		  System.out.println("CurrentAccount 2");
	  }
	  
	  @AfterMethod
	  public void AftMethod() {
	        System.out.println("Its for after method");
	    }

}
