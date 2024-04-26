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
        Laptop laptop = new Laptop("Dell", 1200.0);
        laptop.displayInfo();

        System.out.println();

        Cellphone cellphone = new Cellphone("Samsung", 999.99, "Galaxy S20");
        cellphone.displayInfo();
    }

  class Cellphone extends Laptop{
    private String model;

    Cellphone(String brand, double price, String model) {
        super(brand, price);
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cellphone model: " + model);
    }
  }
}

