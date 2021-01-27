package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy (xpath = "//span[@itemprop='sku']")
	public WebElement modelName;
	
	@FindBy (xpath = "//p[@id='product_condition']//span[@class='editable']")
	public WebElement condition;

	
	@FindBy (id = "group_1")
	public WebElement selectBox;
	
	public String getDefaultSize() {
		
		return new Select(selectBox).getFirstSelectedOption().getText();
		
	}
}
