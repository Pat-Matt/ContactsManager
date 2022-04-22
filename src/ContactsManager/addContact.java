package ContactsManager;

import java.util.Scanner;

import static ContactsManager.ContactsManager.myContacts;

public class addContact {
    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        boolean userAddingContact = true;
        do {
            sc.nextLine();
            System.out.print("Enter a First Name: ");
            String userInputFirstName = sc.nextLine();
            System.out.println("Enter a Last Name: ");
            String userInputLastName = sc.nextLine();
            if (!(userInputFirstName + userInputLastName).equals(myContacts.name)) {
                System.out.printf("You entered %s %s%n", userInputFirstName, userInputLastName);
            } else {
                System.out.println("That name already exists. Please input a new name");
            }
            System.out.println("Enter a phone number: ");
            String userInputPhoneNumber = sc.nextLine();
            if (!(userInputPhoneNumber).equals(myContacts.phoneNum)) {
                System.out.printf("You entered %s%n", userInputPhoneNumber);
            } else {
                System.out.println("That phone number already exists. Please try again");
            }
            System.out.println("Do you want to add another contact (y/n): ");
            String userWantsToContinue = sc.next();

            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userAddingContact = false;
            }
        } while (userAddingContact);
    } //TODO: If else loop for the whole method to confirm that the contact was successfully added


//    public static void setContacts() {
//        Contact james = new Contact("James", "123-456-7890");
//        myContacts.add(james);
}


