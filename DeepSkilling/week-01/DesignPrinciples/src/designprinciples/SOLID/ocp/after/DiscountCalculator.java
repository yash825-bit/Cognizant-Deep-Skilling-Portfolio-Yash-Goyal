package designprinciples.SOLID.ocp.after;

public class DiscountCalculator {
	
	public double calculateDiscount(Discount discount, double amount) {
		
		return discount.calculate(amount);
		
	}
}
