package Alain_26584.q6;
//Bank Class
class Bank extends Entity {
 private String bankName;
 private String branchCode;
 private String address;
 
 public Bank(int id, String createdDate, String updatedDate, String bankName, 
             String branchCode, String address) throws BankingDataException {
     super(id, createdDate, updatedDate);
     
     if (bankName == null || bankName.isEmpty()) throw new BankingDataException("Bank name cannot be empty");
     if (branchCode == null || branchCode.length() < 3) 
         throw new BankingDataException("Branch code must be at least 3 characters");
     
     this.bankName = bankName;
     this.branchCode = branchCode;
     this.address = address;
 }
 
 public String getBankName() { return bankName; }
 public String getBranchCode() { return branchCode; }
 public String getAddress() { return address; }
 
 @Override
 public String toString() {
     return super.toString() + ", Bank: " + bankName + ", Branch: " + branchCode + 
            ", Address: " + address;
 }
}