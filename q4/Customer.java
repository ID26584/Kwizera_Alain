package Alain_26584.q4;

import com.hotel.reservation.HotelDataException;
import com.hotel.reservation.Room;

//Customer Class
class Customer extends Room {
private String customerName;
private String customerEmail;
private String contactNumber;

public Customer(int id, String createdDate, String updatedDate, String hotelName,
              String address, String phoneNumber, String email, String roomNumber,
              String roomType, double pricePerNight, String customerName,
              String customerEmail, String contactNumber) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight);
   
   if (!customerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) throw new HotelDataException("Invalid customer email format");
   if (!contactNumber.matches("\\d{10}")) throw new HotelDataException("Contact number must be 10 digits");
   
   this.customerName = customerName;
   this.customerEmail = customerEmail;
   this.contactNumber = contactNumber;
}

public String getCustomerName() { return customerName; }
public String getCustomerEmail() { return customerEmail; }
public String getContactNumber() { return contactNumber; }

@Override
public String toString() {
   return super.toString() + ", Customer: " + customerName + ", Email: " + customerEmail + 
          ", Contact: " + contactNumber;
}
}