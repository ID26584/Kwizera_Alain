package Alain_26584.q6;

//Payment Class
class Payment extends Loan {
 private double paymentAmount;
 private String paymentDate;
 
 public Payment(int id, String createdDate, String updatedDate, String bankName,
               String branchCode, String address, String accountNumber,
               String accountType, double balance, String customerName,
               String email, String phoneNumber, String transactionId,
               String transactionType, double amount, double depositAmount,
               String depositDate, double withdrawalAmount, String withdrawalDate,
               double loanAmount, double interestRate, int duration,
               double paymentAmount, String paymentDate) throws BankingDataException {
     super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
           accountType, balance, customerName, email, phoneNumber, transactionId,
           transactionType, amount, depositAmount, depositDate, withdrawalAmount,
           withdrawalDate, loanAmount, interestRate, duration);
     
     if (paymentAmount <= 0) throw new BankingDataException("Payment amount must be greater than 0");
     
     this.paymentAmount = paymentAmount;
     this.paymentDate = paymentDate;
 }
 
 public double getPaymentAmount() { return paymentAmount; }
 public String getPaymentDate() { return paymentDate; }
 
 @Override
 public String toString() {
     return super.toString() + ", Payment: $" + paymentAmount + ", Date: " + paymentDate;
 }
}