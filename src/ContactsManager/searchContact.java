package ContactsManager;
import java

public class searchContact {
    Contact searchContact(String getName){
        for(int i=0; i< contactsCount; i++){
            if(myContacts[i].name.equals(searchName)){
                return myContacts[i];
            }
        }
        return null;
    }
}
