package Alain_26584.q1;

import com.hospital.management.Entity;
import com.hospital.management.HospitalDataException;

//Hospital Class
class Hospital extends Entity {
private String hospitalName;
private String address;
private String phoneNumber;
private String email;

public Hospital(int id, String createdDate, String updatedDate, String hospitalName, 
              String address, String phoneNumber, String email) throws HospitalDataException {
   super(id, createdDate, updatedDate);
   
   if (hospitalName == null || hospitalName.isEmpty()) throw new HospitalDataException("Hospital name cannot be empty");
   if (!phoneNumber.matches("\\d{10}")) throw new HospitalDataException("Phone number must be 10 digits");
   if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HospitalDataException("Invalid email format");
   
   this.hospitalName = hospitalName;
   this.address = address;
   this.phoneNumber = phoneNumber;
   this.email = email;
}

public String getHospitalName() { return hospitalName; }
public String getAddress() { return address; }
public String getPhoneNumber() { return phoneNumber; }
public String getEmail() { return email; }

@Override
public String toString() {
   return super.toString() + ", Hospital: " + hospitalName + ", Address: " + address + 
          ", Phone: " + phoneNumber + ", Email: " + email;
}
}