package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductFromCart {

	public RemoveProductFromCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(partialLinkText = "Apparel & Shoes")
	  private WebElement appshoe ;

	public WebElement getAppshoe() {
		return appshoe;
	}
	  @FindBy(id="products-orderby")
	  private WebElement ele ;

	public WebElement getEle() {
		return ele;
	}
	
	 @FindBy(id="products-pagesize")
	 private WebElement jns;

	public WebElement getJns() {
		return jns;
	}
	
	 @FindBy(linkText="Blue Jeans") 
	   private WebElement bel;

	public WebElement getBel() {
		return bel;
	}
	
	 @FindBy(id="add-to-cart-button-36") 
	  private WebElement atb;

	public WebElement getAtb() {
		return atb;
	}
	
	 @FindBy(className="cart-label")
	   private WebElement ctb ;

	public WebElement getCtb() {
		return ctb;
	}
	
	 @FindBy(name="removefromcart")
	  private WebElement rfm;

	public WebElement getRfm() {
		return rfm;
	}
	
	 @FindBy(name="updatecart")
	  private WebElement upc;

	public WebElement getUpc() {
		return upc;
	}

	




	
	
	
	

}
