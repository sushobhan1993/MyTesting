package DemoMaven.TestNGDemo;

import org.testng.annotations.Test;

/******************************XML Name ****************************************/
// (enabled=false) means we dont want to show this case. In class
// (enabled=true) means we want to show this case. In class
//  <exclude name="WebLoginPersonalLoan"/> use this on XML file if we dont want to show this. In XML
// <include name="WebLoginPersonalLoan"/> use this on XML file if we  want to show this.In XML

public class LoanDept {
	@Test(enabled=true)
	public void MobileLoginPersonalLoan() {

		System.out.println("Mobile Login Personal loan");
	}

	/*
	 * // (enabled=false) means we dont want to show this case.
	 * 
	 * @Test(enabled=false) 
	 * public void WebLoginPersonalLoan() {
	 * 
	 * System.out.println("WebLogin Personal loan");
	 */


	@Test
	public void WebLoginPersonalLoan() {

		System.out.println("WebLogin Personal loan");
	}


	@Test
	public void ApiLoginPersonalLoan() {

		System.out.println("Api Login Personal loan");
	}

	@Test
	public void MobileLoginAutomobilePersonalLoan() {

		System.out.println("Mobile Login Automobile Personal Loan");
	}

	@Test
	public void ApiLoginAutomobilePersonalLoan() {

		System.out.println("Api Login Automobile Personal Loan");
	}

	@Test
	public void WebLoginAutomobilePersonalLoan() {

		System.out.println("Web Login Automobile Personal Loan");
	}



}
