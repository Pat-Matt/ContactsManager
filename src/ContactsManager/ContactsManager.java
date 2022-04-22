package ContactsManager;

import java.util.ArrayList;
import java.util.List;

/*import static ContactsManager.Contact.getContacts;*/

public class ContactsManager {

    static List<Contact> myContacts = new ArrayList<>();
    int contactsCount;

    public static void setContacts() {
        Contact james = new Contact("James", "123-456-7890");
        myContacts.add(james);
    }

    public static List<Contact> getContacts() {
        return myContacts;
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

