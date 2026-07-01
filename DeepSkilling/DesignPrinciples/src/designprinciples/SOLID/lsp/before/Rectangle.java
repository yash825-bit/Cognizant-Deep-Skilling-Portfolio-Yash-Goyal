package designprinciples.SOLID.lsp.before;

public class Rectangle {
	
	protected int height;
	protected int width;
	
	void setHeight(int height) {
		this.height = height;
	}
	void setWidth(int width) {
		this.width = width;
	}
	
	int area() {
		
		return height*width;
		
	}

}
