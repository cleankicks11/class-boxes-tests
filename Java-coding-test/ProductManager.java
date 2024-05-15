import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                " name = '" + name + '\'' +
                ", price = " + price +
                ", stock = " + stock +
                '}';
    }
}

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int index) {
        products.remove(index);
    }

    public void displayProducts() {
        System.out.println("Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Product product = new Product(name, price, stock);
            productManager.addProduct(product);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter details for the new product:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Product newProduct = new Product(name, price, stock);
                    productManager.addProduct(newProduct);
                    break;
                case 2:
                    System.out.print("Enter the index of the product to remove: ");
                    int index = scanner.nextInt();
                    productManager.removeProduct(index - 1);
                    break;
                case 3:
                    productManager.displayProducts();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        System.out.println("Exiting...");
        scanner.close();
    }
}

