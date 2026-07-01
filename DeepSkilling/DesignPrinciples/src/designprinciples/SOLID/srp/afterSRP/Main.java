package designprinciples.SOLID.srp.afterSRP;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Yash","yash.goyal@example.com");
		
		UserFileManager fileManager = new UserFileManager();
		fileManager.saveTOFile(user1);
		
	}
}
//Main class : For user and implementation.
