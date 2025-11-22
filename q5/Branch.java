package Alain_26584.q5;

import com.vehicle.rental.Company;
import com.vehicle.rental.RentalDataException;

//Branch Class
class Branch extends Company {
private String branchName;
private String locationCode;

public Branch(int id, String createdDate, String updatedDate, String companyName,
            String address, String phoneNumber, String branchName, 
            String locationCode) throws RentalDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber);
   
   if (branchName == null || branchName.isEmpty()) throw new RentalDataException("Branch name cannot be empty");
   if (locationCode == null || locationCode.length() < 3) 
       throw new RentalDataException("Location code must be at least 3 characters");
   
   this.branchName = branchName;
   this.locationCode = locationCode;
}

public String getBranchName() { return branchName; }
public String getLocationCode() { return locationCode; }

@Override
public String toString() {
   return super.toString() + ", Branch: " + branchName + ", Location Code: " + locationCode;
}
}