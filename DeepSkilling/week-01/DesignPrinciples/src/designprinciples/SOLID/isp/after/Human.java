package designprinciples.SOLID.isp.after;

class Human implements Workable, Eatable{
	
	public void work() {
		System.out.println("Human is Working");
	}
	
	public void eat() {
		System.out.println("Human is Eating");
	}
	
}
