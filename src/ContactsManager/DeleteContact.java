package ContactsManager;

import java.util.*;
import static ContactsManager.Main.sc;

public class DeleteContact {

    public static void deleteLine(List<Contact> contacts) {
        //find way to put this in one method since we are doing it multiple times.  take this loop.
        System.out.print("Enter a First Name: ");
        String userInputFirstName = sc.nextLine();
        List <Contact> contactToRemove = new ArrayList<>();
        for (Contact contact : contacts) { //Needs to be a for I LOOP
            //for(int contact = 0; contact.length)
            if ((userInputFirstName /*+ userInputLastName*/).equals(contact.getName())) {
                System.out.println(contact.getName() + "  ||  " + contact.getPhoneNum());
                contactToRemove.add(contact);
            } else {
                System.out.println("That name does not exist. Please input a new name");
            }
        }
        contacts.removeAll(contactToRemove);
    }
}