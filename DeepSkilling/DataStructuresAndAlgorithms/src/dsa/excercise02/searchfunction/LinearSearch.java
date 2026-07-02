package dsa.excercise02.searchfunction;

public class LinearSearch {
	
	public Product search(Product[] products, int productId) {
		
		for(Product product : products) {
			
			if(product.getProductId() == productId) {
				
				return product;
			}
		}
		return null;
	}

}
