package designprinciples.SOLID.dip.before;

class ElectricEngine extends Engine{
	
	@Override
	void start() {
		System.out.println("Electric Engine starts");
	}
	
}
/*Now suppose we want to have more types of engines 
 * for e.g : Diesel engine, Petrol engine. so to use another type of engine we need to
 * modify the car class everytime
 * This violates Open Closed principle as well*/
