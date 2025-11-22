package Alain_26584.q4;

import com.hotel.reservation.Feedback;
import com.hotel.reservation.HotelDataException;

//ReservationRecord Class (Final)
final class ReservationRecord extends Feedback {
public ReservationRecord(int id, String createdDate, String updatedDate, String hotelName,
                       String address, String phoneNumber, String email, String roomNumber,
                       String roomType, double pricePerNight, String customerName,
                       String customerEmail, String contactNumber, String bookingDate,
                       String checkInDate, String checkOutDate, String serviceName,
                       double serviceCost, String paymentMethod, String paymentDate,
                       int numberOfNights, int rating, String comments) throws HotelDataException {
   super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
         roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
         bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
         paymentMethod, paymentDate, numberOfNights, rating, comments);
}

public double generateBill() {
   return getRoomCharge() + getServiceCharge();
}

public void displayReservationDetails() {
   System.out.println("\n=== HOTEL RESERVATION SYSTEM - RESERVATION DETAILS ===");
   System.out.println("Hotel: " + getHotelName());
   System.out.println("Address: " + getAddress());
   System.out.println("Room: " + getRoomNumber() + " (" + getRoomType() + ")");
   System.out.println("Price per Night: $" + getPricePerNight());
   System.out.println("Customer: " + getCustomerName());
   System.out.println("Contact: " + getContactNumber());
   System.out.println("Booking Date: " + getBookingDate());
   System.out.println("Check-in: " + getCheckInDate() + " | Check-out: " + getCheckOutDate());
   System.out.println("Service: " + getServiceName() + " - $" + getServiceCost());
   System.out.println("Payment Method: " + getPaymentMethod());
   System.out.println("Payment Date: " + getPaymentDate());
   
   System.out.println("\n--- Billing Information ---");
   System.out.println("Room Charge: $" + getRoomCharge());
   System.out.println("Service Charge: $" + getServiceCharge());
   System.out.println("Total Bill: $" + generateBill());
   
   System.out.println("\n--- Feedback ---");
   System.out.println("Rating: " + getRating() + "/5");
   System.out.println("Comments: " + getComments());
   System.out.println("=====================================================");
}
}