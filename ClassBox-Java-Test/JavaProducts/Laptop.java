import java.util.*;

class Laptop{
  protected String brand;
  protected double price;

  Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
  }

  public void displayInfo() {
        System.out.println("Laptop brand: " + brand);
        System.out.println("Price: $" + price);
  }

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop("Dell", 1200.0);
        laptop.displayInfo();

        System.out.println();

        Cellphone cellphone = new Cellphone("Samsung", 999.99, "Galaxy S20");
        cellphone.displayInfo();

        // Menu loop
        while (true) {
            System.out.println("\n1. View Laptops");
            System.out.println("2. View Cell Phones");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    laptop.displayInfo();
                    break;
                case 2:
                    cellphone.displayInfo();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
  }
}

