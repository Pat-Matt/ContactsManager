package ContactsManager;

//import static ContactsManager.ContactsManager.getFileData;();

//public class deleteContact {
//
//    // Write
//    public boolean writeFile() {
//        try {
//            Files.write(filePath, fileData);
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + filename);
//            return false;
//        }
//        return true;
//    }
//
//    public List<String> deleteLine(String delString) {
//        for (String line : getFileData()) {
//            if (line.equals(delString)) {
//                System.out.println("Found contact to delete...");
//                fileData.remove(delString);
//                writeFile();
//                System.out.println("Deleted Contact: " +
//                        delString, substring(0, delString.indexOf("|")));
//                System.out.println("\n<------------------------------->\n");
//                return fileData;
//            }
//        }
//        System.out.println("Error, unable to Delete.");
//        System.out.println("\n<-------------------------------\n");
//        return fileData;
//    }
//}