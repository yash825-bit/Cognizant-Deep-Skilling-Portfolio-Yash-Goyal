package designprinciples.SOLID.lsp.after;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		Square square = new Square(10);
		
		System.out.println("Area of Rectangle : " + rectangle.area());
		System.out.println("Area of Square : " + square.area());
		
	}

}
