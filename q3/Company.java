package Alain_26584.q3;

import com.company.payroll.Entity;
import com.company.payroll.PayrollDataException;

//Company Class
class Company extends Entity {
private String companyName;
private String address;
private String phoneNumber;
private String email;

public Company(int id, String createdDate, String updatedDate, String companyName, 
             String address, String phoneNumber, String email) throws PayrollDataException {
   super(id, createdDate, updatedDate);
   
   if (companyName == null || companyName.isEmpty()) throw new PayrollDataException("Company name cannot be empty");
   if (!phoneNumber.matches("\\d{10}")) throw new PayrollDataException("Phone number must be 10 digits");
   if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new PayrollDataException("Invalid email format");
   
   this.companyName = companyName;
   this.address = address;
   this.phoneNumber = phoneNumber;
   this.email = email;
}

public String getCompanyName() { return companyName; }
public String getAddress() { return address; }
public String getPhoneNumber() { return phoneNumber; }
public String getEmail() { return email; }

@Override
public String toString() {
   return super.toString() + ", Company: " + companyName + ", Address: " + address + 
          ", Phone: " + phoneNumber + ", Email: " + email;
}
}