package pojos;

public class Product {
	
	
	
	private String name;
	private String size;
	private String modelName;
	private int quantity;
	private String condition;
	private double price;
	
	
	public Product() {
		
	}


	public Product(String name, String size, String modelName, int quantity, String condition, double price) {
		super();
		this.name = name;
		this.size = size;
		this.modelName = modelName;
		this.quantity = quantity;
		this.condition = condition;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", size=" + size + ", modelName=" + modelName + ", quantity=" + quantity
				+ ", condition=" + condition + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
