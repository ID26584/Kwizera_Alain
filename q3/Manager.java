package Alain_26584.q3;

import com.company.payroll.Department;
import com.company.payroll.PayrollDataException;

//Manager Class
class Manager extends Department {
private String managerName;
private String managerEmail;
private String phone;

public Manager(int id, String createdDate, String updatedDate, String companyName,
             String address, String phoneNumber, String email, String departmentName,
             String departmentCode, String managerName, String managerEmail, 
             String phone) throws PayrollDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
   
   if (managerName == null || managerName.isEmpty()) throw new PayrollDataException("Manager name cannot be empty");
   if (!managerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new PayrollDataException("Invalid manager email format");
   if (!phone.matches("\\d{10}")) throw new PayrollDataException("Manager phone must be 10 digits");
   
   this.managerName = managerName;
   this.managerEmail = managerEmail;
   this.phone = phone;
}

public String getManagerName() { return managerName; }
public String getManagerEmail() { return managerEmail; }
public String getPhone() { return phone; }

@Override
public String toString() {
   return super.toString() + ", Manager: " + managerName + ", Email: " + managerEmail + 
          ", Phone: " + phone;
}
}