package com.user;

public class User {
	private int userId;
	private String userName;
	private double balance;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setPrice(double price) {
		this.balance = price;
	}
	public User(int userId, String userName, double price) {
		this.userId = userId;
		this.userName = userName;
		this.balance = price;
	}
	public void deductBalance(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			throw new IllegalArgumentException("Insufficient balance!");
		}
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", balance=" + balance + "]";
	}
	public void addBalance(double amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			throw new IllegalArgumentException("Amount must be greater than Zero!");
			
		}
		this.balance+=amount;
	}
	
	
	
}