package ContactsManager;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {

    static List<Contact> contactsList = new ArrayList<>();

    public static void setContacts(String name, String phone) {
        Contact userName = new Contact(name, phone);
        contactsList.add(userName);
    }

    public static List<Contact> getContacts() {
        return contactsList;
    }
}

