
package ContactsManager;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String phoneNum;

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
/*    static List<Contact> getContacts() {

        Contact Matt = new Contact("Matt", "123456789");
        Contact Pat = new Contact("Pat", "456");
        Contact Ry = new Contact("Ry", "789");

        List<Contact> contacts = new ArrayList<>();
        contacts.add(Matt);
        contacts.add(Pat);
        contacts.add(Ry);

        return contacts;
    }*/



