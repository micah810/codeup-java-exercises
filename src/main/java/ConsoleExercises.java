import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String one = "first";
        String two = "second";
        String three = "third";
//        double h = ;
//        double w = ;

        Scanner input = new Scanner(System.in);
//why did you use printf... to round it to the hundredths digit
        //ask to practice with % more
        System.out.println("The value of pi is approximately " + pi);
        //review split
        System.out.print("Enter 3 words");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3); // :p

        System.out.println("Enter an integer ");
        int num = input.nextInt();
        System.out.println(num);
        input.nextLine();
        System.out.println("Please enter these three words: " + one + two + three);
        one = input.nextLine();
        System.out.println("Mmmmm I dont think you did it right.");

        System.out.println("Enter width: ");
        String s = input.nextLine();
        int width = Integer.parseInt(s);
        System.out.println("Enter length: ");
        String stg = input.nextLine();
        int length = Integer.parseInt(stg);
//        h = Double.parseDouble(s);
//        w = Double.parseDouble(s);
        int area = width * length;
        int perimeter = (2 * width) * (2 * length);

        System.out.printf("""
                Length: %d
                Width: %d
                Area: %d
                Perimeter: %d%n"""
                ,length, width, area, perimeter);
        input.close();
//
//        System.out.println("The area of this room is " + w * h);


    }
}
