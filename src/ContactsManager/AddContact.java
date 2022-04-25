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
                //TODO: The sout does not print on the first for/ if. But if i want to add a contact, it iterates
                //TODO: +1 for eah time i run the "y" for a new contact
                System.out.print("Enter a First Name: ");
                userInputFirstName = sc.nextLine();
                System.out.print("Enter a Last Name: ");
                userInputLastName = sc.nextLine();
                for (Contact contact : ContactsManager.getContacts()) {
                    if (!(userInputFirstName + userInputLastName).equals(contact.getName())) {
                        userInput = true;
                        System.out.printf("You entered %s %s%n", userInputFirstName, userInputLastName);
                    } else {
                        userInput = false;
                        System.out.println("That name already exists. Please input a new name");
                    }
                }
            } while (!userInput);
            String userInputPhoneNumber;
            do {
                System.out.print("Enter a phone number: ");
                userInputPhoneNumber = sc.nextLine();
                for (Contact contact : ContactsManager.getContacts()) {
                    if (!(userInputPhoneNumber).equals(contact.getPhoneNum())) {
                        userInput = true;
                        System.out.printf("You entered %s%n", userInputPhoneNumber);
                    } else {
                        userInput = false;
                        System.out.println("That phone number already exists. Please try again");
                    }
                }
            } while (!userInput);
            ContactsManager.setContacts(userInputFirstName, userInputPhoneNumber); // userInputFirstName, userInputPhoneNumber
            System.out.println("Contact successfully added, Do you want to add another contact (y/n): ");
            String userWantsToContinue = sc.nextLine();

            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userAddingContact = false;
                System.out.println();
            }
        } while (userAddingContact);
    } //TODO: If else loop for the whole method to confirm that the contact was successfully added


//    public static void setContacts() {
//        Contact james = new Contact("James", "123-456-7890");
//        myContacts.add(james);
}


