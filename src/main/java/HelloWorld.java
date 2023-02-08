import java.sql.SQLOutput;

//in java ALL code has to be inside a class and every public class is a source file
//public it can call outside sources...?
//void it doesn't return anything
//whole thing will be executed first

public class HelloWorld {
    //main(dataType[array]parameter)
    public static void main(String[] args) {
        int myFavoriteNumber = 127;
        System.out.println(myFavoriteNumber);
        int myNumber = 123;
        //the program starts executing here
        //sout=>tab shortcut for below
        //ln outputs to the console as a *new line*

        String myString = "3.14159";
        System.out.println(myString);
        //notice the f is used like the L
        float myNewNumber = 3.14f;
        System.out.println(myNewNumber);

        int x = 5;
        System.out.println(x++);
        //post ++ is incremented after so its like +1 and then vice versa
        System.out.println(x);
    }
}

//all possible int numbers will fit into a long
//ask about what ints and longs do
//have him reexplain the int vs long on the whiteboard again
//whole numbers will be seen as an int
//doubles will be seen as a
//a process is a running program on a computer
