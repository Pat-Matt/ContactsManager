package ContactsManager;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class FileHelper {

    public static Path tryMakeFileDirectory() {
        String Directory = "data";
        String filename = "info.json";

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
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void tryWriteFile(Path filePath, List<Contact> contactsToWrite) {
        try {
            String contactStr = new Gson().toJson(contactsToWrite);
            Files.write(filePath, Stream.of(contactStr).toList());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Contact> tryReadFile(Path filePath) {
        try {
            return Stream
                    .of(new Gson().fromJson(Files.readAllLines(filePath).get(0), Contact[].class))
                    .toList();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}

