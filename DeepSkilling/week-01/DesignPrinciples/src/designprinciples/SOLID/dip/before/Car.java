package designprinciples.SOLID.dip.before;

public class Car {
	
	private Engine engine = new Engine();
	
	void drive() {
		
		engine.start();
		System.out.println("Car is moving");
		
	}

}

/*here Car is dependent on Engine 
 * Car ---> Engine
 * because car needs an engine
 */