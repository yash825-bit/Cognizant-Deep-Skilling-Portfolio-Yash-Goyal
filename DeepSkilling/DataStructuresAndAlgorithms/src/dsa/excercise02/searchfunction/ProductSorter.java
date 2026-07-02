package dsa.excercise02.searchfunction;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSorter {
	
	public static void sortByProductId(Product[] products) {
		
		Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
		
	}
}
