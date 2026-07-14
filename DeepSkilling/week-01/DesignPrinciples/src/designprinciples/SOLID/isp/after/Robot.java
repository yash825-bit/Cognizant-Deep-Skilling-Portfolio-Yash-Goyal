package designprinciples.SOLID.isp.after;

public class Robot implements Workable{
	
	public void work() {
		System.out.println("Robot is Working");
	}
}

//We will not implement Eatable as robots do not eat. thus it follows isp.