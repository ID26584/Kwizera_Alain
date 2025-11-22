package Alain_26584.q1;

import com.hospital.management.Admission;
import com.hospital.management.HospitalDataException;

//Treatment Class
class Treatment extends Admission {
private String diagnosis;
private String treatmentGiven;
private double treatmentCost;
private double documentCost;

public Treatment(int id, String createdDate, String updatedDate, String hospitalName,
               String address, String phoneNumber, String email, String departmentName,
               String departmentCode, String doctorName, String specialization,
               String doctorEmail, String phone, String nurseName, String shift,
               int yearsOfExperience, String patientName, int age, String gender,
               String contactNumber, String admissionDate, String roomNumber,
               double roomCharges, String diagnosis, String treatmentGiven,
               double treatmentCost, double documentCost) throws HospitalDataException {
   super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
         departmentName, departmentCode, doctorName, specialization, doctorEmail,
         phone, nurseName, shift, yearsOfExperience, patientName, age, gender,
         contactNumber, admissionDate, roomNumber, roomCharges);
   
   if (diagnosis == null || diagnosis.isEmpty()) throw new HospitalDataException("Diagnosis cannot be empty");
   if (treatmentGiven == null || treatmentGiven.isEmpty()) throw new HospitalDataException("Treatment given cannot be empty");
   if (treatmentCost <= 0) throw new HospitalDataException("Treatment cost must be greater than 0");
   
   this.diagnosis = diagnosis;
   this.treatmentGiven = treatmentGiven;
   this.treatmentCost = treatmentCost;
   this.documentCost = documentCost;
}

public String getDiagnosis() { return diagnosis; }
public String getTreatmentGiven() { return treatmentGiven; }
public double getTreatmentCost() { return treatmentCost; }
public double getDocumentCost() { return documentCost; }

@Override
public String toString() {
   return super.toString() + ", Diagnosis: " + diagnosis + ", Treatment: " + treatmentGiven + 
          ", Treatment Cost: $" + treatmentCost + ", Document Cost: $" + documentCost;
}
}