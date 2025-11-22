package Alain_26584.q6;

//Loan Class
class Loan extends Withdrawal {
 private double loanAmount;
 private double interestRate;
 private int duration; // in months
 
 public Loan(int id, String createdDate, String updatedDate, String bankName,
             String branchCode, String address, String accountNumber,
             String accountType, double balance, String customerName,
             String email, String phoneNumber, String transactionId,
             String transactionType, double amount, double depositAmount,
             String depositDate, double withdrawalAmount, String withdrawalDate,
             double loanAmount, double interestRate, int duration) throws BankingDataException {
     super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
           accountType, balance, customerName, email, phoneNumber, transactionId,
           transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
     
     if (loanAmount <= 0) throw new BankingDataException("Loan amount must be greater than 0");
     if (interestRate <= 0) throw new BankingDataException("Interest rate must be greater than 0");
     if (duration <= 0) throw new BankingDataException("Duration must be greater than 0");
     
     this.loanAmount = loanAmount;
     this.interestRate = interestRate;
     this.duration = duration;
 }
 
 public double getLoanAmount() { return loanAmount; }
 public double getInterestRate() { return interestRate; }
 public int getDuration() { return duration; }
 
 @Override
 public String toString() {
     return super.toString() + ", Loan: $" + loanAmount + ", Interest Rate: " + interestRate + 
            "%, Duration: " + duration + " months";
 }
}