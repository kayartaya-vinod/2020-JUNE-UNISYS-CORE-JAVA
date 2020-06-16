package com.unisys.app;

import java.util.List;

import com.unisys.entity.Contact;
import com.unisys.service.ContactsService;
import com.unisys.service.ServiceException;
import com.unisys.utils.KeyboardUtil;

public class Main {

	public void start() {
		int choice;

		while ((choice = menu()) != 0) {

			switch (choice) {
			case 1:
				acceptAndAddContactDetails();
				break;
			case 2:
				printAllContacts();
				break;
			}
		}
		
		System.out.println("Thank you!");
	}

	private void acceptAndAddContactDetails() {
		try {
			System.out.println("Enter the details for adding a new contact:");
			String firstname = KeyboardUtil.getString("Firstname: ");
			String lastname = KeyboardUtil.getString("lastname: ");
			String email = KeyboardUtil.getString("email: ");
			String phone = KeyboardUtil.getString("phone: ");
			String city = KeyboardUtil.getString("city: ");
			
			ContactsService service = new ContactsService();
			service.addNewContact(firstname, lastname, email, phone, city);
			System.out.println("New contact added successfully!");
			
		} catch (Exception e) {
			System.out.println("There was an error!");
			System.out.println(e.getMessage()); // root cause
		}
	}

	private void printAllContacts() {
		try {
			ContactsService service = new ContactsService();
			List<Contact> list = service.getAllContacts();
			
			System.out.println("\n");
			System.out.printf("%-20s %-20s %-30s %-15s %-15s\n", "Firstname", "Lastname", "Email id", "Phone#", "City");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			for(Contact c: list) {
				System.out.printf("%-20s %-20s %-30s %-15s %-15s\n", 
						c.getFirstname(), c.getLastname(), c.getEmail(), c.getPhone(), c.getCity());
			}
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
		} catch (ServiceException e) {
			System.out.println("There was an error!");
			System.out.println(e.getMessage()); // root cause
		}
	}

	private int menu() {
		int choice = -1;

		do {
			try {

				System.out.println("1. Add new contact");
				System.out.println("2. Get all contacts");
				choice = KeyboardUtil.getInt("Enter your choice (0 to exit): ");

				if (choice < 0 || choice > 2) {
					System.out.println("Invalid choice, please enter a number with in the given options");
				}

			} catch (Exception e) {
				System.out.println("Invalid choice, please enter a number with in the given options");
				choice = -1;
			}
		} while (choice < 0 || choice > 2);
		return choice;
	}

	public static void main(String[] args) {
		new Main().start();
	}

}
