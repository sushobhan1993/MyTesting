package BatchTesting;

import org.testng.annotations.Test;

	/*************************************************************************
	 *LaunchApplication
	 *VrifyTitle
	 *VerifyLogo
	 * 
	 *Test case :  https://prnt.sc/VeOH4UbaF6vh
     * Parent class is : 
	 * XML file name :
	 *Package xml file for suite : Suite.xml
	 *************************************************************************/	

public class HomeScreenTest {
  @Test
  public void LaunchApplication() {
	  
	  System.out.println("Application launch passed");
  }
  
  @Test
  public void VrifyTitle() {
	  
	  System.out.println("VrifyTitle passed");
  }
  
  @Test
  public void VerifyLogo() {
	  
	  System.out.println("VerifyLogo passed");
  }


}
