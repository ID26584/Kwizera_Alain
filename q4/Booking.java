package Alain_26584.q4;

import com.hotel.reservation.Customer;
import com.hotel.reservation.HotelDataException;

//Booking Class
class Booking extends Customer {
private String bookingDate;
private String checkInDate;
private String checkOutDate;

public Booking(int id, String createdDate, String updatedDate, String hotelName,
             String address, String phoneNumber, String email, String roomNumber,
             String roomType, double pricePerNight, String customerName,
             String customerEmail, String contactNumber, String bookingDate,
             String checkInDate, String checkOutDate) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
   
   if (bookingDate == null || bookingDate.isEmpty()) throw new HotelDataException("Booking date cannot be empty");
   if (checkInDate == null || checkInDate.isEmpty()) throw new HotelDataException("Check-in date cannot be empty");
   if (checkOutDate == null || checkOutDate.isEmpty()) throw new HotelDataException("Check-out date cannot be empty");
   
   this.bookingDate = bookingDate;
   this.checkInDate = checkInDate;
   this.checkOutDate = checkOutDate;
}

public String getBookingDate() { return bookingDate; }
public String getCheckInDate() { return checkInDate; }
public String getCheckOutDate() { return checkOutDate; }

@Override
public String toString() {
   return super.toString() + ", Booking Date: " + bookingDate + ", Check-in: " + checkInDate + 
          ", Check-out: " + checkOutDate;
}
}