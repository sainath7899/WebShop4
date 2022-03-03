package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToWishListPage {
	
	public addToWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparel ;


	public WebElement getApparel() {
		return apparel;
	}
	
	@FindBy(id="products-orderby")
	private WebElement rel ;


	public WebElement getRel() {
		return rel;
	}
	 
	@FindBy(id="products-pagesize")
	private WebElement dis;


	public WebElement getDis() {
		return dis;
	}

	@FindBy(linkText="Blue and green Sneaker")
	private WebElement shoe;


	public WebElement getShoe() {
		return shoe;
	}
	
	@FindBy(id="add-to-wishlist-button-28")
	private WebElement see ;


	public WebElement getSee() {
		return see;
	} 
	
	@FindBy(linkText="Wishlist")
	private WebElement list;


	public WebElement getList() {
		return list;
	}
	
	
    @FindBy(name="removefromcart")
    private WebElement remov;


	public WebElement getRemov() {
		return remov;
	}
	   
	
	@FindBy(name="updatecart")
	private WebElement updt;


	public WebElement getUpdt() {
		return updt;
	}
	
	
	
	
	
	
	
	
	
	
}
