package Alain_26584.q2;

//Main Class
import java.util.Scanner;

public class SchoolManagementSystem {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   try {
       System.out.println("=== SCHOOL MANAGEMENT SYSTEM ===");
       
       // Input data
       System.out.print("Enter School Name: ");
       String schoolName = scanner.nextLine();
       
       System.out.print("Enter School Address: ");
       String address = scanner.nextLine();
       
       System.out.print("Enter School Phone (10 digits): ");
       String phoneNumber = scanner.nextLine();
       
       System.out.print("Enter School Email: ");
       String email = scanner.nextLine();
       
       System.out.print("Enter Department Name: ");
       String departmentName = scanner.nextLine();
       
       System.out.print("Enter Department Code: ");
       String departmentCode = scanner.nextLine();
       
       System.out.print("Enter Teacher Name: ");
       String teacherName = scanner.nextLine();
       
       System.out.print("Enter Subject: ");
       String subject = scanner.nextLine();
       
       System.out.print("Enter Teacher Email: ");
       String teacherEmail = scanner.nextLine();
       
       System.out.print("Enter Teacher Phone: ");
       String teacherPhone = scanner.nextLine();
       
       System.out.print("Enter Student Name: ");
       String studentName = scanner.nextLine();
       
       System.out.print("Enter Roll Number: ");
       int rollNumber = scanner.nextInt();
       scanner.nextLine();
       
       System.out.print("Enter Grade: ");
       String grade = scanner.nextLine();
       
       System.out.print("Enter Contact Number: ");
       String contactNumber = scanner.nextLine();
       
       System.out.print("Enter Course Name: ");
       String courseName = scanner.nextLine();
       
       System.out.print("Enter Course Code: ");
       String courseCode = scanner.nextLine();
       
       System.out.print("Enter Credit Hours: ");
       double creditHours = scanner.nextDouble();
       
       scanner.nextLine();
       System.out.print("Enter Exam Name: ");
       String examName = scanner.nextLine();
       
       System.out.print("Enter Maximum Marks: ");
       double maxMarks = scanner.nextDouble();
       
       scanner.nextLine();
       System.out.print("Enter Exam Date: ");
       String examDate = scanner.nextLine();
       
       System.out.print("Enter Obtained Marks: ");
       double obtainedMarks = scanner.nextDouble();
       
       scanner.nextLine();
       System.out.print("Enter Remarks: ");
       String remarks = scanner.nextLine();
       
       System.out.print("Enter Tuition Fee: ");
       double tuitionFee = scanner.nextDouble();
       
       System.out.print("Enter Exam Fee: ");
       double examFee = scanner.nextDouble();
       
       // Create StudentRecord object
       StudentRecord record = new StudentRecord(
           1, "2024-01-01", "2024-01-15", schoolName, address, phoneNumber, email,
           departmentName, departmentCode, teacherName, subject, teacherEmail,
           teacherPhone, studentName, rollNumber, grade, contactNumber, courseName,
           courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks,
           remarks, tuitionFee, examFee
       );
       
       // Display all details
       record.displayAllDetails();
       
   } catch (SchoolDataException e) {
       System.out.println("Error: " + e.getMessage());
   } catch (Exception e) {
       System.out.println("Unexpected error: " + e.getMessage());
   } finally {
       scanner.close();
   }
}
}