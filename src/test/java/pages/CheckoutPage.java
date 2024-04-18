package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CheckoutPage {
	
	
	public CheckoutPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//input[@id='first-name']")
	public WebElement checkoutFirstName;

	
	@FindBy (xpath = "//input[@id='last-name']")
	public WebElement checkoutLastName;
	

	@FindBy (xpath = "//input[@id='postal-code']")
	public WebElement checkoutZipCode;
	
	
	@FindBy (id="continue")
	public WebElement continueButton;
	

	@FindBy (id="finish")
	public WebElement finishButton;
	
	
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	public WebElement menuButton;
	
	
	@FindBy (id="logout_sidebar_link")
	public WebElement logoutButton;
}

