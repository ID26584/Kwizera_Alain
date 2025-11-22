package Alain_26584.q2;

import com.school.management.Entity;
import com.school.management.SchoolDataException;

//School Class
class School extends Entity {
private String schoolName;
private String address;
private String phoneNumber;
private String email;

public School(int id, String createdDate, String updatedDate, String schoolName, 
            String address, String phoneNumber, String email) throws SchoolDataException {
   super(id, createdDate, updatedDate);
   
   if (schoolName == null || schoolName.isEmpty()) throw new SchoolDataException("School name cannot be empty");
   if (!phoneNumber.matches("\\d{10}")) throw new SchoolDataException("Phone number must be 10 digits");
   if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new SchoolDataException("Invalid email format");
   
   this.schoolName = schoolName;
   this.address = address;
   this.phoneNumber = phoneNumber;
   this.email = email;
}

public String getSchoolName() { return schoolName; }
public String getAddress() { return address; }
public String getPhoneNumber() { return phoneNumber; }
public String getEmail() { return email; }

@Override
public String toString() {
   return super.toString() + ", School: " + schoolName + ", Address: " + address + 
          ", Phone: " + phoneNumber + ", Email: " + email;
}
}