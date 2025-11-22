package Alain_26584.q8;

//Library Class
class Library extends Entity {
 private String libraryName;
 private String location;
 private String phoneNumber;
 
 public Library(int id, String createdDate, String updatedDate, String libraryName, 
                String location, String phoneNumber) throws LibraryDataException {
     super(id, createdDate, updatedDate);
     
     if (libraryName == null || libraryName.isEmpty()) throw new LibraryDataException("Library name cannot be empty");
     if (!phoneNumber.matches("\\d{10}")) throw new LibraryDataException("Phone number must be 10 digits");
     
     this.libraryName = libraryName;
     this.location = location;
     this.phoneNumber = phoneNumber;
 }
 
 public String getLibraryName() { return libraryName; }
 public String getLocation() { return location; }
 public String getPhoneNumber() { return phoneNumber; }
 
 @Override
 public String toString() {
     return super.toString() + ", Library: " + libraryName + ", Location: " + location + 
            ", Phone: " + phoneNumber;
 }
}