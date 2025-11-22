package Alain_26584.q10;

//Main Class
import java.util.Scanner;

public class OnlineShoppingSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.println("=== ONLINE SHOPPING SYSTEM ===");
         
         // Input data
         System.out.print("Enter Store Name: ");
         String storeName = scanner.nextLine();
         
         System.out.print("Enter Store Address: ");
         String storeAddress = scanner.nextLine();
         
         System.out.print("Enter Store Email: ");
         String email = scanner.nextLine();
         
         System.out.print("Enter Category Name: ");
         String categoryName = scanner.nextLine();
         
         System.out.print("Enter Category Code: ");
         String categoryCode = scanner.nextLine();
         
         System.out.print("Enter Product Name: ");
         String productName = scanner.nextLine();
         
         System.out.print("Enter Product Code: ");
         String productCode = scanner.nextLine();
         
         System.out.print("Enter Product Price: $");
         double price = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Customer Name: ");
         String customerName = scanner.nextLine();
         
         System.out.print("Enter Contact Number: ");
         String contactNumber = scanner.nextLine();
         
         System.out.print("Enter Customer Address: ");
         String customerAddress = scanner.nextLine();
         
         System.out.print("Enter Order Date (YYYY-MM-DD): ");
         String orderDate = scanner.nextLine();
         
         System.out.print("Enter Order ID: ");
         String orderId = scanner.nextLine();
         
         System.out.print("Enter Payment Method: ");
         String paymentMethod = scanner.nextLine();
         
         System.out.print("Enter Payment Status: ");
         String paymentStatus = scanner.nextLine();
         
         System.out.print("Enter Shipping Address: ");
         String shippingAddress = scanner.nextLine();
         
         System.out.print("Enter Shipping Cost: $");
         double shippingCost = scanner.nextDouble();
         
         // Create OrderRecord object
         OrderRecord order = new OrderRecord(
             1, "2024-01-01", "2024-01-15", storeName, storeAddress, email,
             categoryName, categoryCode, productName, productCode, price,
             customerName, contactNumber, customerAddress, orderDate, orderId,
             paymentMethod, paymentStatus, shippingAddress, shippingCost
         );
         
         // Display order details
         order.displayOrderDetails();
         
     } catch (ShoppingDataException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}