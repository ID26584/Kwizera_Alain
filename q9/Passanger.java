package Alain_26584.q9;

//Passenger Class
class Passenger extends Flight {
 private String passengerName;
 private String passportNumber;
 private String nationality;
 
 public Passenger(int id, String createdDate, String updatedDate, String airlineName,
                  String address, String contactEmail, String flightNumber,
                  String destination, String departureTime, String passengerName,
                  String passportNumber, String nationality) throws AirlineDataException {
     super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber,
           destination, departureTime);
     
     if (passportNumber == null || passportNumber.isEmpty()) throw new AirlineDataException("Passport number cannot be empty");
     
     this.passengerName = passengerName;
     this.passportNumber = passportNumber;
     this.nationality = nationality;
 }
 
 public String getPassengerName() { return passengerName; }
 public String getPassportNumber() { return passportNumber; }
 public String getNationality() { return nationality; }
 
 @Override
 public String toString() {
     return super.toString() + ", Passenger: " + passengerName + ", Passport: " + passportNumber + 
            ", Nationality: " + nationality;
 }
}