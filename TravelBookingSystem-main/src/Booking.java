package com.booking;


import com.destination.Destination;
import com.user.User;

public class Booking {
	private int bookingId;
	private User userName;
	private Destination destination;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public User getUserName() {
		return userName;
	}
	public void setUserName(User userName) {
		this.userName = userName;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public Booking(int bookingId, User user, Destination destination) {
	
		this.bookingId = bookingId;
		this.userName = user;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Booking " +  destination ;
	}
	
}