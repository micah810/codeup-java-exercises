import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("micah810", 85);
        student.put("gruddle02", 95);
        student.put("javajuice", 75);
        student.put("sumName55", 100);
        student.put("coconull", 96);
        System.out.println(student);

        Student student1 = new Student("D0zz");
        student1.addGrade(85);
        student1.addGrade(99);
        student1.addGrade(100);

        Student student2 = new Student("NoHam");
        student2.addGrade(96);
        student2.addGrade(93);
        student2.addGrade(94);
        System.out.println(student1.getName() + "'s average grade is " + student1.getGradeAverage());
        System.out.println(student2.getName() + "'s average grade is " + student2.getGradeAverage());

    }
}
//create a main loop
//bonus question: Enter "category" for final list filter, or "all" for everything
//print out the numbered grocery list
//keep classes as small as possible
//counter++ ?

// .size : returns the number of elements in the array
// .add : adds an element to the collection at a specififed index
// .get : return the element at th specified index
// .indexOf : return the first found index of the given item,
// or -1 if not found

// .contains : check if a collection contains a given element
// .lastIndexOf : find the llast index of the given element, 1-
// .isEmpty : check if the list is empty
// .remove : remove the first occurance of an item
