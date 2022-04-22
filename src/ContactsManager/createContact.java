package ContactsManager;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createContact {private static Path contacts(){
    String directory = "contactsManager";
    String filename = "contacts.txt";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);

    try {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        return dataFile;
    } catch (IOException ex){
        System.out.println(ex.getMessage());
    }
    return null;
}
}
