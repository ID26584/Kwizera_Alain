package Alain_26584.q4;

import com.hotel.reservation.Entity;
import com.hotel.reservation.HotelDataException;

//Hotel Class
class Hotel extends Entity {
private String hotelName;
private String address;
private String phoneNumber;
private String email;

public Hotel(int id, String createdDate, String updatedDate, String hotelName, 
           String address, String phoneNumber, String email) throws HotelDataException {
   super(id, createdDate, updatedDate);
   
   if (hotelName == null || hotelName.isEmpty()) throw new HotelDataException("Hotel name cannot be empty");
   if (!phoneNumber.matches("\\d{10}")) throw new HotelDataException("Phone number must be 10 digits");
   if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HotelDataException("Invalid email format");
   
   this.hotelName = hotelName;
   this.address = address;
   this.phoneNumber = phoneNumber;
   this.email = email;
}

public String getHotelName() { return hotelName; }
public String getAddress() { return address; }
public String getPhoneNumber() { return phoneNumber; }
public String getEmail() { return email; }

@Override
public String toString() {
   return super.toString() + ", Hotel: " + hotelName + ", Address: " + address + 
          ", Phone: " + phoneNumber + ", Email: " + email;
}
}