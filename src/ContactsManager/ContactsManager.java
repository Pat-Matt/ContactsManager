package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Path.*;
import static java.nio.file.Paths.get;

/*import static ContactsManager.Contact.getContacts;*/

public class ContactsManager {
    //Files
    private String filename;
    private String directory;
    private List<String> fileData;
    private Path directoryPath;
    private Path filePath;

    //Constructor
    public ContactsManager(String filename, String directory) {
        this.filename = filename;
        this.directory = directory;

        //directory & file paths
        this.directoryPath = get(directory);
        this.filePath = get(directory, filename);
        this.fileData = getFileData();
    }

    //Gets
    private String getFilename() {
        return filename;
    }

    private String getDirectory() {
        return directory;
    }

    private List<String> getFileData() {
        return fileData;
    }

    private Path getFilePath() {
        return filePath;
    }

    static List<Contact> contactsList = new ArrayList<>();
    //static String contacts = new ArrayList<>();

    public static void setContacts() {
//        Contact[] newContact = ;
//        for (int i = 0; i < newContact.length; i++) {
//            newContact = new Contact[0];
//            contactsList.add(newContact[i]);
//        }

        Contact james = new Contact("James", "123-456-7890");
        contactsList.add(james);
    }

    public static List<Contact> getContacts() {
        return contactsList;
    }
}



//    public static String printContactInfo() {
//        for (int i = 0, i < contact.length, i++) {
//            String nameVar = "Pat"; //Link to addContact name
//            int phoneVar = 1;
//            contact personName = new contact(nameVar, phoneVar);
//            System.out.print(personName.getName());
//            System.out.print(" || ");
//            System.out.print(personName.getPhoneNum() + "\n");
//        }
//    }

