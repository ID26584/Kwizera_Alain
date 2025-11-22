package Alain_26584.q2;

import com.school.management.Department;
import com.school.management.SchoolDataException;

//Teacher Class
class Teacher extends Department {
private String teacherName;
private String subject;
private String teacherEmail;
private String phone;

public Teacher(int id, String createdDate, String updatedDate, String schoolName,
             String address, String phoneNumber, String email, String departmentName,
             String departmentCode, String teacherName, String subject, 
             String teacherEmail, String phone) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
   
   if (subject == null || subject.isEmpty()) throw new SchoolDataException("Subject cannot be empty");
   if (!teacherEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new SchoolDataException("Invalid teacher email format");
   if (!phone.matches("\\d{10}")) throw new SchoolDataException("Teacher phone must be 10 digits");
   
   this.teacherName = teacherName;
   this.subject = subject;
   this.teacherEmail = teacherEmail;
   this.phone = phone;
}

public String getTeacherName() { return teacherName; }
public String getSubject() { return subject; }
public String getTeacherEmail() { return teacherEmail; }
public String getPhone() { return phone; }

@Override
public String toString() {
   return super.toString() + ", Teacher: " + teacherName + ", Subject: " + subject + 
          ", Email: " + teacherEmail + ", Phone: " + phone;
}
}