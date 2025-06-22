import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "T-shirt", "Clothing"),
            new Product(303, "Phone", "Electronics"),
            new Product(404, "Shoes", "Footwear")
        };

        // Sort by productId
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int searchId = 303;
        int low = 0, high = products.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == searchId) {
                System.out.println("Product found: " + products[mid]);
                found = true;
                break;
            } else if (products[mid].productId < searchId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}
