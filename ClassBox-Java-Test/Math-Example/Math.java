public class Math {
    public static void main(String[] args) {
        // Call function defined outside the main method but within the class
        int resultAdd = add(3, 5);
        int resultSutract = subtract(9, 10);
        int resultMultiply = multiply(5, 5);
        int resultDivide = divide(25, 5);
        System.out.println("Addition Result: " + resultAdd);
        System.out.println("Subtraction Result: " + resultSutract);
        System.out.println("Multiplaction Result: " + resultMultiply);
        System.out.println("Division Result: " + resultDivide);
    }

    // Function defined outside the main method but within the class
    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b){
      return a - b;
    }

    private static int multiply(int a, int b){
      return a * b;
    }

    private static int divide(int a, int b){
      return a / b;
    }
}

