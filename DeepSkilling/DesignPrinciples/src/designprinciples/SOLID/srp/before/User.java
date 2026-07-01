package designprinciples.SOLID.srp.before;

import java.io.FileWriter;
import java.io.IOException;

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

	public void saveToFile() {
		
		try(FileWriter fileWriter = new FileWriter(name + ".txt")) {
			
			fileWriter.write("Name : " + name + "\n");
			fileWriter.write("Email : " + email + "\n");
			System.out.println("file saved successfully");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		User user = new User("Yash", "yash.goyal@example.com");
		
		user.saveToFile();	
	}
}

//why this violates SRP : 
//User class has two responsibilities, one is to manage user data and other is
//to save the data.
