package Alain_26584.q7;

//Seller Class
class Seller extends Property {
 private String sellerName;
 private String contactNumber;
 
 public Seller(int id, String createdDate, String updatedDate, String agencyName,
               String location, String phoneNumber, String agentName, String email,
               String licenseNumber, String propertyCode, String propertyType,
               double price, String sellerName, String contactNumber) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
           email, licenseNumber, propertyCode, propertyType, price);
     
     if (sellerName == null || sellerName.isEmpty()) throw new RealEstateDataException("Seller name cannot be empty");
     if (contactNumber == null || contactNumber.isEmpty()) throw new RealEstateDataException("Contact number cannot be empty");
     
     this.sellerName = sellerName;
     this.contactNumber = contactNumber;
 }
 
 public String getSellerName() { return sellerName; }
 public String getContactNumber() { return contactNumber; }
 
 @Override
 public String toString() {
     return super.toString() + ", Seller: " + sellerName + ", Contact: " + contactNumber;
 }
}