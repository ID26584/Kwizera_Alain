package Alain_26584.q10;

//Category Class
class Category extends Store {
 private String categoryName;
 private String categoryCode;
 
 public Category(int id, String createdDate, String updatedDate, String storeName,
                 String address, String email, String categoryName, 
                 String categoryCode) throws ShoppingDataException {
     super(id, createdDate, updatedDate, storeName, address, email);
     
     if (categoryName == null || categoryName.isEmpty()) throw new ShoppingDataException("Category name cannot be empty");
     if (categoryCode == null || categoryCode.length() < 3) 
         throw new ShoppingDataException("Category code must be at least 3 characters");
     
     this.categoryName = categoryName;
     this.categoryCode = categoryCode;
 }
 
 public String getCategoryName() { return categoryName; }
 public String getCategoryCode() { return categoryCode; }
 
 @Override
 public String toString() {
     return super.toString() + ", Category: " + categoryName + " (" + categoryCode + ")";
 }
}