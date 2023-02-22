package notes;

public class ExceptionsNotes {
    public static void main(String[] args) {
        //throwing an exception
//        throw new RuntimeException();
//        System.out.println("does this print?");
//        //^^wont run because manual throw exception
        try {
            throw new RuntimeException("hi");
        } catch (RuntimeException e) {
            System.out.println("an exception occurred: ");
            //How to handle in an appropriate way (try & catch)
        } finally {
            //^finally is like a cleanup
            System.out.println("finally code always executes");
        }
        System.out.println("program is still going");
    }
    //this in in Object exercise
    //Input myInput = new Input();
    //int myInput =

    //use ArithmeticException
//    try {
//        int x = 5 / 0;
//    } catch(ArithmeticException e){
//        System.out.println("dont divide by zero");
//    }
//    int [] nums = new int[10];
//    nums[11] =4;
//} catch(ArrayIndexOutOfBoundsException e){
//
        }

//**Robust: robust software is more bulletproof than not.
// It catches unexpected situations and handles it better.
// a clean catch will bundle a runtime exception
//

