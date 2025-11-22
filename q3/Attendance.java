package Alain_26584.q3;

import com.company.payroll.Employee;
import com.company.payroll.PayrollDataException;

//Attendance Class
class Attendance extends Employee {
private int totalDays;
private int presentDays;
private int leaveDays;

public Attendance(int id, String createdDate, String updatedDate, String companyName,
                String address, String phoneNumber, String email, String departmentName,
                String departmentCode, String managerName, String managerEmail,
                String phone, String employeeName, int employeeId, String designation,
                String contactNumber, int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
         departmentName, departmentCode, managerName, managerEmail, phone,
         employeeName, employeeId, designation, contactNumber);
   
   if (totalDays < 0) throw new PayrollDataException("Total days cannot be negative");
   if (presentDays < 0) throw new PayrollDataException("Present days cannot be negative");
   if (leaveDays < 0) throw new PayrollDataException("Leave days cannot be negative");
   if (presentDays > totalDays) throw new PayrollDataException("Present days cannot exceed total days");
   
   this.totalDays = totalDays;
   this.presentDays = presentDays;
   this.leaveDays = leaveDays;
}

public int getTotalDays() { return totalDays; }
public int getPresentDays() { return presentDays; }
public int getLeaveDays() { return leaveDays; }

@Override
public String toString() {
   return super.toString() + ", Attendance - Total Days: " + totalDays + ", Present: " + presentDays + 
          ", Leave: " + leaveDays;
}
}