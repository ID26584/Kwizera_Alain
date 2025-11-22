package Alain_26584.q8;

//Record Class
class Record extends Payment {
 private double totalFine;
 
 public Record(int id, String createdDate, String updatedDate, String libraryName,
               String location, String phoneNumber, String sectionName, String sectionCode,
               String title, String author, String ISBN, String memberName, int memberId,
               String contactNumber, String borrowDate, String returnDate,
               double fineAmount, int daysLate, String paymentDate, String paymentMode) throws LibraryDataException {
     super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
           title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate,
           fineAmount, daysLate, paymentDate, paymentMode);
     
     if (getFineAmount() * getDaysLate() <= 0) throw new LibraryDataException("Total fine must be greater than 0");
     
     this.totalFine = getFineAmount() * getDaysLate();
 }
 
 public double getTotalFine() { return totalFine; }
 
 @Override
 public String toString() {
     return super.toString() + ", Total Fine: $" + totalFine;
 }
}