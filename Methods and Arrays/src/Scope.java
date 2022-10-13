// SCOPE - Variable out of range

public class Scope {
    // public static void main(String[] args) {

    // Case 1 - Variable is printed without declaring
    // System.out.println(a);
    // int a = 5;
    // }

    // Case 2 - No variables in Method
    // public static void printInt() {
    // System.out.println(a);

    // }

    static int num = 4;

    public static void main(String[] args) {
        System.out.println(num);
    }

    public static void scopeVariable() {
        System.out.println(num);
    }

}