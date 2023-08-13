package BatchTesting;

import org.testng.annotations.Test;

//AddProductToWishlist
//AddProductToCart
//SelectQuantity

/*************************************************************************
 * 
 *	 *Test case :  https://prnt.sc/VeOH4UbaF6vh
     * Parent class is : 
	 * XML file name :
	 * *Package xml file for suite : Suite.xml
	 *************************************************************************/	


public class ProductPageList {
  @Test
  public void AddProductToWishlist() {
	  System.out.println("AddProductToWishlist passed");
  }
  
  @Test
  public void AddProductToCart() {
	  System.out.println("AddProductToCart passed");
  }
  
  @Test
  public void SelectQuantity() {
	  System.out.println("SelectQuantity passed");
  }
  
}
