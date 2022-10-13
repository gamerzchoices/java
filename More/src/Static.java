/* STATIC - used to share variables or methods of a given class. Useful for memory management*/

public class Static {
    public static void main(String[] args) {
        Fullname.fName = "Prabesh";
        Fullname.lName = "Gupta";

        System.out.println("Fullname is " + Fullname.fName + " " + Fullname.lName);

        Laptop.details();
    }

}

class Fullname {

    // For properties
    static String fName;
    static String lName;

}

class Laptop {

    // For Method
    static void details() {
        System.out.println("Acer");
    }
}