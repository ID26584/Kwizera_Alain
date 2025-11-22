package Alain_26584.q7;

//Agent Class
class Agent extends Agency {
 private String agentName;
 private String email;
 private String licenseNumber;
 
 public Agent(int id, String createdDate, String updatedDate, String agencyName,
              String location, String phoneNumber, String agentName, String email,
              String licenseNumber) throws RealEstateDataException {
     super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
     
     if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new RealEstateDataException("Invalid email format");
     
     this.agentName = agentName;
     this.email = email;
     this.licenseNumber = licenseNumber;
 }
 
 public String getAgentName() { return agentName; }
 public String getEmail() { return email; }
 public String getLicenseNumber() { return licenseNumber; }
 
 @Override
 public String toString() {
     return super.toString() + ", Agent: " + agentName + ", Email: " + email + 
            ", License: " + licenseNumber;
 }
}