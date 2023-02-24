package contactsmanagerapp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

// test

public class ContactsManagerMain {

    private static final Path contactsFile = Path.of("./src/main/java/contactsmanagerapp/contacts.txt");
    private static final ArrayList<Contact> contactList = new ArrayList<>();
    private static ArrayList<String> contactFileList;
    private static final Scanner scanner = new Scanner(System.in);
    //colors
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        startProgram();
        displayContacts();
        boolean runProgram = true;
        while (runProgram) {
            contactMenu();
            int userChoice = scanner.nextInt();
            scanner.nextLine();
//to filter through list
            switch (userChoice) {
                case 1 -> displayContacts();
                case 2 -> addContact();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> runProgram = false;
                default -> {
                }
            }
        }
        submitContactList();
        System.out.println(ANSI_YELLOW + "\n\nGoodbye!");
    }

    public static void startProgram() {
        checkForContactsTextFile();
        initializeContactList();
    }

    public static void checkForContactsTextFile() {
        if (Files.notExists(contactsFile)) {
            try {
                Files.createFile(contactsFile);
            } catch (Exception e) {
                System.out.println("Could not create contacts.txt.");
            }
        }
    }


    public static void initializeContactList() {
        try {
            contactFileList = new ArrayList<>(Files.readAllLines(contactsFile));
            if (contactFileList.size() == 0) {
                System.out.println(ANSI_RED + "There are no contacts currently ");
            } else {
                System.out.println(ANSI_PURPLE + "List of Contacts:");
                for (String element : contactFileList) {
                    if (element.equals("")) {
                        continue;
                    }
                    contactList.add(Contact.fromFileString(element));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayContacts() {
        System.out.println();
        int i = 1;
        for (Contact contact : contactList) {
            System.out.println(ANSI_PURPLE + i + ": " + contact);
            i++;
        }
    }

    //menu
    public static void contactMenu() {
        System.out.print(ANSI_RESET + """
                                
                1. View contacts.
                2. Add a new contact.
                3. Search a contact by name or number.
                4. Delete an existing contact.
                5. Exit.
                Enter an option (1, 2, 3, 4 or 5):\040""");
    }

    //adds new contacts and phone numbers & checks them
    public static void addContact() {
        System.out.print(ANSI_BLUE + "\nName of contact: ");
        String newContactName = scanner.nextLine();
        System.out.print(ANSI_BLUE + "\nPlease add phone number: ");
        int newContactNumber = scanner.nextInt();
        scanner.nextLine();
        Contact newContact = new Contact(newContactName, newContactNumber);
        boolean thisIs = false;
        int index = 0;
        for (Contact contact : contactList) {
            if (newContactName.equals(contact.getName())) {
                System.out.println(newContactName + " already exists. Would you like to overwrite the number? \"Yes\" or \"No\" \n");
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    contactList.set(index, newContact);
                    return;
                }
            }
            if (contact.getPhoneNumber() == newContactNumber) {
                System.out.println(newContactNumber + " already exists. Would you like to overwrite the name? \"Yes\" or \"No\" \n");
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("yes")) {
                    contactList.set(index, newContact);
                    return;
                }
            }
            index++;
        }
        contactList.add(newContact);
//        contactFileList.add(newContact.getName() + "|" + newContact.getPhoneNumber());
    }

//    public static void displayContacts(){
//        System.out.println("%-20s| %s %n------------------------------");
//    }

    public static void searchContact() {
        System.out.println(ANSI_YELLOW + "\nWould you like to search by name or number? \"name\" or \"number\" \n");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("name")) {
            System.out.print(ANSI_YELLOW + "\nPlease enter the name of the contact: ");
            userInput = scanner.nextLine();
            boolean isFound = false;
            for (Contact contact : contactList) {
                if (contact.getName().equalsIgnoreCase(userInput)) {
                    isFound = true;
                    System.out.println("\n" + contact.getName() + "'s phone number is " + contact.getPhoneNumber());
                    break;
                }
            }

            if (!isFound) {
                System.out.println(ANSI_RED + "\nCould not find contact.");
            }


        } else if (userInput.equalsIgnoreCase("number")) {
            System.out.print(ANSI_YELLOW + "\nPlease enter the number of the contact: ");
            userInput = scanner.nextLine();
            int userNumInput = Integer.parseInt(userInput);
            boolean isFound = false;
            for (Contact contact : contactList) {
                if (contact.getPhoneNumber() == userNumInput) {
                    isFound = true;
                    System.out.println("\n" + contact.getPhoneNumber() + " belongs to " + contact.getName());
                    break;
                }
            }

            if (!isFound) {
                System.out.println(ANSI_RED + "\nCould not find contact.");
            }
        } else {
            System.out.println(ANSI_RED + "\nInvalid input");
        }
    }

    public static void deleteContact() {
        System.out.print(ANSI_YELLOW + "\nPlease enter the name of the contact: ");
        String userInput = scanner.nextLine();
        boolean isFound = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(userInput)) {
                isFound = true;
                contactList.remove(contact);
                contactFileList.removeIf(element -> element.equals(contact.getName() + "|" + contact.getPhoneNumber()));
                System.out.println(ANSI_RED + "\n" + contact.getName() + " has been deleted");
                break;
            }
        }
        if (!isFound) {
            System.out.println(ANSI_RED + "\nCould not find contact.");
        }
    }

    public static void submitContactList() {
        try {
            Files.write(contactsFile, contactFileList, StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void deleteContact() {
//        System.out.println("Would you like to delete a contact? \"Yes\" or \"No\"");
//        String userInput = scanner.nextLine();
//        if (userInput.equalsIgnoreCase("yes")) ;
//        System.out.println("Please enter name you want to delete: ");
//        userInput = scanner.nextLine();
//        boolean isFound = false;
//        for (Contact contact : contactList) {
//            if (userInput.equalsIgnoreCase(contact.getName())) {
//                contactList.remove(contact);
//                contactFileList.removeIf(element -> element.equals(contact.getName() + "|" + contact.getPhoneNumber()));
//                System.out.println(userInput + " has been deleted.");
//                break;
//            }
//        }
//        if (!isFound) {
//            System.out.println("Contact not found.");
//        }
//    }

//    public static void searchContact() {
//        System.out.println("Who would you like to search?");
//        String userInput = scanner.nextLine();
//        boolean isFound = false;
//        for (Contact contact : contactList) {
//            if (userInput.equalsIgnoreCase(contact.getName())) {
//                System.out.println(userInput + " is here.");
//                break;
//            }
//        }
//        if (!isFound) {
//            System.out.println("Contact not found.");
//        }
//    }

    public static void exitMenu() {
        System.out.println(ANSI_BG_CYAN + "Are you sure you want to exit? \"Yes\" or \"No\"");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) ;
        System.out.println("Have a good day.");
    }
}


//e.printStackTrace(); tracks errors
//look over switch cases


//original practice below
//package PpPractice;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PrProPractce {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> contact = new ArrayList<>();
//
//        System.out.println("Please enter your name: ");
//        String user = scanner.nextLine();
//        System.out.println("Hello, " + user + "!");
//
//        System.out.println("Would you like to enter a new contact? (Yes/No)");
//        String newContact = scanner.nextLine();
//
//        if (newContact.equalsIgnoreCase("yes")) {
//            while (true) {
//                System.out.println("Please enter the name of the new contact or to exit phone book enter 'Finished': ");
//                String name = scanner.nextLine();
//                //below is the phone #
//                System.out.println("Please enter the phone number of the new contact: ");
//                String phoneNumber = scanner.nextLine();
//                contact.add(name + " - " + phoneNumber);
//                System.out.println(name + " has been added to your phone book!");
//                //The equalsIgnoreCase() method is used to compare two strings
//                // for equality while ignoring their case.
//                //--prompt will continue after this line--
//
//
//                if (name.equalsIgnoreCase("finished")) {
//                    //if string name input is 'finished' the 'break;' will end the loop
//                    break;
//                } else {
//                    contact.add(name);
//                    //else/otherwise the string name will be "filed away"
//                }
//            }
//            System.out.println(user + "'s current contacts: ");
//            System.out.println("Name | Phone number");
//            System.out.println("---------------");
//
//                System.out.print("| ");
//            }
//////for each loop | String name declares new variable (name) |
////// : separates |"contact" = 'ArrayList' which will be iterated over|z
//        }
////        System.out.println("Goodbye " + user + "!");
//    }
//
////for (String c : contact) {
////        System.out.println(c);
////                System.out.println(c.getName() + ": " + c.getPhoneNumber());
//
////            System.out.println("Contacts:");
////            System.out.println("Name | Phone number");
////            System.out.println("---------------");
////            for (Contact contact : contact) {
////                System.out.println(contact.getName() + " | " + contact.getPhoneNumber());
////            }
//
//
////builder method
//
//
//
//
//
