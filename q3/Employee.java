package Alain_26584.q3;

import com.company.payroll.Manager;
import com.company.payroll.PayrollDataException;

//Employee Class
class Employee extends Manager {
private String employeeName;
private int employeeId;
private String designation;
private String contactNumber;

public Employee(int id, String createdDate, String updatedDate, String companyName,
              String address, String phoneNumber, String email, String departmentName,
              String departmentCode, String managerName, String managerEmail,
              String phone, String employeeName, int employeeId, String designation,
              String contactNumber) throws PayrollDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
         departmentName, departmentCode, managerName, managerEmail, phone);
   
   if (employeeId <= 0) throw new PayrollDataException("Employee ID must be greater than 0");
   if (!contactNumber.matches("\\d{10}")) throw new PayrollDataException("Contact number must be 10 digits");
   
   this.employeeName = employeeName;
   this.employeeId = employeeId;
   this.designation = designation;
   this.contactNumber = contactNumber;
}

public String getEmployeeName() { return employeeName; }
public int getEmployeeId() { return employeeId; }
public String getDesignation() { return designation; }
public String getContactNumber() { return contactNumber; }

@Override
public String toString() {
   return super.toString() + ", Employee: " + employeeName + ", ID: " + employeeId + 
          ", Designation: " + designation + ", Contact: " + contactNumber;
}
}