package Alain_26584.q9;

//Ticket Class
class Ticket extends Seat {
 private String ticketNumber;
 private double price;
 
 public Ticket(int id, String createdDate, String updatedDate, String airlineName,
               String address, String contactEmail, String flightNumber,
               String destination, String departureTime, String passengerName,
               String passportNumber, String nationality, String seatNumber,
               String seatType, String ticketNumber, double price) throws AirlineDataException {
     super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
           destination, departureTime, passengerName, passportNumber, nationality,
           seatNumber, seatType);
     
     if (price <= 0) throw new AirlineDataException("Ticket price must be greater than 0");
     
     this.ticketNumber = ticketNumber;
     this.price = price;
 }
 
 public String getTicketNumber() { return ticketNumber; }
 public double getPrice() { return price; }
 
 @Override
 public String toString() {
     return super.toString() + ", Ticket: " + ticketNumber + ", Price: $" + price;
 }
}