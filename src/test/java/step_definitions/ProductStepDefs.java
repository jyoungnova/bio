package step_definitions;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

import pages.ProductPage;
import pages.SignInPage;

import utilities.BrowserUtils;
import utilities.Driver;

public class ProductStepDefs extends BrowserUtils{
	
	
	 String expectedProductName;
	 int countProducts = 0;
	 
	 @When("The user clicks on sort icon to sort by name A-Z")
	 public void theUserClicksOnSortIconToSortByNameAZ() {
		 ProductPage pp = new ProductPage();
		 Select s = new Select(pp.sortMenu);
		 s.selectByValue("az");
		 
	 }

	 @Then("The items are sorted by name")
	 public void theItemsAreSortedByName() {
		 List<WebElement> productList = Driver.getDriver().findElements(By.xpath("//div[@data-test='inventory-item-name']"));
		 List<String> productNames = new ArrayList<>();
		 List<String> sortedList = new ArrayList<>();
	        for (WebElement product : productList) {
	            String productName = product.getText();
	            productNames.add(productName);
	            sortedList.add(productName);
	            System.out.println("Product is " + product);
	            System.out.println("Product Name is " + productName);
	        }
	       
	        Collections.sort(sortedList);
	        assertEquals(sortedList, productNames);
	     
	 }

	 
	 
	 @When("The user clicks on sort icon to sort by price low to high")
	 public void theUserClicksOnSortIconToSortByPriceLowToHigh() {
		 ProductPage pp = new ProductPage();
		 Select s = new Select(pp.sortMenu);
		 s.selectByValue("lohi");
	 }

	 
	 @Then("The items are sorted by price")
	 public void thenTheItemsAreSortedByPrice() {
		 List<WebElement> productList = Driver.getDriver().findElements(By.xpath("//div[@class='inventory_item_price']"));
	     List<Double> priceOfProduct = new ArrayList<>();
		 List<Double> sortedList = new ArrayList<>();
	        for (WebElement product : productList) {
	            String productPrice = product.getText();
	            productPrice = productPrice.substring(1);
	            double productPriceInDouble = Double.parseDouble(productPrice);
	            System.out.println("The value is: " + productPriceInDouble);
	            Logger.getLogger(""+productPriceInDouble);
	            priceOfProduct.add(productPriceInDouble);
	            sortedList.add(productPriceInDouble);
	        }
	     Collections.sort(sortedList);
	     assertEquals(sortedList, priceOfProduct);
		 
	 }
	 
	 
	 @Then("The user adds Onesie to cart")
	 public void the_user_adds_onesie_to_cart() {
		 ProductPage pp = new ProductPage();
		 pp.onesie.click();
		 countProducts++;
	 }
	 
	 @Then("The user adds Backpack to cart")
	 public void the_user_adds_backpack_to_cart() {
		 ProductPage pp = new ProductPage();
		 pp.backpack.click();
		 countProducts++;
	 }
	 
	 
	 @Then("The user adds redSweater to cart")
	 public void the_user_adds_redSweater_to_cart() {
		 ProductPage pp = new ProductPage();
		 pp.redSweater.click();
		 countProducts++;
		 
	 }
	 

	 @Then("Click on Checkout")
	 public void click_on_checkout() throws InterruptedException {
	     Thread.sleep(2000);
	     ProductPage pp = new ProductPage();
	     pp.cart.click();
	     pp.checkout.click();
	     assertEquals(3,countProducts);
	    
	     CheckoutPage cp = new CheckoutPage();
	     cp.checkoutFirstName.sendKeys("Test");
	     cp.checkoutLastName.sendKeys("LastNameTest");
	     cp.checkoutZipCode.sendKeys("22222");
	     cp.continueButton.click();
	     assertTrue(cp.finishButton.isDisplayed());
	     cp.finishButton.click();
	     
	 }

	 
	 @Then("Click on Logout")
	 public void click_on_logout() {
		 CheckoutPage cp = new CheckoutPage(); 
		 SignInPage sp = new SignInPage();
		 cp.menuButton.click();
		 cp.logoutButton.click();
		 assertTrue(sp.loginButton.isDisplayed());
		 
	 }


	 @Then("The Images are displayed incorrectly")
	 public void theImagesAreDisplayedCorrectly(){
	     ProductPage pp = new ProductPage();
	     
	 try {
         assertEquals(true, pp.firstImage.isDisplayed());
         System.out.println("Wrong Image");
    	  
      }
       catch (NoSuchElementException e) {
         System.out.println("The first image is not displayed.");
     } catch (AssertionError e) {
         System.out.println("The first image is not displayed correctly.");
         // Take a screenshot if assertion fails
         BrowserUtils.takeScreenshot(pp.firstImage);
     }
	 
	 
	 
	 }
	 
	 @When("The user verifies the images matching products")
	 public void theUserVerifiesTheImagesMatchingProducts() throws IOException {
	 ProductPage pp = new ProductPage(); 
     String curentScreenshot = BrowserUtils.getScreenshot("pp.firstImage"); 
    
     CheckoutPage cp = new CheckoutPage();
     cp.menuButton.click();
     cp.logoutButton.click();
     
     SignInPage sp = new SignInPage();
     sp.username.sendKeys("standard_user");
     sp.password.sendKeys("secret_sauce");
     sp.loginButton.click();

     String actualScreenshot = BrowserUtils.getScreenshot("pp.actualFirstImage");
      
    assertNotEquals(curentScreenshot,actualScreenshot);
}
	 
	


}
