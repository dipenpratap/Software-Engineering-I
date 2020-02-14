package test1;

import java.util.*;
import java.text.*;

class extend{
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("$##.##");
		Scanner input = new Scanner(System.in);
		double hr = 0.0;
		double days= 0.0;
		int week = 0;
		int menu = 0;
		int time = 0;
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
				System.out.println("Do you want to Extend");
				System.out.println("1. Hour(s)");
				System.out.println("2. Days(s)");
				System.out.println("3. Week(s)");
				do {
					System.out.print("Select your time frame: ");
					time= input.nextInt();
					System.out.println();
					
					switch(time) {
					case 1:
						System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
						hr = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount = (hr) * 2.50;
						System.out.println("CHARGES = " + df.format(amount));
			
					break;
					
					case 2:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						days = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount1 = (days) * 45;
						System.out.println("CHARGES = " + df.format(amount1));
					break;
					
					case 3:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						week = input.nextInt();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount11 = (week) * 150;
						System.out.println("CHARGES = " + df.format(amount11));
					break;
					}
				break;
				}
				while (!quit);
				
			case 2:
				System.out.println("Do you want to Extend");
				System.out.println("1. Hour(s)");
				System.out.println("2. Days(s)");
				System.out.println("3. Week(s)");
				do {
					System.out.print("Select your time frame: ");
					time= input.nextInt();
					System.out.println();
					
					switch(time) {
					case 1:
						System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
						hr = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: CAR");
						double amount = (hr) * 4.50;
						System.out.println("CHARGES = " + df.format(amount));
			
					break;
					
					case 2:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						days = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount1 = (days) * 80;
						System.out.println("CHARGES = " + df.format(amount1));
					break;
					
					case 3:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						week = input.nextInt();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount11 = (week) * 500;
						System.out.println("CHARGES = " + df.format(amount11));
					break;
					}
				break;	
				}
				while (!quit);
				
			case 3:
				System.out.println("Do you want to Extend");
				System.out.println("1. Hour(s)");
				System.out.println("2. Days(s)");
				System.out.println("3. Week(s)");
				do {
					System.out.print("Select your time frame: ");
					time= input.nextInt();
					System.out.println();
					
					switch(time) {
					case 1:
						System.out.print("ENTER THE TOTAL HOURS YOU WANT TO EXTEND YOUR PARKING: ");
						hr = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: BUS");
						double amount = (hr) * 5.50;
						System.out.println("CHARGES = " + df.format(amount));
			
					break;
					
					case 2:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						days = input.nextDouble();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount1 = (days) * 120;
						System.out.println("CHARGES = " + df.format(amount1));
					break;
					
					case 3:
						System.out.print("ENTER THE TOTAL DAYS YOU WANT TO EXTEND YOUR PARKING: ");
						week = input.nextInt();
						System.out.println("============ EXTENDED CHARGES ===============");
						System.out.println("VEHICLE TYPE: TWO WHEELER");
						double amount11 = (week) * 750;
						System.out.println("CHARGES = " + df.format(amount11));
					break;
					}
				break;
				}			
				while (!quit);
				System.out.println(" Thank You for Extending your Time!!");
			case 4:
				quit = true;
				break;
			default:
				System.out.println("INVALID ENTRY!");
			}
			while (!quit);	
			
		}
		while (!quit);
	}
}




				