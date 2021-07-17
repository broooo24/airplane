package Y;

import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {

//		Airline reservation system
//		
//		Reservation and cancellation of the airline tickets.
//		Automation of airline system functions.
//		Perform transaction management and routing functions.
//		Offer quick responses to customers.
//		Maintain passenger records and report on the daily business transactions.

		Flights pecsToBudapest = new Flights(500, "Pécs", "Budapest");
		Flights pecsToLondon = new Flights(3100, "Pécs", "London");
		Flights budapestToLondon = new Flights(1100, "Budapest", "London");
		Flights budapestToParis = new Flights(2300, "Budapest", "Paris");
		Flights londonToParis = new Flights(1200, "London", "Paris");

		Scanner sc = new Scanner(System.in);
		System.out.println("starting place:");
		String from = sc.next();
		System.out.println("Where do you want to go?");
		String to = sc.next();

		if (pecsToBudapest.from.toUpperCase().equals(from.toUpperCase())
				&& (pecsToBudapest.to.toUpperCase().equals(to.toUpperCase()))) {
			System.out.println(pecsToBudapest.price);
		} else if (pecsToLondon.from.toUpperCase().equals(from.toUpperCase())
				&& (pecsToLondon.to.toUpperCase().equals(to.toUpperCase()))) {
			System.out.println(pecsToLondon.price);
		}else if (budapestToLondon.from.toUpperCase().equals(from.toUpperCase())
				&& (budapestToLondon.to.toUpperCase().equals(to.toUpperCase()))) {
			System.out.println(budapestToLondon.price);
		}else if (budapestToParis.from.toUpperCase().equals(from.toUpperCase())
				&& (budapestToParis.to.toUpperCase().equals(to.toUpperCase()))) {
			System.out.println(budapestToParis.price);
		}else if (londonToParis.from.toUpperCase().equals(from.toUpperCase())
				&& (londonToParis.to.toUpperCase().equals(to.toUpperCase()))) {
			System.out.println(londonToParis.price);
		}

	}
}
