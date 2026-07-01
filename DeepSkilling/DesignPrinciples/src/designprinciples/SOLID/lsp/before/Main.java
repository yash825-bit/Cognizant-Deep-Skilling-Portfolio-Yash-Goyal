package designprinciples.SOLID.lsp.before;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rect = new Square();
		
		rect.setHeight(5);
		rect.setHeight(10);
		
		System.out.println(rect.area());
	}

}
//expected area = 50; but actual calculated area = 100;
//this violates LSP as substituting subclass (i.e square) in place of superclass(i.e rectangle)
//changing the behavior of the superclass (rectangle).