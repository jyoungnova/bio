package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//input[@class='form-control login_field ng-pristine ng-invalid ng-touched']")
	public WebElement userName;
	
	
	@FindBy (xpath = "//input[@class='form-control login_field ng-untouched ng-pristine ng-invalid']")
	public WebElement password;
	
	
	
	
	
	
	
	@FindBy (xpath = "//a[@title='Dresses']")
	public WebElement dressesLink;
	
	
	
	public void clickOnLink(String link) {
	    
		String xpath = "(//a[.='"+link+"'])[1]" ;
		BrowserUtils.jsClick(Driver.getDriver().findElement(By.xpath(xpath)));
	}
	
	
	public String getPageName() {
		return Driver.getDriver().findElement(By.xpath("//span[@class='category-name']")).getText();
	}

}
