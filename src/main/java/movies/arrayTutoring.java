package movies;

import java.util.Arrays;

public class arrayTutoring {
    public static void main(String[] args) {
        String[] animals = new String[4];
        System.out.println(Arrays.toString(animals));

        animals[0] = "dog";
        System.out.println(Arrays.toString(animals));

        animals[1] = "cat";
        System.out.println(Arrays.toString(animals));

        animals[2] = "bear";
        System.out.println(Arrays.toString(animals));


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);


            }
        }
    }
}
//Array List of object

//ArrayList<String> foods = new ArrayList<>();
