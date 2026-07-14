package designprinciples.SOLID.lsp.before;

class Square extends Rectangle {
	
	@Override
	void setWidth(int width) {
		
		this.width = this.height = width;
	
	}
	
	@Override
	void setHeight(int height) {
		
		this.height = this.width = height;
	}

}
