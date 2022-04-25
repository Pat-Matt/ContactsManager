package ContactsManager;

import java.util.Scanner;

public class AddContact {
    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        boolean userAddingContact = true;
        do {
            boolean userInput = true;
            String userInputFirstName;
            String userInputLastName;
            do {
                System.out.print("Enter a First Name: ");
                userInputFirstName = sc.nextLine();
                System.out.println("Enter a Last Name: ");
                userInputLastName = sc.nextLine();
                for (Contact contact : ContactsManager.getContacts()) {
                    if (!(userInputFirstName + userInputLastName).equals(contact.getName())) {
                        System.out.printf("You entered %s %s%n", userInputFirstName, userInputLastName);
                        userInput = true;
                    } else {
                        userInput = false;
                        System.out.println("That name already exists. Please input a new name");
                    }
                }
            } while (!userInput);
            String userInputPhoneNumber;
            do {
                System.out.println("Enter a phone number: ");
                userInputPhoneNumber = sc.nextLine();
                for (Contact contact : ContactsManager.getContacts()) {
                    if (!(userInputPhoneNumber).equals(contact.getPhoneNum())) {
                        System.out.printf("You entered %s%n", userInputPhoneNumber);
                        userInput = true;
                    } else {
                        userInput = false;
                        System.out.println("That phone number already exists. Please try again");
                    }
                }
            } while (!userInput);
            ContactsManager.setContacts(); // userInputFirstName, userInputPhoneNumber
            System.out.println("Contact successfully added, Do you want to add another contact (y/n): ");
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


