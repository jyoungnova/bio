package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductPage;
import utilities.Driver;
import utilities.ExcelUtils;

public class PromotedProductStepDefs {
	

	@Then("The promoted product details should be correct")
	public void thePromotedProductDetailsShouldBeCorrect() {
	   
		HomePage hp = new HomePage();
		ProductPage pp = new ProductPage();
		
		ExcelUtils sheet = new ExcelUtils("testData.xlsx", "Sheet1");
		
		List<Map<String, String>> rows = sheet.getDataAsMap();
		
		
		for (int i = 0; i < rows.size(); i++) {
			
			Map<String, String> map = rows.get(i);
			
			     if( map.get("Execute").equals("Y")) {
			    	 
			    	 
			    	 String expectedName = map.get("Product");
			    	 String expectedPrice = map.get("Price");
			    	 String expectedModel = map.get("Model");
			    	 String expectedComposition = map.get("Composition");
			    	 String expectedStyles = map.get("Styles");
			    	 
			    	 hp.clickOnProduct(expectedName);
			    	 
			    	 String actualName = pp.productName.getText();
			    	 String actualPrice = pp.price.getText();
			    	 String actualModel = pp.modelName.getText();
			    	 String actualComposition = pp.composition.getText();
			    	 String actualStyles = pp.styles.getText();
			    	 
			    	 try {
			    		 assertEquals(expectedName, actualName);
				    	 assertEquals(expectedPrice, actualPrice);
				    	 assertEquals(expectedModel, actualModel);
				    	 assertEquals(expectedComposition, actualComposition);
				    	 assertEquals(expectedStyles, actualStyles);
				    	 
				    	 sheet.setCellData("PASS", "Status", i+1);
				    	 
			    	 }catch(AssertionError e) {
			    		 sheet.setCellData("FAIL", "Status", i+1);
			    		 throw e;
			    	 }
			    	 
			    	
			    	 
			    	 
			    	
			    	 
			    	 Driver.getDriver().navigate().back();
			    	
			     }else {
			    	
			    	 
			    	 sheet.setCellData("SKIPPED", "Status", i+1);
			     }
			
			
			
		}
		
		
	}

}
