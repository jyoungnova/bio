package step_definitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import pojos.Product;
import pojos.User;

public class PojoTransformers {
	
	// transform Product pojo into Cucumber type
	
	
	@DataTableType
	public Product getProduct (Map<String, String> row) {
		
		String name = row.get("name");
		String size = row.get("size");
		String modelName = row.get("modelName");
		int quantity = Integer.parseInt(row.get("quantity"));
		String condition = row.get("condition");
		double price = Double.parseDouble(row.get("price"));
		
		
		return new Product(name, size, modelName, quantity, condition, price);
	}
	
	
	@DataTableType
	public User getUser (Map<String,String> user) {
			
		
	
		return new User(user.get("first"), 
						user.get("last"), 
						user.get("dateOfBirth"), 
						user.get("password"),
						user.get("address"),
						user.get("city"),
						user.get("state"), 
						user.get("zip"),
						user.get("phoneNo"));
	}
	
	
	

}
