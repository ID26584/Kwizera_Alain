package Alain_26584.q7;

//Agency Class
class Agency extends Entity {
 private String agencyName;
 private String location;
 private String phoneNumber;
 
 public Agency(int id, String createdDate, String updatedDate, String agencyName, 
               String location, String phoneNumber) throws RealEstateDataException {
     super(id, createdDate, updatedDate);
     
     if (agencyName == null || agencyName.isEmpty()) throw new RealEstateDataException("Agency name cannot be empty");
     if (!phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("Phone number must be 10 digits");
     
     this.agencyName = agencyName;
     this.location = location;
     this.phoneNumber = phoneNumber;
 }
 
 public String getAgencyName() { return agencyName; }
 public String getLocation() { return location; }
 public String getPhoneNumber() { return phoneNumber; }
 
 @Override
 public String toString() {
     return super.toString() + ", Agency: " + agencyName + ", Location: " + location + 
            ", Phone: " + phoneNumber;
 }
}