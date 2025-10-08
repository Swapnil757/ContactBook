package contact_book;


import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook 
{
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() 
    {
        int choice;
        do 
        {
            System.out.println("\n--- Contact Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) 
            {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
            
        } while (choice!= 5);
        
    }

    private void addContact() 
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added!");
    }

    private void viewContacts() 
    {
        if (contacts.isEmpty()) 
        {
            System.out.println("No contacts found.");
        } 
        else 
        {
            contacts.forEach(System.out::println);
        }
    }

    private void searchContact() 
    {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        contacts.stream()
        	.filter(c -> c.getName().equalsIgnoreCase(name))
        		.forEach(System.out::println);
    }

    private void deleteContact() 
    {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
        System.out.println("Contact deleted if it existed.");
    }
}