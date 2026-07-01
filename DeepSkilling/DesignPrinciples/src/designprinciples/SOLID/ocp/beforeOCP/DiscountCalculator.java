package designprinciples.SOLID.ocp.beforeOCP;

public class DiscountCalculator {
	
	public double calculateDiscount(String customerType, double amount) {
		
		if(customerType.equals("Regular")) {
			
			return amount*0.1;
			
		} 
		else if(customerType.equals("Premium")) {
			
			return amount*0.2;
			
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		DiscountCalculator discount = new DiscountCalculator();
		
		double regularDiscount = discount.calculateDiscount("Regular", 100.0);
		double premiumDiscount = discount.calculateDiscount("Premium", 100.0);
		
		System.out.println("Regular Discount : " + regularDiscount);
		System.out.println("Premium Discount : " + premiumDiscount);
		
	}

}

//Why this violates Open Closed Principle : The DicountCalcultor class will needs to be modified
//everytime when there is new type of discount arrives(e.g. Employee Discount) we need to modify 
//the method inside the class everytime.
