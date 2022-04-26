package ContactsManager;

import java.util.*;

public class ContactsManager {

    static List<Contact> contactsList = new ArrayList<>();

    public static void setContacts(String name, String phone) {
        Contact userName = new Contact(name, phone);
        contactsList.add(userName);
    }

    public static List<Contact> getContacts() {
        return contactsList;
    }

    public static void theHashMap() {
        HashMap<String, Contact> contactMap = new HashMap<>();
        for (Contact contact : Objects.requireNonNull(FileHelper.tryReadFile(FileHelper.tryMakeFileDirectory()))) {
            contactMap.put(contact.getName(), contact);
        }
        for (Map.Entry<String, Contact> contactee: contactMap.entrySet()){
            System.out.println(contactee.getKey());
            System.out.println(contactee.getValue().getName() + " || " + contactee.getValue().getPhoneNum());
        }
    }
}

