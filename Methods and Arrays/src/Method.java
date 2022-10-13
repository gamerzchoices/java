/* Methods are the block of code that performs a specific task. To declare a method, you must go outside the main method. */

public class Method {

    // MAIN METHOD
    public static void main(String[] args) {
        address();
    }

    // METHOD
    public static void address() {
        System.out.println("Kadaghari");
        capital();
    }

    public static void capital() {
        System.out.println("Kathmandu");
        country();
    }

    public static void country() {
        System.out.println("Nepal");
    }
}
