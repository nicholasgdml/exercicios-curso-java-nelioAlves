package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rentNumber;
		
		System.out.print("How many rooms will be rented: ");
		rentNumber = sc.nextInt();
		sc.nextLine();
		
		Rent[] rents = new Rent[10];
		
		for (int i = 0; i < rentNumber; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			rents[roomNumber] = new Rent(name, email);
			sc.nextLine();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < rents.length; i++) {
			if (rents[i] != null) {
				System.out.println(i + ": " + rents[i].toString());
			}
		}
		
		sc.close();
	}

}
