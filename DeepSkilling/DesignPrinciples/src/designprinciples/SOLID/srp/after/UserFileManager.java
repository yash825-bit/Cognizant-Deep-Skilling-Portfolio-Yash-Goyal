package designprinciples.SOLID.srp.after;

import java.io.FileWriter;
import java.io.IOException;

public class UserFileManager {
	
public void saveTOFile(designprinciples.SOLID.srp.after.User user1) {
		
		try(FileWriter fileWriter = new FileWriter(user1.getName() + ".txt")) {
			fileWriter.write("Name : " + user1.getName());
			fileWriter.write("Email : " + user1.getEmail());
			System.out.println("file save successfully");
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
	}
}
//UserFileManager : Manages user file and saves the user data only.
