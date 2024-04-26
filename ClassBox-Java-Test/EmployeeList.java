import java.util.Scanner;

public class EmployeeList{
  int empId;
  String empName;
  float empSal;

  Scanner input = new Scanner(System.in);

  public void addEmp(){
System.out.println("Employee Id");
  empId = input.nextInt();

  System.out.println("Employee Name");
  empName = input.next();
  
  System.out.println("Employee Salary");
  empSal = input.nextFloat();

  }

  public void viewEmp(){
    System.out.println("Employee Id: " + empId);
    System.out.println("Employee Name: " + empName);
    System.out.println("Employee Salary: " + empSal);
  }

  public static void main(String[] args) {
    EmployeeList employee = new EmployeeList();
    employee.addEmp();
    employee.viewEmp();
  }
}
