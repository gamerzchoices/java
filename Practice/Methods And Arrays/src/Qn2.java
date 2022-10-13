//Write a program in Java to print even numbers between intervals using methods.

public class Qn2 {

    // USING PARAMETER AND NO RETURN TYPE
    public static void main(String[] args) {
        even(45);

    }

    public static void even(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {

                if (i == 50) {

                    break;
                }
                System.out.println(i);
            }
        }
    }

}
