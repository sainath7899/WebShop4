package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoes {

	public ApparelAndShoes(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelshoes;

	public WebElement getApperalShoes() {
		return apparelshoes;
	}

	@FindBy(id="products-orderby")
	 private WebElement apparelshoe;

	public WebElement getApparelshoe() {
		return apparelshoe;
	}
	
	@FindBy(id="products-pagesize") 
	private WebElement display ;

	public WebElement getDisplay() {
		return display;
	}

	 @FindBy(linkText="Blue Jeans") 
		 private WebElement jeans ;
                                            
	public WebElement getJeans() {
		return jeans;
	}

	@FindBy(id="add-to-cart-button-36")
	  private WebElement cart ;

	public WebElement getCart() {
		return cart;
	}
	
    		
}	
	
	

