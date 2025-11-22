package Alain_26584.q10;

//Order Class
class Order extends Customer {
 private String orderDate;
 private String orderId;
 
 public Order(int id, String createdDate, String updatedDate, String storeName,
              String storeAddress, String email, String categoryName, String categoryCode,
              String productName, String productCode, double price, String customerName,
              String contactNumber, String customerAddress, String orderDate,
              String orderId) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, storeAddress, email, categoryName, categoryCode,
           productName, productCode, price, customerName, contactNumber, customerAddress);
     
     if (orderDate == null || orderDate.isEmpty()) throw new ShoppingDataException("Order date cannot be empty");
     if (orderId == null || orderId.isEmpty()) throw new ShoppingDataException("Order ID cannot be empty");
     
     this.orderDate = orderDate;
     this.orderId = orderId;
 }
 
 public String getOrderDate() { return orderDate; }
 public String getOrderId() { return orderId; }
 
 @Override
 public String toString() {
     return super.toString() + ", Order ID: " + orderId + ", Date: " + orderDate;
 }
}