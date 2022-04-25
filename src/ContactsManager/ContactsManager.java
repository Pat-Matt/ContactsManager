package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
        this.directoryPath = Paths.get(directory);
        this.filePath = Path.get(directory, filename);
        this.fileData = getFile();
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

    static List<Contact> myContacts = new ArrayList<>();
    int contactsCount;

    public static void setContacts() {
        Contact james = new Contact("James", "123-456-7890");
        myContacts.add(james);
    }

    public static List<Contact> getContacts() {
        return myContacts;
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

