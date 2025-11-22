package Alain_26584.q8;

//LibraryRecord Class (Final)
final class LibraryRecord extends Record {
 public LibraryRecord(int id, String createdDate, String updatedDate, String libraryName,
                     String location, String phoneNumber, String sectionName, String sectionCode,
                     String title, String author, String ISBN, String memberName, int memberId,
                     String contactNumber, String borrowDate, String returnDate,
                     double fineAmount, int daysLate, String paymentDate, String paymentMode) throws LibraryDataException {
     super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
           title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate,
           fineAmount, daysLate, paymentDate, paymentMode);
 }
 
 public double calculateFine() {
     return getFineAmount() * getDaysLate();
 }
 
 public void displayLibraryDetails() {
     System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM - BORROWING DETAILS ===");
     System.out.println("Library: " + getLibraryName() + " - " + getLocation());
     System.out.println("Section: " + getSectionName() + " (" + getSectionCode() + ")");
     
     System.out.println("\n--- Book Information ---");
     System.out.println("Title: " + getTitle());
     System.out.println("Author: " + getAuthor());
     System.out.println("ISBN: " + getISBN());
     
     System.out.println("\n--- Member Information ---");
     System.out.println("Member: " + getMemberName() + " (ID: " + getMemberId() + ")");
     System.out.println("Contact: " + getContactNumber());
     
     System.out.println("\n--- Borrowing Details ---");
     System.out.println("Borrow Date: " + getBorrowDate());
     System.out.println("Return Date: " + getReturnDate());
     System.out.println("Days Late: " + getDaysLate());
     
     System.out.println("\n--- Fine Details ---");
     System.out.println("Fine per Day: $" + getFineAmount());
     System.out.println("Total Fine: $" + calculateFine());
     
     System.out.println("\n--- Payment Information ---");
     System.out.println("Payment Date: " + getPaymentDate());
     System.out.println("Payment Mode: " + getPaymentMode());
     System.out.println("====================================================");
 }
}