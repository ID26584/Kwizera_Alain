package Alain_26584.q7;

//Agreement Class
class Agreement extends Buyer {
 private String agreementDate;
 private String terms;
 
 public Agreement(int id, String createdDate, String updatedDate, String agencyName,
                  String location, String phoneNumber, String agentName, String agentEmail,
                  String licenseNumber, String propertyCode, String propertyType,
                  double price, String sellerName, String sellerContact, String buyerName,
                  String buyerEmail, String agreementDate, String terms) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
           agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName,
           sellerContact, buyerName, buyerEmail);
     
     if (agreementDate == null || agreementDate.isEmpty()) throw new RealEstateDataException("Agreement date cannot be empty");
     if (terms == null || terms.isEmpty()) throw new RealEstateDataException("Terms cannot be empty");
     
     this.agreementDate = agreementDate;
     this.terms = terms;
 }
 
 public String getAgreementDate() { return agreementDate; }
 public String getTerms() { return terms; }
 
 @Override
 public String toString() {
     return super.toString() + ", Agreement Date: " + agreementDate + ", Terms: " + terms;
 }
}