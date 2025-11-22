package Alain_26584.q3;

import com.company.payroll.Company;
import com.company.payroll.PayrollDataException;

//Department Class
class Department extends Company {
private String departmentName;
private String departmentCode;

public Department(int id, String createdDate, String updatedDate, String companyName,
                String address, String phoneNumber, String email, String departmentName, 
                String departmentCode) throws PayrollDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
   
   if (departmentName == null || departmentName.isEmpty()) throw new PayrollDataException("Department name cannot be empty");
   if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("^[a-zA-Z0-9]*$")) 
       throw new PayrollDataException("Department code must be alphanumeric and at least 3 characters");
   
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