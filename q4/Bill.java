package Alain_26584.q4;

import com.hotel.reservation.HotelDataException;
import com.hotel.reservation.Payment;

//Bill Class
class Bill extends Payment {
private double roomCharge;
private double serviceCharge;
private double totalBill;

public Bill(int id, String createdDate, String updatedDate, String hotelName,
          String address, String phoneNumber, String email, String roomNumber,
          String roomType, double pricePerNight, String customerName,
          String customerEmail, String contactNumber, String bookingDate,
          String checkInDate, String checkOutDate, String serviceName,
          double serviceCost, String paymentMethod, String paymentDate,
          int numberOfNights) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
         bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
         paymentMethod, paymentDate);
   
   if (numberOfNights <= 0) throw new HotelDataException("Number of nights must be greater than 0");
   
   this.roomCharge = pricePerNight * numberOfNights;
   this.serviceCharge = serviceCost;
   this.totalBill = roomCharge + serviceCharge;
}

public double getRoomCharge() { return roomCharge; }
public double getServiceCharge() { return serviceCharge; }
public double getTotalBill() { return totalBill; }

@Override
public String toString() {
   return super.toString() + ", Room Charge: $" + roomCharge + ", Service Charge: $" + serviceCharge + 
          ", Total Bill: $" + totalBill;
}
}