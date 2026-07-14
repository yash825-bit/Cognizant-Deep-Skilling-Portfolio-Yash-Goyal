package designprinciples.SOLID.isp.before;

class Robot implements Worker{
	
	public void work() {
		
		System.out.println("Robot work");
		
	}
	
	public void eat() {
		throw new UnsupportedOperationException();
	}
}

//Here Class Robot is being forced to implement the eat method from the Worker interface
//although it has no need of eat() method as robots do not eat