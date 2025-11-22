package Alain_26584.q7;

//Property Class
class Property extends Agent {
 private String propertyCode;
 private String propertyType;
 private double price;
 
 public Property(int id, String createdDate, String updatedDate, String agencyName,
                 String location, String phoneNumber, String agentName, String email,
                 String licenseNumber, String propertyCode, String propertyType,
                 double price) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
     
     if (price <= 0) throw new RealEstateDataException("Property price must be greater than 0");
     
     this.propertyCode = propertyCode;
     this.propertyType = propertyType;
     this.price = price;
 }
 
 public String getPropertyCode() { return propertyCode; }
 public String getPropertyType() { return propertyType; }
 public double getPrice() { return price; }
 
 @Override
 public String toString() {
     return super.toString() + ", Property: " + propertyCode + " (" + propertyType + 
            "), Price: $" + price;
 }
}