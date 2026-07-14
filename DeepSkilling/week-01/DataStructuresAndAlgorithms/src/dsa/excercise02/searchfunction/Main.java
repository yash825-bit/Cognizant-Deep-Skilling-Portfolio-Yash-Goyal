package dsa.excercise02.searchfunction;

public class Main {

	public static void main(String[] args) {

		Product[] products = {
		        new Product(105, "Mjolnir", "Mythical Weapon"),
		        new Product(101, "Arc Reactor", "Energy Core"),
		        new Product(104, "Batmobile", "Vehicle"),
		        new Product(102, "Web Shooters", "Gadget"),
		        new Product(103, "Captain's Shield", "Defense")
		};
		
		int searchId = 101;
		
		//LinearSearch
		
		LinearSearch linearSearch = new LinearSearch();
		
		Product linearResult = linearSearch.search(products, searchId);

        System.out.println("===== Linear Search =====");

        if (linearResult != null) {
            System.out.println("Product Found:");
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }
        
        //Sort Arrays before Binary Search
        
        ProductSorter.sortByProductId(products);
        
        //Binary Search
        
        BinarySearch binarySearch = new BinarySearch();
        
        Product binaryResult = binarySearch.search(products, searchId);
        
        System.out.println("\n===== Binary Search =====");

        if (binaryResult != null) {
            System.out.println("Product Found:");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }

	}

}
