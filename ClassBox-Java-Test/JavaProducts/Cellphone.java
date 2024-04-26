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

