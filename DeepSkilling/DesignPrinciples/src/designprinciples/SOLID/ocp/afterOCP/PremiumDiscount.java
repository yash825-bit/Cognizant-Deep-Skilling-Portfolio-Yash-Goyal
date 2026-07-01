package designprinciples.SOLID.ocp.afterOCP;

public class PremiumDiscount extends Discount{
	
	public double calculate(double amount) {
		
		return amount*0.2;
		
	}

}
