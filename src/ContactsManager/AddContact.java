package ContactsManager;

import java.util.List;
import static ContactsManager.Main.sc;

public class AddContact {
    public static void addContact(List<Contact> contacts) {
        boolean userAddingContact = true;
        do {
            boolean userInput = true;
            String userInputFirstName;
            //String userInputLastName;
            do {
                System.out.print("Enter a First Name: ");
                userInputFirstName = sc.nextLine();
                //System.out.print("Enter a Last Name: ");
                //userInputLastName = sc.nextLine();
                for (Contact contact : contacts) {
                    if (!(userInputFirstName /*+ userInputLastName*/).equals(contact.getName())) {
                        userInput = true;
                    } else {
                        userInput = false;
                        System.out.println("That name already exists. Please input a new name"); // DO you want to edit?
                    }
                }
                System.out.printf("You entered %s%n", userInputFirstName); //, userInputLastName);
            } while (!userInput);
            String userInputPhoneNumber;
            do {
                System.out.print("Enter a phone number: ");
                userInputPhoneNumber = sc.nextLine();
                for (Contact contact : contacts) {
                    if (!(userInputPhoneNumber).equals(contact.getPhoneNum())) {
                        userInput = true;
                    } else {
                        userInput = false;
                        System.out.println("That phone number already exists. Please try again");
                    }
                }
                if (userInputPhoneNumber.equals("^\\d{10}$")) {
                    userInputPhoneNumber = userInputPhoneNumber.replaceFirst("...", "($0) ");
                    userInputPhoneNumber = userInputPhoneNumber.replaceFirst(".........", "$0-");
                } else {
                    userInputPhoneNumber = userInputPhoneNumber.replaceFirst("...", "$0-");
                }
                System.out.printf("You entered %s%n", userInputPhoneNumber);
            } while (!userInput);
            // Boolean method
            Contact contactToAdd = new Contact(userInputFirstName, userInputPhoneNumber);
            contacts.add(contactToAdd);
            System.out.println("Contact successfully added, Do you want to add another contact (y/n): ");
            String userWantsToContinue = sc.nextLine();

            if (!userWantsToContinue.equalsIgnoreCase("y")) {
                userAddingContact = false;
                System.out.println();
            }
        } while (userAddingContact);
    } //TODO: If else loop for the whole method to confirm that the contact was successfully added

//    public static boolean continueAdding() {
//
//    }
}


