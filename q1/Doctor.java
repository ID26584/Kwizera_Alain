package Alain_26584.q1;

import com.hospital.management.Department;
import com.hospital.management.HospitalDataException;

//Doctor Class
class Doctor extends Department {
private String doctorName;
private String specialization;
private String doctorEmail;
private String phone;

public Doctor(int id, String createdDate, String updatedDate, String hospitalName,
            String address, String phoneNumber, String email, String departmentName,
            String departmentCode, String doctorName, String specialization, 
            String doctorEmail, String phone) throws HospitalDataException {
   super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
   
   if (specialization == null || specialization.isEmpty()) throw new HospitalDataException("Specialization cannot be empty");
   if (!doctorEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HospitalDataException("Invalid doctor email format");
   if (!phone.matches("\\d{10}")) throw new HospitalDataException("Doctor phone must be 10 digits");
   
   this.doctorName = doctorName;
   this.specialization = specialization;
   this.doctorEmail = doctorEmail;
   this.phone = phone;
}

public String getDoctorName() { return doctorName; }
public String getSpecialization() { return specialization; }
public String getDoctorEmail() { return doctorEmail; }
public String getPhone() { return phone; }

@Override
public String toString() {
   return super.toString() + ", Doctor: " + doctorName + ", Specialization: " + specialization + 
          ", Email: " + doctorEmail + ", Phone: " + phone;
}
}