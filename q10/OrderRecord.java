package Alain_26584.q10;

//OrderRecord Class (Final)
final class OrderRecord extends Invoice {
 public OrderRecord(int id, String createdDate, String updatedDate, String storeName,
                   String storeAddress, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price, String customerName,
                   String contactNumber, String customerAddress, String orderDate,
                   String orderId, String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, storeAddress, email, categoryName, categoryCode,
           productName, productCode, price, customerName, contactNumber, customerAddress,
           orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
 }
 
 public double calculateTotalAmount() {
     return getPrice() + getShippingCost();
 }
 
 public void displayOrderDetails() {
     System.out.println("\n=== ONLINE SHOPPING SYSTEM - ORDER DETAILS ===");
     System.out.println("Store: " + getStoreName());
     System.out.println("Category: " + getCategoryName() + " (" + getCategoryCode() + ")");
     
     System.out.println("\n--- Product Information ---");
     System.out.println("Product: " + getProductName() + " (" + getProductCode() + ")");
     System.out.println("Price: $" + getPrice());
     
     System.out.println("\n--- Customer Information ---");
     System.out.println("Customer: " + getCustomerName());
     System.out.println("Contact: " + getContactNumber());
     System.out.println("Billing Address: " + getCustomerAddress());
     
     System.out.println("\n--- Order Information ---");
     System.out.println("Order ID: " + getOrderId());
     System.out.println("Order Date: " + getOrderDate());
     
     System.out.println("\n--- Payment Information ---");
     System.out.println("Payment Method: " + getPaymentMethod());
     System.out.println("Payment Status: " + getPaymentStatus());
     
     System.out.println("\n--- Shipping Information ---");
     System.out.println("Shipping Address: " + getShippingAddress());
     System.out.println("Shipping Cost: $" + getShippingCost());
     
     System.out.println("\n--- Total Amount ---");
     System.out.println("Product Price: $" + getPrice());
     System.out.println("Shipping Cost: $" + getShippingCost());
     System.out.println("Total Amount: $" + calculateTotalAmount());
     System.out.println("============================================");
 }
}