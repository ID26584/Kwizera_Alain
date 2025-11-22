package Alain_26584.q2;

import com.school.management.Exam;
import com.school.management.SchoolDataException;

//Result Class
class Result extends Exam {
private double obtainedMarks;
private String remarks;

public Result(int id, String createdDate, String updatedDate, String schoolName,
            String address, String phoneNumber, String email, String departmentName,
            String departmentCode, String teacherName, String subject,
            String teacherEmail, String phone, String studentName, int rollNumber,
            String grade, String contactNumber, String courseName, String courseCode,
            double creditHours, String examName, double maxMarks, String examDate,
            double obtainedMarks, String remarks) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
         departmentName, departmentCode, teacherName, subject, teacherEmail,
         phone, studentName, rollNumber, grade, contactNumber, courseName,
         courseCode, creditHours, examName, maxMarks, examDate);
   
   if (obtainedMarks < 0) throw new SchoolDataException("Obtained marks cannot be negative");
   if (obtainedMarks > getMaxMarks()) throw new SchoolDataException("Obtained marks cannot exceed maximum marks");
   if (remarks == null || remarks.isEmpty()) throw new SchoolDataException("Remarks cannot be empty");
   
   this.obtainedMarks = obtainedMarks;
   this.remarks = remarks;
}

public double getObtainedMarks() { return obtainedMarks; }
public String getRemarks() { return remarks; }

@Override
public String toString() {
   return super.toString() + ", Obtained Marks: " + obtainedMarks + ", Remarks: " + remarks;
}
}