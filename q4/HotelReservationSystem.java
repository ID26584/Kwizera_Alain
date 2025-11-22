package Alain_26584.q4;

//Main Class
import java.util.Scanner;

public class HotelReservationSystem {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   try {
       System.out.println("=== HOTEL RESERVATION SYSTEM ===");
       
       // Input data
       System.out.print("Enter Hotel Name: ");
       String hotelName = scanner.nextLine();
       
       System.out.print("Enter Hotel Address: ");
       String address = scanner.nextLine();
       
       System.out.print("Enter Hotel Phone (10 digits): ");
       String phoneNumber = scanner.nextLine();
       
       System.out.print("Enter Hotel Email: ");
       String email = scanner.nextLine();
       
       System.out.print("Enter Room Number: ");
       String roomNumber = scanner.nextLine();
       
       System.out.print("Enter Room Type: ");
       String roomType = scanner.nextLine();
       
       System.out.print("Enter Price Per Night: $");
       double pricePerNight = scanner.nextDouble();
       scanner.nextLine();
       
       System.out.print("Enter Customer Name: ");
       String customerName = scanner.nextLine();
       
       System.out.print("Enter Customer Email: ");
       String customerEmail = scanner.nextLine();
       
       System.out.print("Enter Contact Number: ");
       String contactNumber = scanner.nextLine();
       
       System.out.print("Enter Booking Date (YYYY-MM-DD): ");
       String bookingDate = scanner.nextLine();
       
       System.out.print("Enter Check-in Date (YYYY-MM-DD): ");
       String checkInDate = scanner.nextLine();
       
       System.out.print("Enter Check-out Date (YYYY-MM-DD): ");
       String checkOutDate = scanner.nextLine();
       
       System.out.print("Enter Service Name: ");
       String serviceName = scanner.nextLine();
       
       System.out.print("Enter Service Cost: $");
       double serviceCost = scanner.nextDouble();
       scanner.nextLine();
       
       System.out.print("Enter Payment Method: ");
       String paymentMethod = scanner.nextLine();
       
       System.out.print("Enter Payment Date (YYYY-MM-DD): ");
       String paymentDate = scanner.nextLine();
       
       System.out.print("Enter Number of Nights: ");
       int numberOfNights = scanner.nextInt();
       scanner.nextLine();
       
       System.out.print("Enter Rating (1-5): ");
       int rating = scanner.nextInt();
       scanner.nextLine();
       
       System.out.print("Enter Comments: ");
       String comments = scanner.nextLine();
       
       // Create ReservationRecord object
       ReservationRecord reservation = new ReservationRecord(
           1, "2024-01-01", "2024-01-15", hotelName, address, phoneNumber, email,
           roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
           bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
           paymentMethod, paymentDate, numberOfNights, rating, comments
       );
       
       // Display reservation details
       reservation.displayReservationDetails();
       
   } catch (HotelDataException e) {
       System.out.println("Error: " + e.getMessage());
   } catch (Exception e) {
       System.out.println("Unexpected error: " + e.getMessage());
   } finally {
       scanner.close();
   }
}
}