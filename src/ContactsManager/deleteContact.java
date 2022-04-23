package ContactsManager;

public List<String> deleteLine(String delString){
        for(String line:fileData){
        if(line.equals(delString)){
        System.out.println("Found contact to delete...");
        fileData.remove(delString);
        writeFile();
        System.out.println("Deleted Contact: "+
        delString,substring(0,delString.indexOf("|")));
        System.out.println("\n<------------------------------->\n");
        return fileData;
        }
        }
        System.out.println("Error, unable to Delete.");
        System.out.println("\n<-------------------------------\n");
        return fileData;
        }
