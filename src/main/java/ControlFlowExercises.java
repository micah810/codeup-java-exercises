import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int a = 5;
        while (a <= 15) {
            System.out.println(a);
            a++;
        }
//        int x = Scanner.nextInt();
//        for (int i = 2; i <= 100; i++) {
//            int multiple = i * x;
//            System.out.print(x + " x " + i + " = " + multiple);
//        }
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (((i % 5) == 0 && (i % 3) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("fizz");
            else if ((i % 3) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
        System.out.println("Continue? [Yes/No] ");

        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
//        boolean confirmation = userInput("y");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-6s | %-7s | %-5s |%n", "number", "squared", "cubed");
        System.out.printf("--------------------------------%n");
        Scanner input = new Scanner(System.in);
        int max = 5;
        for (int i = 1; i <= max; i++) {
             int b = i;
             int sq = i * i;
             int c = i * i * i;
            System.out.printf("| %-6s | %-7s | %-5s |%n", b,sq,c);
//padding left is + and right is -
            }

        System.out.println("enter grade");
        int grade = input.nextInt();
        //clears the new line in buffer
String letterGrade = "F";
if(grade >= 88){
    letterGrade = "A";
} else if(grade >= 80){
    letterGrade = "B";
} else if (grade >= 67) {
    letterGrade = "C";
} else if (grade >= 60){
    letterGrade = "D";
} else if (grade >= 0) {
    letterGrade = "F";
}
        System.out.println(letterGrade);
        System.out.println("continue? [Y/N]");

        String keepGoing = input.nextLine();
        input.close();
        }
}
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        System.out.println("Your number is " + num);


//  ---------------------------------------------------------------
//        int age = -1;
//        String name = null;
//        if(name == null){
//            System.out.println("Invalid Name");
//        } else {
//            System.out.println("Name is aight");
//        }
//        Scanner input = new Scanner("micah");
//        String myName = "micah";
////       ** String otherName = "mika"; //false
//        String otherName = input.next(); //true because of scanner input
////      ***  System.out.println(myName == otherName);
////        otherName = myName;
////      ***  System.out.println(myName == otherName);
//        //**Equals Method
////       *** System.out.println(myName.equals(otherName));
//
//        if(otherName.length() > 10){
//            System.out.println("long name");
//        } else if (otherName.length()<2){
//            System.out.println("wow");
//        } else {
//            System.out.println("kinda normal name");
//        }
//         switch(otherName.length()){
//             case 10 :
//                 System.out.println("long name");
//                 break;
//             case 2 :
//                 System.out.println("wow");
//                 break;
//             default:
//                 System.out.println("kinda normal name");
//         }
////**Go over arrow functions again w/ him
//
//    //** Go over do loop
//        //breathe and stay with it.
//        String choice = "";
//        //**ask user for a choice until the choose "quit"
//        System.out.print("Make a choice");
//        //**get the choice via scanner
//--------------------------------------------------------------

//*With true && false the `&&` will look left first and if its true
//  it'll look at the right
//*If && sees false first there is no way its true

//*If an || sees true||false then its automatically true
//  only if it sees false||false that it's false

