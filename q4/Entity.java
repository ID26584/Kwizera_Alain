package Alain_26584.q4;

import com.hotel.reservation.HotelDataException;

//Entity Class
class Entity {
private int id;
private String createdDate;
private String updatedDate;

public Entity(int id, String createdDate, String updatedDate) throws HotelDataException {
   if (id <= 0) throw new HotelDataException("ID must be greater than 0");
   if (createdDate == null || createdDate.isEmpty()) throw new HotelDataException("Created date cannot be empty");
   if (updatedDate == null || updatedDate.isEmpty()) throw new HotelDataException("Updated date cannot be empty");
   
   this.id = id;
   this.createdDate = createdDate;
   this.updatedDate = updatedDate;
}

public int getId() { return id; }
public String getCreatedDate() { return createdDate; }
public String getUpdatedDate() { return updatedDate; }

public void setId(int id) throws HotelDataException {
   if (id <= 0) throw new HotelDataException("ID must be greater than 0");
   this.id = id;
}

public void setUpdatedDate(String updatedDate) throws HotelDataException {
   if (updatedDate == null || updatedDate.isEmpty()) throw new HotelDataException("Updated date cannot be empty");
   this.updatedDate = updatedDate;
}

@Override
public String toString() {
   return "ID: " + id + ", Created: " + createdDate + ", Updated: " + updatedDate;
}
}