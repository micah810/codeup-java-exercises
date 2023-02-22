package PpPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrProPractce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contact = new ArrayList<>();

        System.out.println("Please enter your name: ");
        String user = scanner.nextLine();
        System.out.println("Hello, " + user + "!");

        System.out.println("Would you like to enter a new contact? (Yes/No)");
        String newContact = scanner.nextLine();

        if (newContact.equalsIgnoreCase("yes")) {
            while (true) {
                System.out.println("Please enter the name of the new contact or to exit phone book enter 'Finished': ");
                String name = scanner.nextLine();
                System.out.println(name + " has been added to your phone book!");
                //The equalsIgnoreCase() method is used to compare two strings
                // for equality while ignoring their case.
                //--prompt will continue after this line--


                if (name.equalsIgnoreCase("finished")) {
                    System.out.println("Do you want to make any edits? (Yes/No)");
                    String editBook = scanner.nextLine();
                    if (editBook.equalsIgnoreCase("yes")) {
                        while (true) {
                            System.out.println("Which contacts would you like to delete?");
                            String name = scanner.nextLine();
                            System.out.println(name + " has been deleted.");
                        }
                    }
                    break;
                    //if string name input is 'Quit' the 'break;' will end the loop
                } else {
                    contact.add(name);
                    //else/otherwise the string name will be "filed away"
                }
            }
            System.out.println(user + "'s current contacts: ");
            for (String name : contact) {
////for each loop | String name declares new variable (name) |
//// : separates |"contact" = 'ArrayList' which will be iterated over|
                System.out.println("-" + name);
            }
        }
    }
}




