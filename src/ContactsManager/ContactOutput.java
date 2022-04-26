package ContactsManager;

import java.util.List;
import static ContactsManager.Main.sc;

public class ContactOutput {

    public static void mainMenu(List <Contact> contacts) {
        int userChoice = -1;
        while (userChoice != 5) {
            System.out.println("1. View Contacts");
            System.out.println("2. Add a new contact");
            System.out.println("3. Search a contact by name");
            System.out.println("4. Delete an existing contact");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            userChoice = Integer.parseInt(sc.nextLine());

            //TODO: Switch Case
            if (userChoice == 1) {
                printContactList(contacts);
                System.out.println();
            } else if (userChoice == 2) {
                AddContact.addContact(contacts);
                System.out.println();
            } else if (userChoice == 3) {
                SearchContact.searchContacts(contacts);
                //System.out.println("You do not have clearance to view the contact list");
                System.out.println();
            } else if (userChoice == 4) {
                DeleteContact.deleteLine(contacts);
                //System.out.println("You are not authorized!!");
                System.out.println();
            } else if (userChoice == 5) {
                System.out.println("GoodBye");
                System.out.println();
            } else {
                System.out.println("Please enter a valid selection");
                System.out.println();
            }
        } //Add a try catch for an input that is not an integer
    }

    public static void printContactList(List <Contact> myContacts) {
        System.out.println("Contact Name  ||  Phone Number");
        System.out.println("------------------------------");

        for(Contact contact : myContacts){
            System.out.println(contact.getName() + "  ||  " + contact.getPhoneNum());
        }
    }

    public static void editOrDelete(List <Contact> contacts) {
        System.out.println("What would you like to do with this contact?");

        int userChoice = -1;
        while (userChoice != 3) {
            System.out.println("1. Edit contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Return to Main Menu");
            System.out.println();
            System.out.println("Enter an option (1, 2 or 3): ");
            userChoice = Integer.parseInt(sc.nextLine());

            if (userChoice == 1) {
                System.out.println("You do not have clearance to edit the contact list");
                System.out.println();
            } else if (userChoice == 2) {
                DeleteContact.deleteLine(contacts);
                System.out.println();
            } else if (userChoice == 3) {
                System.out.println("See you on the flip side");
                System.out.println();
                mainMenu(contacts);
            } else {
                editOrDelete(contacts);
            }
        }
    }
}