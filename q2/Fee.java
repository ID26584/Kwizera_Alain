package Alain_26584.q2;

import com.school.management.Result;
import com.school.management.SchoolDataException;

//Fee Class
class Fee extends Result {
private double tuitionFee;
private double examFee;
private double totalFee;

public Fee(int id, String createdDate, String updatedDate, String schoolName,
         String address, String phoneNumber, String email, String departmentName,
         String departmentCode, String teacherName, String subject,
         String teacherEmail, String phone, String studentName, int rollNumber,
         String grade, String contactNumber, String courseName, String courseCode,
         double creditHours, String examName, double maxMarks, String examDate,
         double obtainedMarks, String remarks, double tuitionFee, double examFee) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
         departmentName, departmentCode, teacherName, subject, teacherEmail,
         phone, studentName, rollNumber, grade, contactNumber, courseName,
         courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
   
   if (tuitionFee <= 0) throw new SchoolDataException("Tuition fee must be greater than 0");
   if (examFee <= 0) throw new SchoolDataException("Exam fee must be greater than 0");
   
   this.tuitionFee = tuitionFee;
   this.examFee = examFee;
   this.totalFee = tuitionFee + examFee;
}

public double getTuitionFee() { return tuitionFee; }
public double getExamFee() { return examFee; }
public double getTotalFee() { return totalFee; }

@Override
public String toString() {
   return super.toString() + ", Tuition Fee: $" + tuitionFee + ", Exam Fee: $" + examFee + 
          ", Total Fee: $" + totalFee;
}
}