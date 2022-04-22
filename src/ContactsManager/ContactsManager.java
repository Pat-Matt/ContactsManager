package ContactsManager;

import java.util.ArrayList;
import java.util.List;

/*import static ContactsManager.Contact.getContacts;*/

public class ContactsManager {
    //create  method that creates .txt contacts

//Load all of the contacts by calling a method that returns a List of Contact objects.

    //Show all your contacts
    //Add a new contact
    // Search a contact by her name
    // Delete an existing contact

//    }

    Contact [] myContacts;
    int contactsCount;

    //Constructor:
    public ContactsManager() {
        this.contactsCount = 0;
        this.myContacts = new Contact[20];
    }
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

