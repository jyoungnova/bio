package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class RegisterPage {
	
	
	public RegisterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (id = "customer_firstname")
	public WebElement firstName;
	
	@FindBy (id = "customer_lastname")
	public WebElement lastName;
	
	@FindBy (id = "passwd")
	public WebElement password;
	
	public void selectDOB(String dob) {
		
		String[] split = dob.split("/");
		new Select(Driver.getDriver().findElement(By.name("days"))).selectByValue(split[0]);

		new Select(Driver.getDriver().findElement(By.name("months"))).selectByValue(split[1]);

		new Select(Driver.getDriver().findElement(By.name("years"))).selectByValue(split[2]);
		
	}
	
	@FindBy (id = "address1")
	public WebElement address;
	
	@FindBy (id = "city")
	public WebElement city;
	
	@FindBy (id = "postcode")
	public WebElement zip;
	
	@FindBy (id = "phone_mobile")
	public WebElement phone;
	
	@FindBy (id = "submitAccount")
	public WebElement registerButton;
	
	public void selectState(String state) {
		new Select(Driver.getDriver().findElement(By.name("id_state"))).selectByVisibleText(state);
	}
	

}
