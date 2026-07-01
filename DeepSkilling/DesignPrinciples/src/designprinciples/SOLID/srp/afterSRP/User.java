package designprinciples.SOLID.srp.afterSRP;

public class User {
	
	private String name;
	private String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
		
}
//User class : only handles managing of user data.
