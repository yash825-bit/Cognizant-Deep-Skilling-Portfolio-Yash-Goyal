package designprinciples.SOLID.ocp.after;

public class Main {

	public static void main(String[] args) {
		
		Discount regularDiscount = new RegularDiscount();
		Discount premiumDiscount = new PremiumDiscount();

		DiscountCalculator discount = new DiscountCalculator();
		
		double regularDiscountAmount = discount.calculateDiscount(regularDiscount, 100.0);
		double premiumDiscountAmount = discount.calculateDiscount(premiumDiscount, 100.0);
		
		System.out.println("Regular Discount : " + regularDiscountAmount);
		System.out.println("Premium Discount : " + premiumDiscountAmount);
		
	}
}
//here Discount class follows OCP as type of discounts(i.e. regularDiscount, premiumDiscount)
//are not modifying but extending the Discount class instead so if there is a new type of discount
//introduced that will also extend the Discount class instead of modifying it directly.
