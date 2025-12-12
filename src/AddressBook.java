import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added.");
    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
        }else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}