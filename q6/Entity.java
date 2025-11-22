package Alain_26584.q6;

//Entity Class
class Entity {
 private int id;
 private String createdDate;
 private String updatedDate;
 
 public Entity(int id, String createdDate, String updatedDate) throws BankingDataException {
     if (id <= 0) throw new BankingDataException("ID must be greater than 0");
     if (createdDate == null || createdDate.isEmpty()) throw new BankingDataException("Created date cannot be empty");
     if (updatedDate == null || updatedDate.isEmpty()) throw new BankingDataException("Updated date cannot be empty");
     
     this.id = id;
     this.createdDate = createdDate;
     this.updatedDate = updatedDate;
 }
 
 public int getId() { return id; }
 public String getCreatedDate() { return createdDate; }
 public String getUpdatedDate() { return updatedDate; }
 
 public void setId(int id) throws BankingDataException {
     if (id <= 0) throw new BankingDataException("ID must be greater than 0");
     this.id = id;
 }
 
 public void setUpdatedDate(String updatedDate) throws BankingDataException {
     if (updatedDate == null || updatedDate.isEmpty()) throw new BankingDataException("Updated date cannot be empty");
     this.updatedDate = updatedDate;
 }
 
 @Override
 public String toString() {
     return "ID: " + id + ", Created: " + createdDate + ", Updated: " + updatedDate;
 }
}