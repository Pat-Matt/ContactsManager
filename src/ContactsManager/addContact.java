package ContactsManager;

public class addContact {
    public void addContact(Contact contact) {
        contact[contactsCount] = contact;
        contactsCount++;
    }
}

