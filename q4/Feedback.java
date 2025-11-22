package Alain_26584.q4;

import com.hotel.reservation.Bill;
import com.hotel.reservation.HotelDataException;

//Feedback Class
class Feedback extends Bill {
private int rating;
private String comments;

public Feedback(int id, String createdDate, String updatedDate, String hotelName,
              String address, String phoneNumber, String email, String roomNumber,
              String roomType, double pricePerNight, String customerName,
              String customerEmail, String contactNumber, String bookingDate,
              String checkInDate, String checkOutDate, String serviceName,
              double serviceCost, String paymentMethod, String paymentDate,
              int numberOfNights, int rating, String comments) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
         bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
         paymentMethod, paymentDate, numberOfNights);
   
   if (rating < 1 || rating > 5) throw new HotelDataException("Rating must be between 1 and 5");
   
   this.rating = rating;
   this.comments = comments;
}

public int getRating() { return rating; }
public String getComments() { return comments; }

@Override
public String toString() {
   return super.toString() + ", Rating: " + rating + "/5, Comments: " + comments;
}
}