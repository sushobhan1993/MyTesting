package FailedTestCaseRetry;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FailedTestCase {
	
	
  @Test(retryAnalyzer = RetryAnalyser.class )
  public void TestCase01() {
	  
	  Assert.assertTrue(false);  
	  }
  
  

@Test
public void TestCase02() {
	  
	  Assert.assertTrue(false);  
	  }



@Test
public void TestCase03() {
	  
	  Assert.assertTrue(true);  
	  }


}


