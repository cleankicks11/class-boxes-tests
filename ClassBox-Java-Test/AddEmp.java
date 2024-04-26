import java.util.Scanner;

public class AddEmp {

    private String[] employeeNames;
    
    public AddEmp(int numEmployees) {
        this.employeeNames = new String[numEmployees];
    }

public void addEmp(Scanner scanner) {
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            employeeNames[i] = scanner.next();
        }
        System.out.println("Employee names added successfully.");
    }
    
    public void viewEmp() {
        System.out.println("Employee names:");
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println((i + 1) + ". " + employeeNames[i]);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the user's input as a string
        String empName = scanner.nextLine();

     // Create an EmployeeNames object
        AddEmp employeeList = new AddEmp(numEmployees);
        
    // Menu loop
        while (true) {
            System.out.println("\n1. Add Employee Names");
            System.out.println("2. View Employee Names");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    employeeList.addEmp(scanner);
                    break;
                case 2:
                    employeeList.viewEmp();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        // Close the Scanner object
        scanner.close();
    }
  }
}
