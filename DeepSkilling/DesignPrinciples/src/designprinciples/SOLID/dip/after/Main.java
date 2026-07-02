package designprinciples.SOLID.dip.after;

public class Main {

	public static void main(String[] args) {
		
		Engine engine = new PetrolEngine();
		
		Car car = new Car(engine);
		
		car.drive();

	}

}
