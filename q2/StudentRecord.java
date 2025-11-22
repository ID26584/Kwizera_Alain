package Alain_26584.q2;

import com.school.management.Fee;
import com.school.management.SchoolDataException;

//StudentRecord Class (Final)
final class StudentRecord extends Fee {
public StudentRecord(int id, String createdDate, String updatedDate, String schoolName,
                   String address, String phoneNumber, String email, String departmentName,
                   String departmentCode, String teacherName, String subject,
                   String teacherEmail, String phone, String studentName, int rollNumber,
                   String grade, String contactNumber, String courseName, String courseCode,
                   double creditHours, String examName, double maxMarks, String examDate,
                   double obtainedMarks, String remarks, double tuitionFee, double examFee) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
         departmentName, departmentCode, teacherName, subject, teacherEmail,
         phone, studentName, rollNumber, grade, contactNumber, courseName,
         courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks,
         tuitionFee, examFee);
}

public double calculateAverageMarks() {
   return (getObtainedMarks() / getMaxMarks()) * 100;
}

public void displayAllDetails() {
   System.out.println("\n=== SCHOOL MANAGEMENT SYSTEM - ALL DETAILS ===");
   System.out.println("School: " + getSchoolName());
   System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
   System.out.println("Teacher: " + getTeacherName() + " - " + getSubject());
   System.out.println("Student: " + getStudentName() + ", Roll No: " + getRollNumber() + ", Grade: " + getGrade());
   System.out.println("Course: " + getCourseName() + " (" + getCourseCode() + ")");
   System.out.println("Exam: " + getExamName() + " - " + getExamDate());
   System.out.println("Marks: " + getObtainedMarks() + "/" + getMaxMarks());
   System.out.println("Remarks: " + getRemarks());
   System.out.println("Average: " + String.format("%.2f", calculateAverageMarks()) + "%");
   System.out.println("Tuition Fee: $" + getTuitionFee());
   System.out.println("Exam Fee: $" + getExamFee());
   System.out.println("Total Fee: $" + getTotalFee());
   System.out.println("=============================================");
}
}