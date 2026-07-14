package designprinciples.SOLID.isp.after;

public class Main {
	
	public static void main(String[] args) {
		
		Human human = new Human();
		Robot robot = new Robot();
		
		human.work();
		human.eat();
		
		robot.work();
	
	}
}
