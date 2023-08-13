package DemoMaven.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


/******************************XML Name ****************************************/
//(enabled=false) means we dont want to show this case. In class
//(enabled=true) means we want to show this case. In class
//<exclude name="WebLoginPersonalLoan"/> use this on XML file if we dont want to show this. In XML
//<include name="WebLoginPersonalLoan"/> use this on XML file if we  want to show this.In XML
//For description we can use like this --   @BeforeClass(description="This is for description")
//We can set as priority. priority value is -5000 to 5000. we can set like this 	@Test(priority=1)
//We can use for depending methods so if any test methods depend on another . like this @Test(dependsOnMethods= {"test1"})
//We can forcefully fail the test cases using Assert.assertTrue(false); in the methods 


//We can set groups , which will run through .xml file . in the class like this - (groups = "Mobile")
//in the .xml , like this   <groups>
//<run>
//<include name="Mobile"></include>
//</run>
//</groups>

public class GroupingExample {
  @Test(groups = "Mobile")
  public void Samsung() {
	  
	  System.out.println("Hi i am samsung ");
  }
  
  
  @Test
  public void BMW() {
	  
	  System.out.println("Hi we are BMW");
  }
  
  @Test(groups = "Mobile")
  public void Nokia() {
	  
	  System.out.println("Hi i am Nokia ");
  }
  
  @Test
  public void Honda() {
	  
	  System.out.println("Hi we are Honda  ");
  }
}
