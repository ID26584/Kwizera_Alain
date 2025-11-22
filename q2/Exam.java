package Alain_26584.q2;

import com.school.management.Course;
import com.school.management.SchoolDataException;

//Exam Class
class Exam extends Course {
private String examName;
private double maxMarks;
private String examDate;

public Exam(int id, String createdDate, String updatedDate, String schoolName,
          String address, String phoneNumber, String email, String departmentName,
          String departmentCode, String teacherName, String subject,
          String teacherEmail, String phone, String studentName, int rollNumber,
          String grade, String contactNumber, String courseName, String courseCode,
          double creditHours, String examName, double maxMarks, String examDate) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
         departmentName, departmentCode, teacherName, subject, teacherEmail,
         phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
   
   if (maxMarks <= 0) throw new SchoolDataException("Maximum marks must be greater than 0");
   if (examDate == null || examDate.isEmpty()) throw new SchoolDataException("Exam date cannot be empty");
   
   this.examName = examName;
   this.maxMarks = maxMarks;
   this.examDate = examDate;
}

public String getExamName() { return examName; }
public double getMaxMarks() { return maxMarks; }
public String getExamDate() { return examDate; }

@Override
public String toString() {
   return super.toString() + ", Exam: " + examName + ", Max Marks: " + maxMarks + ", Date: " + examDate;
}
}