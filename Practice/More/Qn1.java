// Write a java program to create a static method called getDbDetails and return LOCALHOST.

public class Qn1 {

    public static void main(String[] args) {

        System.out.println(Database.getDbDetails());
    }

}

class Database {
    static String getDbDetails() {
        return "Localhost";
    }
}
