package Alain_26584.q8;

//Fine Class
class Fine extends Borrow {
 private double fineAmount;
 private int daysLate;
 
 public Fine(int id, String createdDate, String updatedDate, String libraryName,
             String location, String phoneNumber, String sectionName, String sectionCode,
             String title, String author, String ISBN, String memberName, int memberId,
             String contactNumber, String borrowDate, String returnDate,
             double fineAmount, int daysLate) throws LibraryDataException {
     super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
           title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate);
     
     if (fineAmount < 0) throw new LibraryDataException("Fine amount cannot be negative");
     if (daysLate < 0) throw new LibraryDataException("Days late cannot be negative");
     
     this.fineAmount = fineAmount;
     this.daysLate = daysLate;
 }
 
 public double getFineAmount() { return fineAmount; }
 public int getDaysLate() { return daysLate; }
 
 @Override
 public String toString() {
     return super.toString() + ", Fine Amount: $" + fineAmount + ", Days Late: " + daysLate;
 }
}