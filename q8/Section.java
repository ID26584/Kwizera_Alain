package Alain_26584.q8;

//Section Class
class Section extends Library {
 private String sectionName;
 private String sectionCode;
 
 public Section(int id, String createdDate, String updatedDate, String libraryName,
                String location, String phoneNumber, String sectionName, 
                String sectionCode) throws LibraryDataException {
     super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
     
     if (sectionName == null || sectionName.isEmpty()) throw new LibraryDataException("Section name cannot be empty");
     if (sectionCode == null || sectionCode.length() < 3) 
         throw new LibraryDataException("Section code must be at least 3 characters");
     
     this.sectionName = sectionName;
     this.sectionCode = sectionCode;
 }
 
 public String getSectionName() { return sectionName; }
 public String getSectionCode() { return sectionCode; }
 
 @Override
 public String toString() {
     return super.toString() + ", Section: " + sectionName + " (" + sectionCode + ")";
 }
}