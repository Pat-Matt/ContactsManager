package ContactsManager;

import static ContactsManager.Main.sc;

public class SearchContact{

    public static void searchContacts() {

        boolean userInput = true;
        String userInputFirstName;
        //String userInputLastName;
        do {
            System.out.print("Enter a First Name: ");
            userInputFirstName = sc.nextLine();
//            System.out.print("Enter a Last Name: ");
//            userInputLastName = sc.nextLine();
            for (Contact contact : ContactsManager.getContacts()) {
                if ((userInputFirstName /*+ userInputLastName*/).equals(contact.getName())) {
                    System.out.println(contact.getName() + "  ||  " + contact.getPhoneNum());
                    System.out.println();
                    ContactOutput.editOrDelete();
                    userInput = true;

                } else {
                    System.out.println("That name was not found. Please search a new name");
                    userInput = false;
                }
            }
        } while (!userInput);
    }
}
