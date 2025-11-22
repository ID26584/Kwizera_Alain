package Alain_26584.q5;

import com.vehicle.rental.Entity;
import com.vehicle.rental.RentalDataException;

//Company Class
class Company extends Entity {
private String companyName;
private String address;
private String phoneNumber;

public Company(int id, String createdDate, String updatedDate, String companyName, 
             String address, String phoneNumber) throws RentalDataException {
   super(id, createdDate, updatedDate);
   
   if (companyName == null || companyName.isEmpty()) throw new RentalDataException("Company name cannot be empty");
   if (!phoneNumber.matches("\\d{10}")) throw new RentalDataException("Phone number must be 10 digits");
   
   this.companyName = companyName;
   this.address = address;
   this.phoneNumber = phoneNumber;
}

public String getCompanyName() { return companyName; }
public String getAddress() { return address; }
public String getPhoneNumber() { return phoneNumber; }

@Override
public String toString() {
   return super.toString() + ", Company: " + companyName + ", Address: " + address + 
          ", Phone: " + phoneNumber;
}
}