package Alain_26584.q7;

//Commission Class
class Commission extends Payment {
 private double commissionRate;
 private double commissionAmount;
 
 public Commission(int id, String createdDate, String updatedDate, String agencyName,
                   String location, String phoneNumber, String agentName, String agentEmail,
                   String licenseNumber, String propertyCode, String propertyType,
                   double price, String sellerName, String sellerContact, String buyerName,
                   String buyerEmail, String agreementDate, String terms,
                   double paymentAmount, String paymentDate, double commissionRate) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
           agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName,
           sellerContact, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate);
     
     if (commissionRate < 0) throw new RealEstateDataException("Commission rate cannot be negative");
     
     this.commissionRate = commissionRate;
     this.commissionAmount = (price * commissionRate) / 100;
 }
 
 public double getCommissionRate() { return commissionRate; }
 public double getCommissionAmount() { return commissionAmount; }
 
 @Override
 public String toString() {
     return super.toString() + ", Commission Rate: " + commissionRate + "%, Amount: $" + commissionAmount;
 }
}