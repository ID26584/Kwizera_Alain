package Alain_26584.q1;

import com.hospital.management.HospitalDataException;
import com.hospital.management.Treatment;

//Bill Class
class Bill extends Treatment {
private double doctorFee;
private double medicineCost;
private double totalBill;

public Bill(int id, String createdDate, String updatedDate, String hospitalName,
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
         treatmentGiven, treatmentCost, documentCost);
   
   if (doctorFee <= 0) throw new HospitalDataException("Doctor fee must be greater than 0");
   if (medicineCost <= 0) throw new HospitalDataException("Medicine cost must be greater than 0");
   
   this.doctorFee = doctorFee;
   this.medicineCost = medicineCost;
   this.totalBill = roomCharges + treatmentCost + doctorFee + medicineCost;
}

public double getDoctorFee() { return doctorFee; }
public double getMedicineCost() { return medicineCost; }
public double getTotalBill() { return totalBill; }

@Override
public String toString() {
   return super.toString() + ", Doctor Fee: $" + doctorFee + ", Medicine Cost: $" + medicineCost + 
          ", Total Bill: $" + totalBill;
}
}