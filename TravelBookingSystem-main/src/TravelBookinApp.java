package com.Travel;

import java.util.Scanner;

import com.booking.Booking;
import com.booking.BookingService;
import com.destination.Destination;
import com.destination.DestinationService;
import com.user.User;

public class TravelBookinApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DestinationService destinationService=new DestinationService();
		BookingService bookingService=new BookingService();
		
		System.out.println("Welcome to Travel Booking System...");
		System.out.println("Enter Your Name: ");
		String userName=sc.nextLine();
		
		System.out.println("Enter your IntialBalance");
		double userBalance=sc.nextDouble();
		
		User user=new User(1,userName,userBalance);
		System.out.println("Hello, "+user.getUserName()+"! Your account has been Created with a balance "+user.getBalance());
		
		
		while(true) {
			System.out.println("\n====Travel Booking System====");
			System.out.println("1. View Destinations");
            System.out.println("2. Book a Trip");
            System.out.println("3. View Bookings");
            System.out.println("4. Check Balance");
            System.out.println("5. Add Balance ");
            System.out.println("6. Ratings");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	 System.out.println("\nAvailable Destinations:");
                 destinationService.getAllDestinations().forEach(System.out::println);
                 break;
            case 2:
                System.out.println("\nEnter the Destination ID you want to book: ");
                int destId = sc.nextInt();
                try {
                    Destination selectedDestination = destinationService.getDestinationById(destId);
                    Booking booking = bookingService.bookTrip(user, selectedDestination);
                    System.out.println("Booking Successful: " + booking);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("\nYour Bookings:");
                if (bookingService.getAllBookings().isEmpty()) {
                    System.out.println("You have no bookings yet.");
                } else {
                    bookingService.getAllBookings().forEach(System.out::println);
                }
                break;
            case 4:
            	System.out.println("\nCheck Balance: "+user.getBalance());
            	break;
            case 5:
            	System.out.println("\nAdd Amount to your account: ");
            	double amount=sc.nextDouble();
            	if(amount>0) {
            		user.addBalance(amount);
            		System.out.println("Amount added Successfully! New Balance"+user.getBalance());
            	}else {
            		System.err.println("Amount Should be greater than zero!");
            	}
                break;
            case 6:
            	System.out.println("Give your Ratings: ");
            	int rate=sc.nextInt();
            	if(rate>=1 && rate <=5) {
            		System.out.println("Thank for your rating");
            	}else {
            		System.err.println("Rating should be in range 1 to 5");
            	}
                break;
            	
            	
            case 7:
               
                System.out.println("Thank you for using Travel Booking System!");
                sc.close();
                return;

            default:
                System.err.println("Invalid choice! Please try again.");
            }
            
		}
	}
}