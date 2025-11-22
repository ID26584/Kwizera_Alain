package Alain_26584.q6;

//AccountRecord Class (Final)
final class AccountRecord extends Payment {
 public AccountRecord(int id, String createdDate, String updatedDate, String bankName,
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
           withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
 }
 
 public double calculateInterest() {
     return (getLoanAmount() * getInterestRate() * getDuration()) / 100;
 }
 
 public double getTotalLoanAmount() {
     return getLoanAmount() + calculateInterest();
 }
 
 public void displayAccountDetails() {
     System.out.println("\n=== BANKING SYSTEM - ACCOUNT DETAILS ===");
     System.out.println("Bank: " + getBankName() + " (" + getBranchCode() + ")");
     System.out.println("Customer: " + getCustomerName());
     System.out.println("Account: " + getAccountNumber() + " (" + getAccountType() + ")");
     System.out.println("Balance: $" + getBalance());
     System.out.println("Email: " + getEmail());
     System.out.println("Phone: " + getPhoneNumber());
     
     System.out.println("\n--- Transaction History ---");
     System.out.println("Transaction ID: " + getTransactionId());
     System.out.println("Transaction Type: " + getTransactionType());
     System.out.println("Amount: $" + getAmount());
     System.out.println("Deposit: $" + getDepositAmount() + " on " + getDepositDate());
     System.out.println("Withdrawal: $" + getWithdrawalAmount() + " on " + getWithdrawalDate());
     
     System.out.println("\n--- Loan Information ---");
     System.out.println("Loan Amount: $" + getLoanAmount());
     System.out.println("Interest Rate: " + getInterestRate() + "%");
     System.out.println("Duration: " + getDuration() + " months");
     System.out.println("Interest: $" + calculateInterest());
     System.out.println("Total Loan Amount: $" + getTotalLoanAmount());
     
     System.out.println("\n--- Payment Information ---");
     System.out.println("Payment Amount: $" + getPaymentAmount());
     System.out.println("Payment Date: " + getPaymentDate());
     System.out.println("=======================================");
 }
}