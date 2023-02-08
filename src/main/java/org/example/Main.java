package org.example;

//public class Main {
//    public static void main(String[] args) {
////        System.out.println("Hello world!");
////        {
////            byte byteMe = 127;
////            byteMe += 1;
////            System.out.println(byteMe);
////        }
//        String myString = "A string is here";
//        System.out.println(myString);
//    }
//}
//primitive types: the "building blocks" of the language
//reference types: refers to objects/arrays; defaults to the value 'null' indicating a lack of an object
//DONT use single quotes
// \n = new line
// \t = tab

// Identifier: a name for a class/method/variable => begins w/ a letter/_/$ and be NO MORE than 255 char.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        //string b = "hello";
        String anAnimal = "pup";
        double c = 12.57;

//        System.out.println("Howdy " + anAnimal + " age: " + a + " makes $" + c + " bucks per hour");

        //printf does what?
        // \n or %n new line
        // %s is a placeholder for string
        //overall it's easier to just add a space in the quotes but it's good practice
        // %d is an integer placeholder aka decimal integer
        // in order: %s (string) %d (integer) %n(new line)
        //%f is the placeholder for a real/floating point number
        //!!HEY!! ask about %7.2f !!!! its characters and spaces. the decimal rounds...?

//        System.out.printf("Howdy %s age: %+5d%n makes %f bucks per hour%n", anAnimal, a, c);
        //Datatype is "Scanner"

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        input.nextLine(); //you need to use nextLine to log more than one word
        System.out.println("Enter your name: ");
//        anAnimal = input.next(); //this only logs one word
        anAnimal = input.nextLine(); //without an empty nextLine it won't go through
        System.out.println("Your OTHER name is " + anAnimal);

        //close Scanner
        input.close();
    }
}

// the buffer