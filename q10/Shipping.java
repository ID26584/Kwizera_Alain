package Alain_26584.q10;

//Shipping Class
class Shipping extends Payment {
 private String shippingAddress;
 private double shippingCost;
 
 public Shipping(int id, String createdDate, String updatedDate, String storeName,
                 String storeAddress, String email, String categoryName, String categoryCode,
                 String productName, String productCode, double price, String customerName,
                 String contactNumber, String customerAddress, String orderDate,
                 String orderId, String paymentMethod, String paymentStatus,
                 String shippingAddress, double shippingCost) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, storeAddress, email, categoryName, categoryCode,
           productName, productCode, price, customerName, contactNumber, customerAddress,
           orderDate, orderId, paymentMethod, paymentStatus);
     
     if (shippingCost < 0) throw new ShoppingDataException("Shipping cost cannot be negative");
     
     this.shippingAddress = shippingAddress;
     this.shippingCost = shippingCost;
 }
 
 public String getShippingAddress() { return shippingAddress; }
 public double getShippingCost() { return shippingCost; }
 
 @Override
 public String toString() {
     return super.toString() + ", Shipping Address: " + shippingAddress + 
            ", Shipping Cost: $" + shippingCost;
 }
}