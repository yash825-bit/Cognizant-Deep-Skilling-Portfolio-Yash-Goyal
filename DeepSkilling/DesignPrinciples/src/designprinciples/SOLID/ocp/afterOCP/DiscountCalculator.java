package designprinciples.SOLID.ocp.afterOCP;

public class DiscountCalculator {
	
	public double calculateDiscount(Discount discount, double amount) {
		
		return discount.calculate(amount);
		
	}
}
