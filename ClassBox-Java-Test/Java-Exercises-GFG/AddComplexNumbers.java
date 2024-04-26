import java.util.Scanner;

class Complex {
    double real, imaginary;
    
    // Constructor to initialize complex numbers
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Function to add two complex numbers
    static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }
}

public class AddComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        
        // Creating complex number objects
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);
        
        // Adding complex numbers
        Complex sum = Complex.add(complex1, complex2);
        
        // Displaying the sum
        System.out.println("Sum of the two complex numbers: " + sum.real + " + " + sum.imaginary + "i");
        
        scanner.close();
    }
}

