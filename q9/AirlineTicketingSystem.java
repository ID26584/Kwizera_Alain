package Alain_26584.q9;

//Main Class
import java.util.Scanner;

public class AirlineTicketingSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         System.out.println("=== AIRLINE TICKETING SYSTEM ===");
         
         // Input data
         System.out.print("Enter Airline Name: ");
         String airlineName = scanner.nextLine();
         
         System.out.print("Enter Airline Address: ");
         String address = scanner.nextLine();
         
         System.out.print("Enter Contact Email: ");
         String contactEmail = scanner.nextLine();
         
         System.out.print("Enter Flight Number: ");
         String flightNumber = scanner.nextLine();
         
         System.out.print("Enter Destination: ");
         String destination = scanner.nextLine();
         
         System.out.print("Enter Departure Time: ");
         String departureTime = scanner.nextLine();
         
         System.out.print("Enter Passenger Name: ");
         String passengerName = scanner.nextLine();
         
         System.out.print("Enter Passport Number: ");
         String passportNumber = scanner.nextLine();
         
         System.out.print("Enter Nationality: ");
         String nationality = scanner.nextLine();
         
         System.out.print("Enter Seat Number: ");
         String seatNumber = scanner.nextLine();
         
         System.out.print("Enter Seat Type (Economy/Business): ");
         String seatType = scanner.nextLine();
         
         System.out.print("Enter Ticket Number: ");
         String ticketNumber = scanner.nextLine();
         
         System.out.print("Enter Ticket Price: $");
         double price = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Baggage Weight (kg): ");
         double baggageWeight = scanner.nextDouble();
         
         System.out.print("Enter Baggage Fee: $");
         double baggageFee = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.print("Enter Payment Date (YYYY-MM-DD): ");
         String paymentDate = scanner.nextLine();
         
         System.out.print("Enter Payment Mode: ");
         String paymentMode = scanner.nextLine();
         
         // Create TicketRecord object
         TicketRecord ticket = new TicketRecord(
             1, "2024-01-01", "2024-01-15", airlineName, address, contactEmail,
             flightNumber, destination, departureTime, passengerName, passportNumber,
             nationality, seatNumber, seatType, ticketNumber, price, baggageWeight,
             baggageFee, paymentDate, paymentMode
         );
         
         // Display ticket details
         ticket.displayTicketDetails();
         
     } catch (AirlineDataException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}