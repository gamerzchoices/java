//Write a Java program to generate multiplication tables of 1 -9.

public class Qn8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println(+i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
