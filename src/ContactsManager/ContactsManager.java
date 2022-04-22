package ContactsManager;

import java.util.ArrayList;
import java.util.List;

import static ContactsManager.Contact.getContacts;


public class ContactsManager {
    public static void main(String[] args) {
        Contact mike = new Contact("Mike", "1234567");
        System.out.print(mike.getName());
        System.out.print(" || ");
        System.out.print(mike.getPhoneNum() + "\n");

        getContacts(contacts);
        //create  method that creates .txt contacts


//Load all of the contacts by calling a method that returns a List of Contact objects.

        //Show all your contacts
        //Add a new contact
       // Search a contact by her name
       // Delete an existing contact

    }

//    public static String printContactInfo() {
//        for (int i = 0, i < contact.length, i++) {
//            String nameVar = "Pat"; //Link to addContact name
//            int phoneVar = 1;
//            contact personName = new contact(nameVar, phoneVar);
//            System.out.print(personName.getName());
//            System.out.print(" || ");
//            System.out.print(personName.getPhoneNum() + "\n");
//        }
//    }



}
