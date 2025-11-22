package Alain_26584.q4;

import com.hotel.reservation.Booking;
import com.hotel.reservation.HotelDataException;

//Service Class
class Service extends Booking {
private String serviceName;
private double serviceCost;

public Service(int id, String createdDate, String updatedDate, String hotelName,
             String address, String phoneNumber, String email, String roomNumber,
             String roomType, double pricePerNight, String customerName,
             String customerEmail, String contactNumber, String bookingDate,
             String checkInDate, String checkOutDate, String serviceName,
             double serviceCost) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
         bookingDate, checkInDate, checkOutDate);
   
   if (serviceCost <= 0) throw new HotelDataException("Service cost must be greater than 0");
   
   this.serviceName = serviceName;
   this.serviceCost = serviceCost;
}

public String getServiceName() { return serviceName; }
public double getServiceCost() { return serviceCost; }

@Override
public String toString() {
   return super.toString() + ", Service: " + serviceName + ", Cost: $" + serviceCost;
}
}