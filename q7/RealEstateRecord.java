package Alain_26584.q7;

//RealEstateRecord Class (Final)
final class RealEstateRecord extends Commission {
 public RealEstateRecord(int id, String createdDate, String updatedDate, String agencyName,
                        String location, String phoneNumber, String agentName, String agentEmail,
                        String licenseNumber, String propertyCode, String propertyType,
                        double price, String sellerName, String sellerContact, String buyerName,
                        String buyerEmail, String agreementDate, String terms,
                        double paymentAmount, String paymentDate, double commissionRate) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
           agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName,
           sellerContact, buyerName, buyerEmail, agreementDate, terms, paymentAmount,
           paymentDate, commissionRate);
 }
 
 public double calculateCommission() {
     return (getPrice() * getCommissionRate()) / 100;
 }
 
 public void displayRealEstateDetails() {
     System.out.println("\n=== REAL ESTATE MANAGEMENT SYSTEM - PROPERTY DETAILS ===");
     System.out.println("Agency: " + getAgencyName() + " - " + getLocation());
     System.out.println("Agent: " + getAgentName() + " (License: " + getLicenseNumber() + ")");
     System.out.println("Agent Email: " + getEmail());
     
     System.out.println("\n--- Property Information ---");
     System.out.println("Property Code: " + getPropertyCode());
     System.out.println("Property Type: " + getPropertyType());
     System.out.println("Price: $" + getPrice());
     
     System.out.println("\n--- Parties Information ---");
     System.out.println("Seller: " + getSellerName() + " - " + getContactNumber());
     System.out.println("Buyer: " + getBuyerName() + " - " + getBuyerEmail());
     
     System.out.println("\n--- Agreement Details ---");
     System.out.println("Agreement Date: " + getAgreementDate());
     System.out.println("Terms: " + getTerms());
     
     System.out.println("\n--- Financial Details ---");
     System.out.println("Payment Amount: $" + getPaymentAmount());
     System.out.println("Payment Date: " + getPaymentDate());
     System.out.println("Commission Rate: " + getCommissionRate() + "%");
     System.out.println("Commission Amount: $" + calculateCommission());
     System.out.println("=======================================================");
 }
}