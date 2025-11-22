package Alain_26584.q4;

import com.hotel.reservation.Hotel;
import com.hotel.reservation.HotelDataException;

//Room Class
class Room extends Hotel {
private String roomNumber;
private String roomType;
private double pricePerNight;

public Room(int id, String createdDate, String updatedDate, String hotelName,
          String address, String phoneNumber, String email, String roomNumber,
          String roomType, double pricePerNight) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
   
   if (pricePerNight <= 0) throw new HotelDataException("Price per night must be greater than 0");
   
   this.roomNumber = roomNumber;
   this.roomType = roomType;
   this.pricePerNight = pricePerNight;
}

public String getRoomNumber() { return roomNumber; }
public String getRoomType() { return roomType; }
public double getPricePerNight() { return pricePerNight; }

@Override
public String toString() {
   return super.toString() + ", Room: " + roomNumber + " (" + roomType + "), Price/Night: $" + pricePerNight;
}
}