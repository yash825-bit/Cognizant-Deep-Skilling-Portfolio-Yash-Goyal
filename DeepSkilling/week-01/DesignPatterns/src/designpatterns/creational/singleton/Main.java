package designpatterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		logger1.log("Waking up the engine");
		logger2.log("Driver, buckle up");
		
		System.out.println(logger1 == logger2);

	}

}
