package com.destination;

public class Destination {
	private int DestinationId;
	private String Destination;
	private double price;
	public int getUserId() {
		return DestinationId;
	}
	public void setUserId(int userId) {
		this.DestinationId = userId;
	}
	public String getUserName() {
		return Destination;
	}
	public void setUserName(String userName) {
		this.Destination = userName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Destination(int userId, String userName, double price) {
		
		this.DestinationId = userId;
		this.Destination = userName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nDestination [DestinationId=" + DestinationId + ", DestinationName=" + Destination + ", Price=" + price + "]";
	}
	
	
}