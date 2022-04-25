package ContactsManager;

import java.util.Scanner;

public class SearchContact{

    public static void searchContacts() {
        Scanner sc = new Scanner(System.in);
        boolean userInput = true;
        String userInputFirstName;
        String userInputLastName;
        do {
            //TODO: The sout does not print on the first for/ if. But if i want to add a contact, it iterates
            //TODO: +1 for eah time i run the "y" for a new contact
            System.out.print("Enter a First Name: ");
            userInputFirstName = sc.nextLine();
            System.out.print("Enter a Last Name: ");
            userInputLastName = sc.nextLine();
            for (Contact contact : ContactsManager.getContacts()) {
                if (!(userInputFirstName + userInputLastName).equals(contact.getName())) {
                    userInput = true;
                    System.out.printf("You entered %s %s%n", userInputFirstName, userInputLastName);
                } else {
                    userInput = false;
                    System.out.println("That name already exists. Please input a new name");
                }
            }
        } while (!userInput);
    }


//    Contact searchContact(String searchName){
//        for(int i=0; i< contactsCount; i++){
//            if(myContacts[i].getName().equals(searchName)){
//                return myContacts[i];
//            }
//        }
//        return null;
//    }
}
