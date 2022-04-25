package ContactsManager;

import java.util.List;
import java.util.Scanner;

public class ContactOutput {

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);

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


            if (userChoice == 1) {
                printContactList();
                System.out.println();
            } else if (userChoice == 2) {
                AddContact.addContact();
                System.out.println();

            } else if (userChoice == 3) {
                System.out.println("You do not have clearance to view the contact list");
                System.out.println();
            } else if (userChoice == 4) {
                System.out.println("You are not authorized!!");
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

    public static void printContactList() {
        System.out.println("Contact Name  ||  Phone Number");
        System.out.println("------------------------------");
        // Call contact arr and print names/ phone num
        //ContactsManager.setContacts();
        List<Contact> myContacts = ContactsManager.getContacts();
        for(Contact contact : myContacts){
            System.out.println(contact.getName() + "  ||  " + contact.getPhoneNum());
        }
    }
}