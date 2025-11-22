package Alain_26584.q9;

//Payment Class
class Payment extends Baggage {
 private String paymentDate;
 private String paymentMode;
 
 public Payment(int id, String createdDate, String updatedDate, String airlineName,
                String address, String contactEmail, String flightNumber,
                String destination, String departureTime, String passengerName,
                String passportNumber, String nationality, String seatNumber,
                String seatType, String ticketNumber, double price,
                double baggageWeight, double baggageFee, String paymentDate,
                String paymentMode) throws AirlineDataException {
     super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
           destination, departureTime, passengerName, passportNumber, nationality,
           seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
     
     if (paymentDate == null || paymentDate.isEmpty()) throw new AirlineDataException("Payment date cannot be empty");
     if (paymentMode == null || paymentMode.isEmpty()) throw new AirlineDataException("Payment mode cannot be empty");
     
     this.paymentDate = paymentDate;
     this.paymentMode = paymentMode;
 }
 
 public String getPaymentDate() { return paymentDate; }
 public String getPaymentMode() { return paymentMode; }
 
 @Override
 public String toString() {
     return super.toString() + ", Payment Date: " + paymentDate + ", Mode: " + paymentMode;
 }
}