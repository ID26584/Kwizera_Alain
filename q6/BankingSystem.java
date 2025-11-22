package Alain_26584.q6;

//Main Class
import java.util.Scanner;

public class BankingSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.println("=== BANKING SYSTEM ===");
         
         // Input data
         System.out.print("Enter Bank Name: ");
         String bankName = scanner.nextLine();
         
         System.out.print("Enter Branch Code: ");
         String branchCode = scanner.nextLine();
         
         System.out.print("Enter Bank Address: ");
         String address = scanner.nextLine();
         
         System.out.print("Enter Account Number: ");
         String accountNumber = scanner.nextLine();
         
         System.out.print("Enter Account Type: ");
         String accountType = scanner.nextLine();
         
         System.out.print("Enter Account Balance: $");
         double balance = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Customer Name: ");
         String customerName = scanner.nextLine();
         
         System.out.print("Enter Customer Email: ");
         String email = scanner.nextLine();
         
         System.out.print("Enter Phone Number: ");
         String phoneNumber = scanner.nextLine();
         
         System.out.print("Enter Transaction ID: ");
         String transactionId = scanner.nextLine();
         
         System.out.print("Enter Transaction Type: ");
         String transactionType = scanner.nextLine();
         
         System.out.print("Enter Transaction Amount: $");
         double amount = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Deposit Amount: $");
         double depositAmount = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Deposit Date (YYYY-MM-DD): ");
         String depositDate = scanner.nextLine();
         
         System.out.print("Enter Withdrawal Amount: $");
         double withdrawalAmount = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Withdrawal Date (YYYY-MM-DD): ");
         String withdrawalDate = scanner.nextLine();
         
         System.out.print("Enter Loan Amount: $");
         double loanAmount = scanner.nextDouble();
         
         System.out.print("Enter Interest Rate (%): ");
         double interestRate = scanner.nextDouble();
         
         System.out.print("Enter Loan Duration (months): ");
         int duration = scanner.nextInt();
         scanner.nextLine();
         
         System.out.print("Enter Payment Amount: $");
         double paymentAmount = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Payment Date (YYYY-MM-DD): ");
         String paymentDate = scanner.nextLine();
         
         // Create AccountRecord object
         AccountRecord account = new AccountRecord(
             1, "2024-01-01", "2024-01-15", bankName, branchCode, address,
             accountNumber, accountType, balance, customerName, email, phoneNumber,
             transactionId, transactionType, amount, depositAmount, depositDate,
             withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration,
             paymentAmount, paymentDate
         );
         
         // Display account details
         account.displayAccountDetails();
         
     } catch (BankingDataException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}