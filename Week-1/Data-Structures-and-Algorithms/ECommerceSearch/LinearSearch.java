public class LinearSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "T-shirt", "Clothing"),
            new Product(303, "Phone", "Electronics"),
            new Product(404, "Shoes", "Footwear")
        };

        int searchId = 303;
        boolean found = false;

        for (Product p : products) {
            if (p.productId == searchId) {
                System.out.println("Product found: " + p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}
