package ContactsManager;

import java.util.HashMap;

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

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

//    private HashMap h = null;
////instantiate hashmap in the constructor
//    public ...
//    //add value to hashmap
//    public void add(Object value)
//    {
//        h.put(value);//eventually cast value or declare it as you did it in the hashmap
//    }
//
//    //get hashmap
//    public HashMap getMap()
//    {
//        return h;
//    }
//
//    //set hashmap
//    public void setMap(HashMap hm)
//    {
//        h=hm;
//    }...
//}
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



