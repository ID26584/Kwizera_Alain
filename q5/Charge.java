package Alain_26584.q5;

import com.vehicle.rental.Rental;
import com.vehicle.rental.RentalDataException;

//Charge Class
class Charge extends Rental {
private double rentalCharge;
private double penaltyCharge;

public Charge(int id, String createdDate, String updatedDate, String companyName,
            String address, String phoneNumber, String branchName, String locationCode,
            String vehicleType, String registrationNumber, double dailyRate,
            String customerName, String licenseNumber, String contactNumber,
            String rentalDate, String returnDate, int rentalDays,
            double penaltyCharge) throws RentalDataException {
   super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName,
         locationCode, vehicleType, registrationNumber, dailyRate, customerName,
         licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
   
   if (penaltyCharge < 0) throw new RentalDataException("Penalty charge cannot be negative");
   
   this.rentalCharge = dailyRate * rentalDays;
   this.penaltyCharge = penaltyCharge;
}

public double getRentalCharge() { return rentalCharge; }
public double getPenaltyCharge() { return penaltyCharge; }

@Override
public String toString() {
   return super.toString() + ", Rental Charge: $" + rentalCharge + ", Penalty Charge: $" + penaltyCharge;
}
}