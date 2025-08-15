package com.booking;

import java.util.ArrayList;
import java.util.List;

import com.destination.Destination;
import com.user.User;

public class BookingService {
	private List<Booking> bookings=new ArrayList<>();
	private int bookingCounter=1;
	public Booking bookTrip(User user,Destination destination) {
		if(user.getBalance()<destination.getPrice()) {
			throw new IllegalArgumentException("Insufficient balance to book Ticket!");
		}
		user.deductBalance(destination.getPrice());
        Booking booking = new Booking(bookingCounter++, user, destination);
        bookings.add(booking);
        return booking;
				
			
		}
		
	
	
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return bookings;
	}
}