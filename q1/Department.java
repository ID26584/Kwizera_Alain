package Alain_26584.q1;

import com.hospital.management.Hospital;
import com.hospital.management.HospitalDataException;

//Department Class
class Department extends Hospital {
private String departmentName;
private String departmentCode;

public Department(int id, String createdDate, String updatedDate, String hospitalName,
                String address, String phoneNumber, String email, String departmentName, 
                String departmentCode) throws HospitalDataException {
   super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
   
   if (departmentName == null || departmentName.isEmpty()) throw new HospitalDataException("Department name cannot be empty");
   if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[a-zA-Z0-9]*$")) 
       throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
   
   this.departmentName = departmentName;
   this.departmentCode = departmentCode;
}

public String getDepartmentName() { return departmentName; }
public String getDepartmentCode() { return departmentCode; }

@Override
public String toString() {
   return super.toString() + ", Department: " + departmentName + " (" + departmentCode + ")";
}
}