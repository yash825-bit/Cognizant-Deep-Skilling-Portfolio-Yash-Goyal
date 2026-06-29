package search_function;

import java.util.Arrays;
import java.util.Comparator;

public class SearchFunctionImplemented {
    public static void run()
    {
        Product[] products = {

                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")

        };
        
        //Linear Search
        Product result1 = SearchOperations.linearSearch(products, 104);

        if (result1 != null)
            System.out.println("Linear Search Found: " + result1);
        else
            System.out.println("Not Found");


        //Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result2 = SearchOperations.binarySearch(products, 104);

        if (result2 != null)
            System.out.println("Binary Search Found: " + result2);
        else
            System.out.println("Not Found");
    }
}
