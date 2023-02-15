import java.util.Scanner;

class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Chat with Bob!");

        while (true) {
            userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa! Chill out!");
            } else if (userInput.equals(" ")) {
                System.out.println("Bob: Fine! Be that way!");
            } else if (userInput.equals("bye")){
                System.out.println("K bye.");
                break;
            } else {
                System.out.println("Bob: Whateverrrrr.");
            }

        }}}
