package Alain_26584.q1;

import com.hospital.management.Bill;
import com.hospital.management.HospitalDataException;

//HospitalRecord Class (Final)
final class HospitalRecord extends Bill {
public HospitalRecord(int id, String createdDate, String updatedDate, String hospitalName,
                    String address, String phoneNumber, String email, String departmentName,
                    String departmentCode, String doctorName, String specialization,
                    String doctorEmail, String phone, String nurseName, String shift,
                    int yearsOfExperience, String patientName, int age, String gender,
                    String contactNumber, String admissionDate, String roomNumber,
                    double roomCharges, String diagnosis, String treatmentGiven,
                    double treatmentCost, double documentCost, double doctorFee,
                    double medicineCost) throws HospitalDataException {
   super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
         departmentName, departmentCode, doctorName, specialization, doctorEmail,
         phone, nurseName, shift, yearsOfExperience, patientName, age, gender,
         contactNumber, admissionDate, roomNumber, roomCharges, diagnosis,
         treatmentGiven, treatmentCost, documentCost, doctorFee, medicineCost);
}

public void generateBill() {
   double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
   System.out.println("\n=== HOSPITAL BILL ===");
   System.out.println("Patient: " + getPatientName());
   System.out.println("Room Charges: $" + getRoomCharges());
   System.out.println("Treatment Cost: $" + getTreatmentCost());
   System.out.println("Doctor Fee: $" + getDoctorFee());
   System.out.println("Medicine Cost: $" + getMedicineCost());
   System.out.println("TOTAL BILL: $" + total);
   System.out.println("=====================");
}

public void displayAllDetails() {
   System.out.println("\n=== HOSPITAL MANAGEMENT SYSTEM - ALL DETAILS ===");
   System.out.println("Hospital: " + getHospitalName());
   System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
   System.out.println("Doctor: " + getDoctorName() + " - " + getSpecialization());
   System.out.println("Nurse: " + getNurseName() + " (" + getShift() + " shift)");
   System.out.println("Patient: " + getPatientName() + ", Age: " + getAge() + ", Gender: " + getGender());
   System.out.println("Admission: " + getAdmissionDate() + ", Room: " + getRoomNumber());
   System.out.println("Diagnosis: " + getDiagnosis());
   System.out.println("Treatment: " + getTreatmentGiven());
   generateBill();
}
}