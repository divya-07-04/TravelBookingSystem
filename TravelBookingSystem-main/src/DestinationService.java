package com.destination;

import java.util.ArrayList;
import java.util.List;

public class DestinationService {
	private List<Destination> destinations=new ArrayList<>();
	
	public DestinationService() {
		destinations.add(new Destination(1,"Delhi",5400));
		destinations.add(new Destination(2,"Kashmir",7200));
		destinations.add(new Destination(3,"Manali",3700));
		destinations.add(new Destination(4,"Amritsar",1200));
		destinations.add(new Destination(5,"Hyderabad",6500));
		destinations.add(new Destination(6,"Chennai",7500));
		destinations.add(new Destination(7,"Banglore",8000));
		destinations.add(new Destination(8,"Vizag",9000));
		destinations.add(new Destination(9,"Goa",6800));
		destinations.add(new Destination(10,"Srinagar",3500));
	}
	public List<Destination>getAllDestinations(){
		return destinations;
	}
	
	public Destination getDestinationById(int id) {
		return destinations.stream()
				.filter(dest->dest.getUserId()==id)
				.findFirst()
				.orElseThrow(()->new IllegalArgumentException("Destination not Found!"));
				
				
	}
	
}