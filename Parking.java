// This class asks the user for type of vehicle and calculates the parking fare on the basis of:
// 1. Type of vehicle
// 2. Total hours parked

// The rate of parking is as follows:
/*

TWO WHEELER : $0.00/hr first 2 hr $2/hr after that
CAR 		: $1.00/hr first 2 hr $4/hr after 2 hr
BUS 		: $2.00/hr first hr $5/hr after 1 hr

Collaborators please learn git and create a branch before making any changes.

*/


import java.util.*;
import java.text.*;

class Parking {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$##.##");
		Scanner input = new Scanner(System.in);
		double hr = 0.0;
		int menu = 0;
		System.out.println("PARKING CHARGES");
		System.out.println();
		System.out.println("1. TWO WHEELER");
		System.out.println("2. CAR");
		System.out.println("3. TRUCK");
		System.out.println("4. EXIT");
		boolean quit = false;
		do {
			System.out.print("PLEASE ENTER YOUR CHOICE: ");
			menu = input.nextInt();
			System.out.println();

			switch (menu) {
			case 1:
				System.out.print("ENTER THE TOTAL HOURS: ");
				hr = input.nextDouble();

				System.out.println("============ CHARGES ===============");
				System.out.println("VEHICLE TYPE: TWO WHEELER");
				if (hr > 2) {                   // NO CHARGE FOR FIRST TWO HOURS
					double amount = (hr - 2) * 2.00;   // $2/HR AFTERWARDS
					System.out.println("CHARGES = " + df.format(amount));
				} else {
					System.out.println("NO CHARGE! FIRST 2 MINUTES IS FREE");
				}
				break;
			case 2:
				System.out.print("ENTER THE TOTAL HOURS: ");
				hr = input.nextDouble();

				System.out.println("============ CHARGES ===============");
				System.out.println("VEHICLE TYPE: CAR");
				if (hr > 2 {
					double amount = (hr - 2) * 4 + 2.00;
					System.out.println("CHARGES = " + df.format(amount));
				} else {
					double amount = (hr) * 1.00;
					System.out.println("CHARGES= " + df.format(amount));
				}
				break;
			case 3:
				System.out.print("ENTER THE TOTAL HOURS: ");
				hr = input.nextDouble();

				System.out.println("============ CHARGES ===============");
				System.out.println("VEHICLE TYPE: TRUCK");
				if (hr > 1) {
					double amount = (hr - 1) * 5 + 2.00;
					System.out.println("CHARGES = " + df.format(amount));
				} else {
					double amount = (hr) * 2.00;
					System.out.println("CHARGES = " + df.format(amount));
				}
				break;
			case 4:
				quit = true;
				break;
			default:
				System.out.println("INVALID ENTRY!");
			}
		}

		while (!quit);
	}
}



