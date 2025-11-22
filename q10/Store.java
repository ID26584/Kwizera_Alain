package Alain_26584.q10;

//Store Class
class Store extends Entity {
 private String storeName;
 private String address;
 private String email;
 
 public Store(int id, String createdDate, String updatedDate, String storeName, 
              String address, String email) throws ShoppingDataException {
     super(id, createdDate, updatedDate);
     
     if (storeName == null || storeName.isEmpty()) throw new ShoppingDataException("Store name cannot be empty");
     if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new ShoppingDataException("Invalid email format");
     
     this.storeName = storeName;
     this.address = address;
     this.email = email;
 }
 
 public String getStoreName() { return storeName; }
 public String getAddress() { return address; }
 public String getEmail() { return email; }
 
 @Override
 public String toString() {
     return super.toString() + ", Store: " + storeName + ", Address: " + address + 
            ", Email: " + email;
 }
}