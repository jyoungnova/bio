package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;
import pojos.Product;
import utilities.Driver;

public class ProductStepDefs {
	
	
	 String expectedProductName;
	
	
	@When("The user clicks on {string}")
	public void theUserClicksOn(String product) {
		HomePage hp = new HomePage();
		expectedProductName = product;  // sharing a state/data between step def methods is very common
		hp.getProduct(product).click();
		
	   
	}

	@Then("The user should land on the same product page and the title has to contain {string}")
	public void theUserShouldLandOnTheSameProductPageAndTheTitleHasToContainTheName(String expected) {
	    String actual = Driver.getDriver().getTitle();
	    assertTrue(actual.contains(expectedProductName));	// expectedProdcutName is being initoialized by the other method	
	}

	@Then("The product name should be {string}, the price should be {double} and the quantity should be {int}")
	public void theProductNameShouldBeThePriceShouldBeAndTheQuantityShouldBe(String expectedproductName, Double expPrice, Integer expQty) {
	    
		ProductPage pp = new ProductPage();
		
		String actualProductName = pp.productName.getText();
		Double actualPrice = Double.valueOf(pp.price.getText().replace("$", ""));
		Integer actualQty = Integer.valueOf(pp.qunatityBox.getAttribute("value"));
		
		assertEquals(expectedproductName, actualProductName);
		assertEquals(expPrice, actualPrice);
		assertEquals(expQty, actualQty);
		
		
	}
	
	
	
	

	@Then("The product information should be the following")
	public void theProductInformationShouldBeTheFollowing(List<List<String>> dataTable) {
	   System.out.println(dataTable.get(0).get(1));
	}
	
	
	
	@When("The product information should be the following using maps")
	public void theProductInformationShouldBeTheFollowingUsingMaps(List<Map<String, String>> dataTable) {
               
		ProductPage pp  = new ProductPage();
		
		for (Map<String, String> map : dataTable) {
			
			
			String expectedName = map.get("name");
			String expectedPrice = map.get("price");
			String expectedQty = map.get("quantity");
			String expectedSize = map.get("size");
			String expectedModel = map.get("modelName");
			String expectedCondition = map.get("condition");
			
			String actualName = pp.productName.getText();
			String actualPrice = pp.price.getText().replace("$", "");
			String actualQty = pp.qunatityBox.getAttribute("value");
			String actualSize = pp.getDefaultSize();
			String actualModel = pp.modelName.getText();
			String actualCondition = pp.condition.getText();
			
			assertEquals(expectedName, actualName);
			assertEquals(expectedPrice, actualPrice);
			assertEquals(expectedQty, actualQty);
			assertEquals(expectedSize, actualSize);
			assertEquals(expectedModel, actualModel);
			assertEquals(expectedCondition, actualCondition);
			
			
			
		}
			
		
		
		
		
	}
	
	
	@When("The product information should be the following using custom type")
	public void theProductInformationShouldBeTheFollowingUsingCustomType(List<Product> list) {
		ProductPage pp =new ProductPage();
		
		Product blouse = list.get(0);
		
		String actualName = pp.productName.getText();
		String actualPrice = pp.price.getText().replace("$", "");
		String actualQty = pp.qunatityBox.getAttribute("value");
		String actualSize = pp.getDefaultSize();
		String actualModel = pp.modelName.getText();
		String actualCondition = pp.condition.getText();
		
		assertEquals(blouse.getName(), actualName);
		assertEquals(blouse.getCondition(), actualCondition);
		assertEquals(blouse.getModelName(), actualModel);
		assertEquals(blouse.getPrice()+"", actualPrice.substring(0, actualPrice.length()-1));
		assertEquals(blouse.getQuantity(), Integer.parseInt(actualQty));
		assertEquals(blouse.getSize(), actualSize);
	
		
		

		
	    
	}
	
	
	


}
