package Alain_26584.q9;

//Invoice Class
class Invoice extends Payment {
 private double totalFare;
 
 public Invoice(int id, String createdDate, String updatedDate, String airlineName,
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
     
     this.totalFare = price + baggageFee;
 }
 
 public double getTotalFare() { return totalFare; }
 
 @Override
 public String toString() {
     return super.toString() + ", Total Fare: $" + totalFare;
 }
}