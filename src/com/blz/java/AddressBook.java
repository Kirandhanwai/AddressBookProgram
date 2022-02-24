package com.blz.java;

import java.util.ArrayList;

import java.util.ListIterator;

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
						System.out.println("3.Edit Added Contact");
						System.out.println("Enter your choice");
						choice = sc.nextInt();

						switch (choice) {
						case 1:
							System.out.print("Enter First Name: ");
							String firstName1 = sc1.nextLine();
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
							Contact contact = new Contact(firstName1, lastName, address, city, zipcode, state, phoneNo,
									email);
							array.add(contact);
							break;
						case 2:
							System.out.println(array);
							break;
						case 3:
							boolean found = false;
							System.out.println("Enter first name of the person for update ");
							firstName1 = sc1.nextLine();

							ListIterator<Contact> listIterator = array.listIterator();

							while (listIterator.hasNext()) {
								contact = listIterator.next();

								if (contact.getFirstName().equals(firstName1)) { // entering the condition if fname matches

									System.out.print("Enter new first Name: ");
									firstName1 = sc1.nextLine();
									System.out.print("Enter new last Name: ");
									lastName = sc1.nextLine();
									System.out.print("Enter your new address: ");
									address = sc1.nextLine();
									System.out.print("Enter your new city: ");
									city = sc1.nextLine();
									System.out.print("Enter your state: ");
									state = sc1.nextLine();
									System.out.print("Enter zip code : ");
									zipcode = sc.nextInt();
									System.out.print("Enter phone number: ");
									phoneNo = sc1.nextLine();
									System.out.print("Enter your Email ID: ");
									email = sc1.nextLine();
									listIterator.set(new Contact(firstName1, lastName, address, city, zipcode, state,
											phoneNo, email));
									found = true;
								}
							}

							if (!found) {
								System.out.println("Record not found");
							} else {
								System.out.println("Record is updated successfully");
							}
							break;
						default:
							System.out.println("default");

						}
					} while (choice != 0);
					System.out.println("Invalid Choice!!");
				}
			}	
		}

}
