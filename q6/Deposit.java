package Alain_26584.q6;

//Deposit Class
class Deposit extends Transaction {
 private double depositAmount;
 private String depositDate;
 
 public Deposit(int id, String createdDate, String updatedDate, String bankName,
               String branchCode, String address, String accountNumber,
               String accountType, double balance, String customerName,
               String email, String phoneNumber, String transactionId,
               String transactionType, double amount, double depositAmount,
               String depositDate) throws BankingDataException {
     super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
           accountType, balance, customerName, email, phoneNumber, transactionId,
           transactionType, amount);
     
     if (depositAmount <= 0) throw new BankingDataException("Deposit amount must be greater than 0");
     
     this.depositAmount = depositAmount;
     this.depositDate = depositDate;
 }
 
 public double getDepositAmount() { return depositAmount; }
 public String getDepositDate() { return depositDate; }
 
 @Override
 public String toString() {
     return super.toString() + ", Deposit Amount: $" + depositAmount + ", Date: " + depositDate;
 }
}