package Alain_26584.q10;

//Invoice Class
class Invoice extends Shipping {
 private double totalAmount;
 
 public Invoice(int id, String createdDate, String updatedDate, String storeName,
                String storeAddress, String email, String categoryName, String categoryCode,
                String productName, String productCode, double price, String customerName,
                String contactNumber, String customerAddress, String orderDate,
                String orderId, String paymentMethod, String paymentStatus,
                String shippingAddress, double shippingCost) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, storeAddress, email, categoryName, categoryCode,
           productName, productCode, price, customerName, contactNumber, customerAddress,
           orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
     
     this.totalAmount = price + shippingCost;
 }
 
 public double getTotalAmount() { return totalAmount; }
 
 @Override
 public String toString() {
     return super.toString() + ", Total Amount: $" + totalAmount;
 }
}