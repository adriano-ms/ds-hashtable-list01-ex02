package view;

import java.util.Scanner;

import model.Resident;

public class Gui {
	
	public static int mainMenu(Scanner sc) throws Exception {
		System.out.println("---- Residents Management System ----");
		System.out.println("[1] Register resident");
		System.out.println("[2] Consult resident");
		System.out.println("[3] Delete resident");
		System.out.println("[4] Consult floor");
		System.out.println("[0] Exit");
		System.out.print("> ");
		int option = Integer.parseInt(sc.nextLine().trim());
		return option;
	}
	
	public static Resident registerMenu(Scanner sc) throws Exception {
		Integer apartment = null;
		while (apartment == null) {
			try {
				System.out.print("Apartment: ");
				apartment = Integer.parseInt(sc.nextLine().trim());
				if(apartment < 0 || apartment > 999) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.err.println("Invalid apartment!");
				apartment = null;
			} 
		}
		System.out.print("Resident name:");
		String name = sc.nextLine();
		System.out.print("Resident's car model:");
		String carModel = sc.nextLine();
		System.out.print("Resident's car color:");
		String carColor = sc.nextLine();
		System.out.print("Resident's car plate:");
		String carPlate = sc.nextLine();
		return new Resident(apartment, name, carModel, carColor, carPlate);
	}
	
	public static int consultByApartmentMenu(Scanner sc) {
		System.out.print("Apartment: ");
		Integer apartment = null;
		while (apartment == null) {
			try {
				apartment = Integer.parseInt(sc.nextLine().trim());
				if(apartment < 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.err.println("Invalid apartment!");
				apartment = null;
			} 
		}
		return apartment;
	}
	
	public static int consultFloorMenu(Scanner sc) {
		System.out.print("Floor: ");
		Integer floor = null;
		while (floor == null) {
			try {
				floor = Integer.parseInt(sc.nextLine().trim());
				if(floor < 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.err.println("Invalid floor!");
				floor = null;
			} 
		}
		return floor;
	}

}
