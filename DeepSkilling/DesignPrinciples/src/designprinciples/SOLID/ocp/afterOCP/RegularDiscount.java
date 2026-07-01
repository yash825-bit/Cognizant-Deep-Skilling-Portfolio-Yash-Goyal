package designprinciples.SOLID.ocp.afterOCP;

public class RegularDiscount extends Discount{

	public double calculate(double amount)
	{
		return amount*0.1;
	}
}
