package Alain_26584.q7;

//Main Class
import java.util.Scanner;

public class RealEstateManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.println("=== REAL ESTATE MANAGEMENT SYSTEM ===");
         
         // Input data
         System.out.print("Enter Agency Name: ");
         String agencyName = scanner.nextLine();
         
         System.out.print("Enter Agency Location: ");
         String location = scanner.nextLine();
         
         System.out.print("Enter Agency Phone (10 digits): ");
         String phoneNumber = scanner.nextLine();
         
         System.out.print("Enter Agent Name: ");
         String agentName = scanner.nextLine();
         
         System.out.print("Enter Agent Email: ");
         String agentEmail = scanner.nextLine();
         
         System.out.print("Enter Agent License Number: ");
         String licenseNumber = scanner.nextLine();
         
         System.out.print("Enter Property Code: ");
         String propertyCode = scanner.nextLine();
         
         System.out.print("Enter Property Type: ");
         String propertyType = scanner.nextLine();
         
         System.out.print("Enter Property Price: $");
         double price = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Seller Name: ");
         String sellerName = scanner.nextLine();
         
         System.out.print("Enter Seller Contact: ");
         String sellerContact = scanner.nextLine();
         
         System.out.print("Enter Buyer Name: ");
         String buyerName = scanner.nextLine();
         
         System.out.print("Enter Buyer Email: ");
         String buyerEmail = scanner.nextLine();
         
         System.out.print("Enter Agreement Date (YYYY-MM-DD): ");
         String agreementDate = scanner.nextLine();
         
         System.out.print("Enter Agreement Terms: ");
         String terms = scanner.nextLine();
         
         System.out.print("Enter Payment Amount: $");
         double paymentAmount = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Payment Date (YYYY-MM-DD): ");
         String paymentDate = scanner.nextLine();
         
         System.out.print("Enter Commission Rate (%): ");
         double commissionRate = scanner.nextDouble();
         
         // Create RealEstateRecord object
         RealEstateRecord property = new RealEstateRecord(
             1, "2024-01-01", "2024-01-15", agencyName, location, phoneNumber,
             agentName, agentEmail, licenseNumber, propertyCode, propertyType, price,
             sellerName, sellerContact, buyerName, buyerEmail, agreementDate, terms,
             paymentAmount, paymentDate, commissionRate
         );
         
         // Display real estate details
         property.displayRealEstateDetails();
         
     } catch (RealEstateDataException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}