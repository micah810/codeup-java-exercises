package org.example;//a class declares what an object is made of
//contentObject boom content is there
//object oriented language can take all the information needed from a class
//make flashcards for the terms in Java

//class person {
//    //fields, member variables,
//    public String firstName;
//    public String lastName;
//    //objects can have behaviors or
//    //functions do things properties store things
//    public String sayHello() {
//        return String.format("Hello from %s %s", firstName + lastName);
//
//        public static void main (String[]args){
//            Person rick = new Person();
//
//            rick.firstName = "Rick";
//            rick.lastName - "Sanchez";
//            System.out.println(rick.sayHello());
//            //prints "Hello from Rick Sanchez"
//        }
//    }
//}

class objectOrientedNotes {
    public static int personCounter = 0;
    private String firstName;
    private String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s! Person counter is %d", firstName, lastName, personCounter);
    }
//you dont need getters and setters when youre inside the class itself
    //when theyre static they have one copy for all the objects
    //look into static more carefully
    public static void main(String[] args) {
        objectOrientedNotes rick = new objectOrientedNotes();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
    }
    //accessors (are for what? what was this notes?)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

//do #1 of OOP and then the HW for 2nite