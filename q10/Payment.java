package Alain_26584.q10;

//Payment Class
class Payment extends Order {
 private String paymentMethod;
 private String paymentStatus;
 
 public Payment(int id, String createdDate, String updatedDate, String storeName,
                String storeAddress, String email, String categoryName, String categoryCode,
                String productName, String productCode, double price, String customerName,
                String contactNumber, String customerAddress, String orderDate,
                String orderId, String paymentMethod, String paymentStatus) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, storeAddress, email, categoryName, categoryCode,
           productName, productCode, price, customerName, contactNumber, customerAddress,
           orderDate, orderId);
     
     if (paymentMethod == null || paymentMethod.isEmpty()) throw new ShoppingDataException("Payment method cannot be empty");
     if (paymentStatus == null || paymentStatus.isEmpty()) throw new ShoppingDataException("Payment status cannot be empty");
     
     this.paymentMethod = paymentMethod;
     this.paymentStatus = paymentStatus;
 }
 
 public String getPaymentMethod() { return paymentMethod; }
 public String getPaymentStatus() { return paymentStatus; }
 
 @Override
 public String toString() {
     return super.toString() + ", Payment Method: " + paymentMethod + ", Status: " + paymentStatus;
 }
}