package designprinciples.SOLID.ocp.after;

public class PremiumDiscount extends Discount{
	
	public double calculate(double amount) {
		
		return amount*0.2;
		
	}

}
