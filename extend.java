//Pritish Ayer
//This class is for the user to extend their parking time
//The goal is to enable the user to extend the time without having to exit and go through all the process allover again




// This class asks the user for type of vehicle and calculates the parking fare on the basis of:
// 1. Type of vehicle entered during the park class
// 2. Total hours to be extended

// The rate of extended parking is as follows:
/*

TWO WHEELER : $2.50/hr after
CAR 		: $4.50/hr after
BUS 		: $5.50/hr after

*/


import java.util.*;
import java.text.*;

class extended {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$##.##");
		Scanner input = new Scanner(System.in);
		double hr = 0.0;
		int menu = 0;
		System.out.println("EXTEND PARKING CHARGES");
		System.out.println();
		System.out.println("1. TWO WHEELER");
		System.out.println("2. CAR");
		System.out.println("3. BUS");
		System.out.println("4. EXIT");
		boolean quit = false;
		do {
			System.out.print("SELECT YOUR VEHICLE TYPE: ");
			menu = input.nextInt();
			System.out.println();

			switch (menu) {
			case 1:
				System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
				hr = input.nextDouble();

				System.out.println("============ EXTENDED CHARGES ===============");
				System.out.println("VEHICLE TYPE: TWO WHEELER");
					double amount = (hr) * 2.50;
					System.out.println("CHARGES = " + df.format(amount));
		
				break;
				
			case 2:
				System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
				hr = input.nextDouble();

				System.out.println("============ EXTENDED CHARGES ===============");
				System.out.println("VEHICLE TYPE: CAR");

					double amount1 = (hr) * 4.50;
					System.out.println("CHARGES = " + df.format(amount1));

				break;
				
			case 3:
				System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
				hr = input.nextDouble();

				System.out.println("============ EXTENDED CHARGES ===============");
				System.out.println("VEHICLE TYPE: BUS");
					double amount2 = (hr) * 5.50;
					System.out.println("CHARGES = " + df.format(amount2));

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


