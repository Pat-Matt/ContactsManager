package ContactsManager;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {

    public void deleteLine(Path filePath, String delString, List<Contact> contacts) {
        Scanner sc = new Scanner(System.in); //break this out and do it once. can go in main or
        //contact output // .  only place scanner needed
        //find way to put this in one method since we are doing it multiple times.  take this loop.
        System.out.print("Enter a First Name: ");
        String userInputFirstName = sc.nextLine();
        System.out.print("Enter a Last Name: ");
        String userInputLastName = sc.nextLine();

        for (Contact contact : ContactsManager.getContacts()) {
            //once u find it, delete it.
            if (!(userInputFirstName + userInputLastName).equals(contact.getName())) {
                //kill userinput , just find and delete.
                userInput = true;
            } else {
                userInput = false;
                System.out.println("That name already exists. Please input a new name"); // DO you want to edit?
                //Can show the name and number of the current contact
            }
        }
    }
}