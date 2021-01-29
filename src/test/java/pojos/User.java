package pojos;

public class User {
	
	
	private String first;
	private String last;
	private String dateOfBirth;
	private String password;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	
	public User(String first, String last, String dateOfBirth, String password, String address, String city,
			String state, String zip, String phoneNumber) {
		super();
		this.first = first;
		this.last = last;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "User [first=" + first + ", last=" + last + ", dateOfBirth=" + dateOfBirth + ", password=" + password
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	
	
	
	

}
