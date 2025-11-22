package Alain_26584.q2;

import com.school.management.SchoolDataException;
import com.school.management.Student;

//Course Class
class Course extends Student {
private String courseName;
private String courseCode;
private double creditHours;

public Course(int id, String createdDate, String updatedDate, String schoolName,
            String address, String phoneNumber, String email, String departmentName,
            String departmentCode, String teacherName, String subject,
            String teacherEmail, String phone, String studentName, int rollNumber,
            String grade, String contactNumber, String courseName, String courseCode,
            double creditHours) throws SchoolDataException {
   super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
         departmentName, departmentCode, teacherName, subject, teacherEmail,
         phone, studentName, rollNumber, grade, contactNumber);
   
   if (creditHours <= 0) throw new SchoolDataException("Credit hours must be greater than 0");
   
   this.courseName = courseName;
   this.courseCode = courseCode;
   this.creditHours = creditHours;
}

public String getCourseName() { return courseName; }
public String getCourseCode() { return courseCode; }
public double getCreditHours() { return creditHours; }

@Override
public String toString() {
   return super.toString() + ", Course: " + courseName + " (" + courseCode + "), Credit Hours: " + creditHours;
}
}