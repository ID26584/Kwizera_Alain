package Alain_26584.q8;

//Main Class
import java.util.Scanner;

public class LibraryManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===");
         
         // Input data
         System.out.print("Enter Library Name: ");
         String libraryName = scanner.nextLine();
         
         System.out.print("Enter Library Location: ");
         String location = scanner.nextLine();
         
         System.out.print("Enter Library Phone (10 digits): ");
         String phoneNumber = scanner.nextLine();
         
         System.out.print("Enter Section Name: ");
         String sectionName = scanner.nextLine();
         
         System.out.print("Enter Section Code: ");
         String sectionCode = scanner.nextLine();
         
         System.out.print("Enter Book Title: ");
         String title = scanner.nextLine();
         
         System.out.print("Enter Book Author: ");
         String author = scanner.nextLine();
         
         System.out.print("Enter ISBN: ");
         String ISBN = scanner.nextLine();
         
         System.out.print("Enter Member Name: ");
         String memberName = scanner.nextLine();
         
         System.out.print("Enter Member ID: ");
         int memberId = scanner.nextInt();
         scanner.nextLine();
         
         System.out.print("Enter Contact Number: ");
         String contactNumber = scanner.nextLine();
         
         System.out.print("Enter Borrow Date (YYYY-MM-DD): ");
         String borrowDate = scanner.nextLine();
         
         System.out.print("Enter Return Date (YYYY-MM-DD): ");
         String returnDate = scanner.nextLine();
         
         System.out.print("Enter Fine Amount per Day: $");
         double fineAmount = scanner.nextDouble();
         
         System.out.print("Enter Days Late: ");
         int daysLate = scanner.nextInt();
         scanner.nextLine();
         
         System.out.print("Enter Payment Date (YYYY-MM-DD): ");
         String paymentDate = scanner.nextLine();
         
         System.out.print("Enter Payment Mode: ");
         String paymentMode = scanner.nextLine();
         
         // Create LibraryRecord object
         LibraryRecord libraryRecord = new LibraryRecord(
             1, "2024-01-01", "2024-01-15", libraryName, location, phoneNumber,
             sectionName, sectionCode, title, author, ISBN, memberName, memberId,
             contactNumber, borrowDate, returnDate, fineAmount, daysLate,
             paymentDate, paymentMode
         );
         
         // Display library details
         libraryRecord.displayLibraryDetails();
         
     } catch (LibraryDataException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}