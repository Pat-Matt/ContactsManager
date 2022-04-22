package ContactsManager;

import java.io.*;

public static class addContact {

    BufferedWriter writer = null;
        try {
        try {
            writer = new BufferedWriter(new FileWriter("contacts.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
  /*      writer.write("Writing to a file.");
        writer.close();*/
    } catch(
    IOException ex)

    {
        ex.printStackTrace();
    }

}
// create method to put name

