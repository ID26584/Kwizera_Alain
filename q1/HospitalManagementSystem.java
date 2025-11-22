package Alain_26584.q1;

//Main Class
import java.util.Scanner;

public class HospitalManagementSystem {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   try {
       System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");
       
       // Input data
       System.out.print("Enter Hospital Name: ");
       String hospitalName = scanner.nextLine();
       
       System.out.print("Enter Hospital Address: ");
       String address = scanner.nextLine();
       
       System.out.print("Enter Hospital Phone (10 digits): ");
       String phoneNumber = scanner.nextLine();
       
       System.out.print("Enter Hospital Email: ");
       String email = scanner.nextLine();
       
       System.out.print("Enter Department Name: ");
       String departmentName = scanner.nextLine();
       
       System.out.print("Enter Department Code: ");
       String departmentCode = scanner.nextLine();
       
       System.out.print("Enter Doctor Name: ");
       String doctorName = scanner.nextLine();
       
       System.out.print("Enter Specialization: ");
       String specialization = scanner.nextLine();
       
       System.out.print("Enter Doctor Email: ");
       String doctorEmail = scanner.nextLine();
       
       System.out.print("Enter Doctor Phone: ");
       String doctorPhone = scanner.nextLine();
       
       System.out.print("Enter Nurse Name: ");
       String nurseName = scanner.nextLine();
       
       System.out.print("Enter Shift (Day/Night): ");
       String shift = scanner.nextLine();
       
       System.out.print("Enter Years of Experience: ");
       int experience = scanner.nextInt();
       scanner.nextLine(); // consume newline
       
       System.out.print("Enter Patient Name: ");
       String patientName = scanner.nextLine();
       
       System.out.print("Enter Patient Age: ");
       int age = scanner.nextInt();
       scanner.nextLine();
       
       System.out.print("Enter Gender (Male/Female/Other): ");
       String gender = scanner.nextLine();
       
       System.out.print("Enter Contact Number: ");
       String contactNumber = scanner.nextLine();
       
       System.out.print("Enter Admission Date: ");
       String admissionDate = scanner.nextLine();
       
       System.out.print("Enter Room Number: ");
       String roomNumber = scanner.nextLine();
       
       System.out.print("Enter Room Charges: ");
       double roomCharges = scanner.nextDouble();
       
       scanner.nextLine(); // consume newline
       System.out.print("Enter Diagnosis: ");
       String diagnosis = scanner.nextLine();
       
       System.out.print("Enter Treatment Given: ");
       String treatmentGiven = scanner.nextLine();
       
       System.out.print("Enter Treatment Cost: ");
       double treatmentCost = scanner.nextDouble();
       
       System.out.print("Enter Document Cost: ");
       double documentCost = scanner.nextDouble();
       
       System.out.print("Enter Doctor Fee: ");
       double doctorFee = scanner.nextDouble();
       
       System.out.print("Enter Medicine Cost: ");
       double medicineCost = scanner.nextDouble();
       
       // Create HospitalRecord object
       HospitalRecord record = new HospitalRecord(
           1, "2024-01-01", "2024-01-15", hospitalName, address, phoneNumber, email,
           departmentName, departmentCode, doctorName, specialization, doctorEmail,
           doctorPhone, nurseName, shift, experience, patientName, age, gender,
           contactNumber, admissionDate, roomNumber, roomCharges, diagnosis,
           treatmentGiven, treatmentCost, documentCost, doctorFee, medicineCost
       );
       
       // Display all details and bill
       record.displayAllDetails();
       
   } catch (HospitalDataException e) {
       System.out.println("Error: " + e.getMessage());
   } catch (Exception e) {
       System.out.println("Unexpected error: " + e.getMessage());
   } finally {
       scanner.close();
   }
}
}