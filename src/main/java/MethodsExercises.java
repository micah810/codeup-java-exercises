import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
//you can also just replace (a,b)
        System.out.println("Addition: " + addition(a, b));
        System.out.println("Subtraction: " + subtraction(a, b));
        System.out.println("Multiplication: " + multiplication(a, b));
        System.out.println("Division: " + division(a, b));
        System.out.println("Modulus: " + modulus(a, b));
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public class InputValidation {
        public static void main(String[] args) {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);
            System.out.println("The user input is: " + userInput);
        }

        public static int getInteger(int min, int max) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                if (sc.hasNextInt()) {
                    int userInput = sc.nextInt();
                    if (userInput >= min && userInput <= max) {
                        return userInput;
                    }
                }
                sc.nextLine();
                System.out.print("Input is invalid. Please enter a number between " + min + " and " + max + ": ");
            }
            //practice dice roll
//            public class Highlow {
//                public static void main(String[] args) {
//                    double muNumber = Math.floor(Math.random() * 100) + 1;
//
//                    int userInput;
//                    do {
//                        System.out.println("choose 1-1oo");
//
//                        int userInput = MethodsExercsies.getInteger(1, 100);
//                        if (userInput > myNum) {
//                            System.out.println("lower");
//                        } else if (userInput < myNum) {
//                            System.out.println("higher");
//                        } else {
//                            System.out.println("good guess");
//                        }
//                    }
//                }
//            }


//            solve the example for practice later!

//            public static long factorial(int num){
//                long answer = 1;
//                String fact = "";
//                //solving a factoral using a loop below
//                for(int i = 1; i<= num; i++){
//                    answer *= i;
//
//                    if(i==1){
//                        String stringFactorial = "" + i + "! =";
//
//                    }
//                }
//            }

//            String userChoice = "y";
//            while (userChoice.equals("y")) {
//                System.out.print("Enter an integer from 1 to 10: ");
//                int number = getInteger(1, 10);
//                long factorial = calculateFactorial(number);
//                System.out.println("The factorial of " + number + " is " + factorial + ".");
//                System.out.print("Do you want to continue? (y/n) ");
//                userChoice = sc.next();
//            }
//            System.out.println("Bye!");
//        }
//        public static int getInteger(int min, int max) {
//            Scanner sc = new Scanner(System.in);
//            while (true) {
//                if (sc.hasNextInt()) {
//                    int userInput = sc.nextInt();
//                    if (userInput >= min && userInput <= max) {
//                        return userInput;
//                    }
//                }
//                sc.nextLine();
//                System.out.print("Invalid input. Please enter a number between " + min + " and " + max + ": ");
//            }
//        }
//
//        public static long calculateFactorial(int number) {
//            long factorial = 1;
//            for (int i = 1; i <= number; i++) {
//                factorial *= i;
//            }
//            return factorial;
//        }
        }
    }
}


//Calling Methods:
// recursion is just a function calling itself