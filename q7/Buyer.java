package Alain_26584.q7;

//Buyer Class
class Buyer extends Seller {
 private String buyerName;
 private String email;
 
 public Buyer(int id, String createdDate, String updatedDate, String agencyName,
              String location, String phoneNumber, String agentName, String email,
              String licenseNumber, String propertyCode, String propertyType,
              double price, String sellerName, String contactNumber, String buyerName,
              String buyerEmail) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
           email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
     
     if (!buyerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new RealEstateDataException("Invalid buyer email format");
     
     this.buyerName = buyerName;
     this.email = buyerEmail;
 }
 
 public String getBuyerName() { return buyerName; }
 public String getBuyerEmail() { return email; }
 
 @Override
 public String toString() {
     return super.toString() + ", Buyer: " + buyerName + ", Email: " + email;
 }
}