package ContactsManager;

import java.util.List;
import static ContactsManager.Main.sc;

public class SearchContact{

    public static void searchContacts(List<Contact> contacts) {

        String userInputFirstName;
        //String userInputLastName;
        System.out.print("Enter a First Name: ");
        userInputFirstName = sc.nextLine();
//        System.out.print("Enter a Last Name: ");
//        userInputLastName = sc.nextLine();
        for (Contact contact : contacts) {
            if ((userInputFirstName /*+ userInputLastName*/).equals(contact.getName())) {
                System.out.println(contact.getName() + "  ||  " + contact.getPhoneNum());
                System.out.println();
                ContactOutput.editOrDelete(contacts);
            } else {  //TODO: FIX THE REPEATED SOUT PER NAME ITERATE (I.E. 3 Names in contact list = 3 souts)
                System.out.println("That name was not found. Please search a new name");
                searchContacts(contacts);
            }
        }
    }
}
