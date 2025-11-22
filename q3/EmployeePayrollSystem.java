package Alain_26584.q3;

//Main Class
import java.util.Scanner;

public class EmployeePayrollSystem {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   try {
       System.out.println("=== EMPLOYEE PAYROLL SYSTEM ===");
       
       // Input data
       System.out.print("Enter Company Name: ");
       String companyName = scanner.nextLine();
       
       System.out.print("Enter Company Address: ");
       String address = scanner.nextLine();
       
       System.out.print("Enter Company Phone (10 digits): ");
       String phoneNumber = scanner.nextLine();
       
       System.out.print("Enter Company Email: ");
       String email = scanner.nextLine();
       
       System.out.print("Enter Department Name: ");
       String departmentName = scanner.nextLine();
       
       System.out.print("Enter Department Code: ");
       String departmentCode = scanner.nextLine();
       
       System.out.print("Enter Manager Name: ");
       String managerName = scanner.nextLine();
       
       System.out.print("Enter Manager Email: ");
       String managerEmail = scanner.nextLine();
       
       System.out.print("Enter Manager Phone: ");
       String managerPhone = scanner.nextLine();
       
       System.out.print("Enter Employee Name: ");
       String employeeName = scanner.nextLine();
       
       System.out.print("Enter Employee ID: ");
       int employeeId = scanner.nextInt();
       scanner.nextLine();
       
       System.out.print("Enter Designation: ");
       String designation = scanner.nextLine();
       
       System.out.print("Enter Contact Number: ");
       String contactNumber = scanner.nextLine();
       
       System.out.print("Enter Total Working Days: ");
       int totalDays = scanner.nextInt();
       
       System.out.print("Enter Present Days: ");
       int presentDays = scanner.nextInt();
       
       System.out.print("Enter Leave Days: ");
       int leaveDays = scanner.nextInt();
       
       System.out.print("Enter Housing Allowance: $");
       double housingAllowance = scanner.nextDouble();
       
       System.out.print("Enter Transport Allowance: $");
       double transportAllowance = scanner.nextDouble();
       
       System.out.print("Enter Tax Deduction: $");
       double taxDeduction = scanner.nextDouble();
       
       System.out.print("Enter Loan Deduction: $");
       double loanDeduction = scanner.nextDouble();
       
       System.out.print("Enter Basic Salary: $");
       double basicSalary = scanner.nextDouble();
       
       // Create PayrollRecord object
       PayrollRecord payroll = new PayrollRecord(
           1, "2024-01-01", "2024-01-31", companyName, address, phoneNumber, email,
           departmentName, departmentCode, managerName, managerEmail, managerPhone,
           employeeName, employeeId, designation, contactNumber, totalDays, presentDays,
           leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction,
           basicSalary
       );
       
       // Display payroll details
       payroll.displayPayrollDetails();
       
   } catch (PayrollDataException e) {
       System.out.println("Error: " + e.getMessage());
   } catch (Exception e) {
       System.out.println("Unexpected error: " + e.getMessage());
   } finally {
       scanner.close();
   }
}
}