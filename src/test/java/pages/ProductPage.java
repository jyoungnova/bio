package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class ProductPage {
	
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//select[@class='product_sort_container']")
	public WebElement sortMenu;
	
	
	@FindBy (xpath = "//div[@data-test='inventory-item-name']")
	public List<WebElement> listOfProductNames;
	
	
	
	@FindBy (id = "add-to-cart-sauce-labs-onesie")
	public WebElement onesie;
	
	
	
	@FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	public WebElement redSweater;
	
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	public WebElement backpack;
	
	
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	public WebElement cart;
	
	
	@FindBy (xpath = "//span[@class='shopping_cart_badge']")
	public WebElement shoppringCartCount;
	
	

	@FindBy (xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
	public WebElement checkout;
	
	

	@FindBy (xpath = "//a[@id=\"item_4_img_link\"]//img[@src=\"/static/media/sl-404.168b1cce.jpg\"]")
	public WebElement firstImage;
	
	
	@FindBy (xpath = "//a[@id=\"item_4_img_link\"]//img[@src=\"/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg\"]")
	public WebElement actualFirstImage;
	
	
	
	
	
	
}
