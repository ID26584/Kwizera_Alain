package Alain_26584.q9;

//Airline Class
class Airline extends Entity {
 private String airlineName;
 private String address;
 private String contactEmail;
 
 public Airline(int id, String createdDate, String updatedDate, String airlineName, 
                String address, String contactEmail) throws AirlineDataException {
     super(id, createdDate, updatedDate);
     
     if (airlineName == null || airlineName.isEmpty()) throw new AirlineDataException("Airline name cannot be empty");
     if (!contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new AirlineDataException("Invalid contact email format");
     
     this.airlineName = airlineName;
     this.address = address;
     this.contactEmail = contactEmail;
 }
 
 public String getAirlineName() { return airlineName; }
 public String getAddress() { return address; }
 public String getContactEmail() { return contactEmail; }
 
 @Override
 public String toString() {
     return super.toString() + ", Airline: " + airlineName + ", Address: " + address + 
            ", Contact Email: " + contactEmail;
 }
}