package Alain_26584.q2;

import com.school.management.School;
import com.school.management.SchoolDataException;

//Department Class
class Department extends School {
private String departmentName;
private String departmentCode;

public Department(int id, String createdDate, String updatedDate, String schoolName,
                String address, String phoneNumber, String email, String departmentName, 
                String departmentCode) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
   
   if (departmentName == null || departmentName.isEmpty()) throw new SchoolDataException("Department name cannot be empty");
   if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[a-zA-Z0-9]*$")) 
       throw new SchoolDataException("Department code must be alphanumeric and at least 3 characters");
   
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