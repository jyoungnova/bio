package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SignInPage {
	
	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (id = "email")
	public WebElement username;
	
	@FindBy (id = "passwd")
	public WebElement password;
	
	@FindBy (id = "SubmitLogin")
	public WebElement signInButton;

	@FindBy (xpath = "//ol/li")
	public WebElement errorMessage;

	@FindBy (id = "email_create")
	public WebElement createAcctEmail;

	@FindBy (id = "SubmitCreate")
	public WebElement createAcctButton;

}
