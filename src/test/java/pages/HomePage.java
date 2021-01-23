package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//a[@class='login']")
	public WebElement signInLink;
	
	
	@FindBy (id = "search_query_top")
	public WebElement searchBar;
	
	
	public WebElement getProduct(String prod) {
		
		String xpath = "//a[@class='product-name'][@title='"+ prod +"']" ;
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	

}
