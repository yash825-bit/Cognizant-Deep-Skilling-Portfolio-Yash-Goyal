package designprinciples.SOLID.isp.before;

public class Main {

	public static void main(String[] args) {
		
		Worker human = new Human();
		Worker robot = new Robot();
		
		human.work();
		human.eat();
		
		robot.work();
		robot.eat();

	}

}
