// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();
    
    // Regular method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    // Fields
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    // Fields
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class directly
        // Shape shape = new Shape(); // This will give an error

        // But you can create objects of subclasses
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling methods
        circle.display();
        System.out.println("Area of circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}

