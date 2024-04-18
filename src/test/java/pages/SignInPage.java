package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SignInPage {
	
	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (id = "user-name")
	public WebElement username;
	
	@FindBy (id = "password")
	public WebElement password;
	
	@FindBy (xpath = "//input[@id='login-button']")
	public WebElement loginButton;

	
	@FindBy (xpath = "//h3[@data-test=\"error\"]")
	public WebElement errorMessageOnSignInPage;
}
