package contactsmanagerapp;

public class Contact {

    private String name;

    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact fromFileString(String fileString) {
        String[] contactInfo = fileString.split("\\|");
        return new Contact(contactInfo[0], Integer.parseInt(contactInfo[1]));
    }

    @Override
    public String toString() {
        return "NAME: " + name + ", PHONE NUMBER: " + phoneNumber;
    }



    // accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

//REPLACING
//List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
//List<String> newList = new ArrayList<>();
//
//for (String line : lines) {
//    if (line.equals("milk")) {
//        newList.add("cream");
//        continue;
//    }
//    newList.add(line);
//}
//
//Files.write(Paths.get("data", "groceries.txt"), newList);


//original work
//package PpPractice;
//
//class Contact {
//    public String name;
//   public String phoneNumber;
//
//    public Contact(String name, String phoneNumber) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//}
