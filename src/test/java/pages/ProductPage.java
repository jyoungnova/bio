package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ProductPage {
	
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//h1")
	public WebElement productName;
	
	
	@FindBy (id = "our_price_display")
	public WebElement price;
	
	@FindBy (id = "quantity_wanted")
	public WebElement qunatityBox;

}
