import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean running = true;

        while(running){
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter First name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter Phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.println("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.println("Enter City: ");
                    String city = sc.nextLine();
                    System.out.println("Enter State: ");
                    String state = sc.nextLine();
                    System.out.println("Enter Zip Code: ");
                    String zipCode = sc.nextLine();

                    Contact contact = new Contact(firstName,lastName, phoneNumber, email, address, city, state, zipCode);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Address Book.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}