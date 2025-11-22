package Alain_26584.q8;

//Book Class
class Book extends Section {
 private String title;
 private String author;
 private String ISBN;
 
 public Book(int id, String createdDate, String updatedDate, String libraryName,
             String location, String phoneNumber, String sectionName, String sectionCode,
             String title, String author, String ISBN) throws LibraryDataException {
     super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
     
     if (ISBN == null || ISBN.length() < 10) 
         throw new LibraryDataException("ISBN must be at least 10 characters");
     
     this.title = title;
     this.author = author;
     this.ISBN = ISBN;
 }
 
 public String getTitle() { return title; }
 public String getAuthor() { return author; }
 public String getISBN() { return ISBN; }
 
 @Override
 public String toString() {
     return super.toString() + ", Book: " + title + " by " + author + ", ISBN: " + ISBN;
 }
}