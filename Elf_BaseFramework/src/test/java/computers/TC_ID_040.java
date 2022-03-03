package computers;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.RemoveProductFromCart;
  /***
   * 
   * @author Sainath
   *
   */

public class TC_ID_040 extends Base_Class {
	
	@Test
	 public void removeproduct() {
	  RemoveProductFromCart cart = new RemoveProductFromCart(driver) ; 
		 
	   cart.getAppshoe().click();
	   cart.getEle().click();
	   cart.getJns().click();
	   cart.getBel().click();
	   cart.getAtb().click();
	   cart.getCtb().click();
	   cart.getRfm().click();
	   cart.getUpc().click();
	}

}
