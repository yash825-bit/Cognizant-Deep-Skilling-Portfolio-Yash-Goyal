package designprinciples.SOLID.lsp.after;

class Rectangle implements Shape{
	
	private int width;
	private int height;
	
	//constructor
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int area() {
		
		return height*width;
	}

}
