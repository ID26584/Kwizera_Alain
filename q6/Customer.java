package Alain_26584.q6;

//Customer Class
class Customer extends Account {
 private String customerName;
 private String email;
 private String phoneNumber;
 
 public Customer(int id, String createdDate, String updatedDate, String bankName,
                String branchCode, String address, String accountNumber,
                String accountType, double balance, String customerName,
                String email, String phoneNumber) throws BankingDataException {
     super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
     
     if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new BankingDataException("Invalid email format");
     if (!phoneNumber.matches("\\d{10}")) throw new BankingDataException("Phone number must be 10 digits");
     
     this.customerName = customerName;
     this.email = email;
     this.phoneNumber = phoneNumber;
 }
 
 public String getCustomerName() { return customerName; }
 public String getEmail() { return email; }
 public String getPhoneNumber() { return phoneNumber; }
 
 @Override
 public String toString() {
     return super.toString() + ", Customer: " + customerName + ", Email: " + email + 
            ", Phone: " + phoneNumber;
 }
}