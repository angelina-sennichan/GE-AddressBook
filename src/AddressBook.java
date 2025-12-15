import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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

    public void editContact() {
        System.out.print("Enter the First Name of the contact to edit: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                found = true;
                boolean running = true;

                while (running) {
                    System.out.println("What do you want to edit?");
                    System.out.println("1. First Name");
                    System.out.println("2. Last Name");
                    System.out.println("3. Phone Number");
                    System.out.println("4. Email");
                    System.out.println("5. Address");
                    System.out.println("6. City");
                    System.out.println("7. State");
                    System.out.println("8. Zip Code");
                    System.out.println("9. Exit edit options");
                    System.out.print("Enter choice: ");

                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter new First Name: ");
                            contact.setFirstName(sc.nextLine());
                            break;
                        case 2:
                            System.out.print("Enter new Last Name: ");
                            contact.setLastName(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter new Phone Number: ");
                            contact.setPhoneNumber(sc.nextLine());
                            break;
                        case 4:
                            System.out.print("Enter new Email: ");
                            contact.setEmail(sc.nextLine());
                            break;
                        case 5:
                            System.out.print("Enter new Address: ");
                            contact.setAddress(sc.nextLine());
                            break;
                        case 6:
                            System.out.print("Enter new City: ");
                            contact.setCity(sc.nextLine());
                            break;
                        case 7:
                            System.out.print("Enter new State: ");
                            contact.setState(sc.nextLine());
                            break;
                        case 8:
                            System.out.print("Enter new Zip Code: ");
                            contact.setZipCode(sc.nextLine());
                            break;
                        case 9:
                            running = false;
                            System.out.println("Exiting edit options.");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    if (choice >= 1 && choice <= 8) {
                        System.out.println("Contact updated successfully.");
                    }
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact() {
        System.out.print("Enter the First Name of the contact to delete: ");
        String name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                found = true;
                System.out.println("Contact deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}