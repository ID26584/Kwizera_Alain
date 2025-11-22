package Alain_26584.q6;

//Withdrawal Class
class Withdrawal extends Deposit {
 private double withdrawalAmount;
 private String withdrawalDate;
 
 public Withdrawal(int id, String createdDate, String updatedDate, String bankName,
                  String branchCode, String address, String accountNumber,
                  String accountType, double balance, String customerName,
                  String email, String phoneNumber, String transactionId,
                  String transactionType, double amount, double depositAmount,
                  String depositDate, double withdrawalAmount, String withdrawalDate) throws BankingDataException {
     super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
           accountType, balance, customerName, email, phoneNumber, transactionId,
           transactionType, amount, depositAmount, depositDate);
     
     if (withdrawalAmount <= 0) throw new BankingDataException("Withdrawal amount must be greater than 0");
     if (withdrawalAmount > getBalance()) throw new BankingDataException("Insufficient balance for withdrawal");
     
     this.withdrawalAmount = withdrawalAmount;
     this.withdrawalDate = withdrawalDate;
 }
 
 public double getWithdrawalAmount() { return withdrawalAmount; }
 public String getWithdrawalDate() { return withdrawalDate; }
 
 @Override
 public String toString() {
     return super.toString() + ", Withdrawal Amount: $" + withdrawalAmount + ", Date: " + withdrawalDate;
 }
}