package Alain_26584.q9;

//TicketRecord Class (Final)
final class TicketRecord extends Invoice {
 public TicketRecord(int id, String createdDate, String updatedDate, String airlineName,
                    String address, String contactEmail, String flightNumber,
                    String destination, String departureTime, String passengerName,
                    String passportNumber, String nationality, String seatNumber,
                    String seatType, String ticketNumber, double price,
                    double baggageWeight, double baggageFee, String paymentDate,
                    String paymentMode) throws AirlineDataException {
     super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
           destination, departureTime, passengerName, passportNumber, nationality,
           seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee,
           paymentDate, paymentMode);
 }
 
 public double generateInvoice() {
     return getPrice() + getBaggageFee();
 }
 
 public void displayTicketDetails() {
     System.out.println("\n=== AIRLINE TICKETING SYSTEM - FLIGHT DETAILS ===");
     System.out.println("Airline: " + getAirlineName());
     System.out.println("Flight: " + getFlightNumber() + " to " + getDestination());
     System.out.println("Departure: " + getDepartureTime());
     
     System.out.println("\n--- Passenger Information ---");
     System.out.println("Passenger: " + getPassengerName());
     System.out.println("Passport: " + getPassportNumber());
     System.out.println("Nationality: " + getNationality());
     System.out.println("Seat: " + getSeatNumber() + " (" + getSeatType() + ")");
     
     System.out.println("\n--- Ticket Information ---");
     System.out.println("Ticket Number: " + getTicketNumber());
     System.out.println("Base Price: $" + getPrice());
     System.out.println("Baggage: " + getBaggageWeight() + "kg");
     System.out.println("Baggage Fee: $" + getBaggageFee());
     
     System.out.println("\n--- Payment Information ---");
     System.out.println("Payment Date: " + getPaymentDate());
     System.out.println("Payment Mode: " + getPaymentMode());
     System.out.println("Total Fare: $" + generateInvoice());
     System.out.println("===============================================");
 }
}