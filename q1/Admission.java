package Alain_26584.q1;

import com.hospital.management.HospitalDataException;
import com.hospital.management.Patient;

//Admission Class
class Admission extends Patient {
private String admissionDate;
private String roomNumber;
private double roomCharges;

public Admission(int id, String createdDate, String updatedDate, String hospitalName,
               String address, String phoneNumber, String email, String departmentName,
               String departmentCode, String doctorName, String specialization,
               String doctorEmail, String phone, String nurseName, String shift,
               int yearsOfExperience, String patientName, int age, String gender,
               String contactNumber, String admissionDate, String roomNumber, 
               double roomCharges) throws HospitalDataException {
   super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
         departmentName, departmentCode, doctorName, specialization, doctorEmail,
         phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);
   
   if (admissionDate == null || admissionDate.isEmpty()) throw new HospitalDataException("Admission date cannot be empty");
   if (roomCharges <= 0) throw new HospitalDataException("Room charges must be greater than 0");
   
   this.admissionDate = admissionDate;
   this.roomNumber = roomNumber;
   this.roomCharges = roomCharges;
}

public String getAdmissionDate() { return admissionDate; }
public String getRoomNumber() { return roomNumber; }
public double getRoomCharges() { return roomCharges; }

@Override
public String toString() {
   return super.toString() + ", Admission Date: " + admissionDate + ", Room: " + roomNumber + 
          ", Room Charges: $" + roomCharges;
}
}