package ContactsManager;

import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ContactOutput.mainMenu();

        Path newPath = FileHelper.tryMakeFileDirectory();

        List<Contact> contactsToWrite = new ArrayList<>();
        contactsToWrite.add(new Contact("Matt", "313"));
        contactsToWrite.add(new Contact("Pat", "123"));
        FileHelper.tryWriteFile(newPath, contactsToWrite);

        HashMap<String, Contact> contactMap = new HashMap<>();
        for(Contact contact : Objects.requireNonNull(FileHelper.tryReadFile(newPath))){
            contactMap.put(contact.getName(), contact);
        }

        for (Map.Entry<String, Contact> contactee: contactMap.entrySet()){
            //System.out.println(contactee.getKey());
            System.out.println(contactee.getValue().getName() + " || " + contactee.getValue().getPhoneNum());
        }
/*        Contact mike = new Contact("Mike", "1234567");
        System.out.print(mike.getName());
        System.out.print(" || ");
        System.out.print(mike.getPhoneNum() + "\n");*/
    }
}