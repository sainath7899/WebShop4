package computers;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.addToWishListPage;
  /***
   * 
   * @author Sainath
   *
   */
public class TC_ID_039 extends Base_Class {
	
	@Test
	public void addwishlist()  {
		
		ExcelUtil excellib = new ExcelUtil() ;
 //	String expectedTitle = excellib.readStringDataFromExcel("Sheet1",0,0);
   // String expectedJeansTitle = excellib.readStringDataFromExcel("Sheet1",1,0);
		
	  addToWishListPage wish = new addToWishListPage(driver) ;
	  
	   wish.getApparel().click();
	   wish.getRel().click();
	   wish.getDis().click();
	   wish.getShoe().click();
	   wish.getSee().click();
	   wish.getList().click();
	   wish.getRemov().click();
	   wish.getUpdt().click();
		
	}

		
		
	
	
}	