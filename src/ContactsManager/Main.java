package ContactsManager;

import java.nio.file.Path;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Path newPath = FileHelper.tryMakeFileDirectory();

        List<Contact> contactsToWrite = FileHelper.tryReadFile(newPath);
        assert contactsToWrite != null;
        contactsToWrite = new ArrayList<>(contactsToWrite);
        ContactOutput.mainMenu(contactsToWrite);

        FileHelper.tryWriteFile(newPath, contactsToWrite);
    }
}