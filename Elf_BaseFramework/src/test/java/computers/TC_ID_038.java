package computers;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.ApparelAndShoes;
   /***
    * 
    * @author Sainath
    *
    */
public class TC_ID_038 extends Base_Class{
  
  
	@Test
	 public void addcart() {
		
		ExcelUtil excellib = new ExcelUtil() ;
		String expectedTitle = excellib.readStringDataFromExcel("Sheet1",0,0);
		String expectedJeansTitle = excellib.readStringDataFromExcel("Sheet1",1,0);
	    ApparelAndShoes app = new ApparelAndShoes(driver) ;
	    
     
			
		 app.getApperalShoes().click();
		 Assert.assertEquals(driver.getTitle(), expectedTitle, "aperal page is displayed");
		  Reporter.log("ApperalShoes page should be displayed",true);
		  
		  app.getApparelshoe().click() ;
		  app.getDisplay().click();
		  
		  
		 
		  
		  app.getJeans().click();
		  Assert.assertEquals(driver.getTitle(), expectedJeansTitle, "jeans page is displayed");
		    Reporter.log("Jeans page should be displayed",true);
		  
	      app.getCart().click(); 
	     
	                                       
	 }
	
	
                      	
	
}
	
     

            