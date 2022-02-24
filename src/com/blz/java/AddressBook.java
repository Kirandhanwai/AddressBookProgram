package com.blz.java;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {
		public static void main(String[]Args) {
			ArrayList<Contact> array = new ArrayList<Contact>();
			try (Scanner sc = new Scanner(System.in)) {
				try (Scanner sc1 = new Scanner(System.in)) {
					int choice;
					do {
						System.out.println("1.Adding New Contact");
						System.out.println("2.Check Added Contact");
						System.out.println("Enter your choice");
						choice = sc.nextInt();

						switch (choice) {
						case 1:
							System.out.print("Enter First Name: ");
							String firstName = sc1.nextLine();
							System.out.print("Enter last Name: ");
							String lastName = sc1.nextLine();
							System.out.print("Enter your address: ");
							String address = sc1.nextLine();
							System.out.print("Enter your city: ");
							String city = sc1.nextLine();
							System.out.print("Enter your state: ");
							String state = sc1.nextLine();
							System.out.print("Enter zip code : ");
							int zipcode = sc.nextInt();
							System.out.print("Enter phone number: ");
							String phoneNo = sc1.nextLine();
							System.out.print("Enter your email: ");
							String email = sc1.nextLine();
							Contact contact = new Contact(firstName, lastName, address, city, zipcode, state, phoneNo,
									email);
							array.add(contact);
							break;
						case 2:
							System.out.println(array);
							break;
						}
					} while (choice != 0);
					System.out.println("Invalid Choice!!!");
				}
			}
		}

}
