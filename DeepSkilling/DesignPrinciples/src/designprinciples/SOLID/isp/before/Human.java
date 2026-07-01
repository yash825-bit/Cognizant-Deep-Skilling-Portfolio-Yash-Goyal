package designprinciples.SOLID.isp.before;

class Human implements Worker{
	
	public void work() {
		System.out.println("Human Works");
	}
	
	public void eat() {
		System.out.println("Human eats");
	}
	
}
//here it is correct since humans do both work and eat so it valid to implements both the methods
//from the interface.