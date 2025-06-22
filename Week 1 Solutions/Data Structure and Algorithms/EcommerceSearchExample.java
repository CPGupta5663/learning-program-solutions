import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearchExample {

    // Product class with productId, productName, and category
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return productId + " - " + productName + " (" + category + ")";
        }
    }

    // Linear Search Method
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search Method (requires sorted array)
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Main method 
    public static void main(String[] args) {
        //  sample product array
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(205, "Shoes", "Fashion"),
            new Product(309, "Laptop", "Electronics"),
            new Product(412, "Watch", "Accessories"),
            new Product(112, "Tablet", "Electronics")
        };

        int searchId = 309;

        //  Linear Search
        System.out.println(" Linear Search:");
        Product linearResult = linearSearch(products, searchId);
        System.out.println(linearResult != null ? "Found: " + linearResult : "Product not found");

        //  Sort products by productId for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        //  Binary Search
        System.out.println("\n Binary Search:");
        Product binaryResult = binarySearch(products, searchId);
        System.out.println(binaryResult != null ? "Found: " + binaryResult : "Product not found");
    }
}
