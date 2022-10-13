//Write a program in Java that find whether the number is prime or not using function.

public class Qn3 {
    // NO PARAMETER AND NO RETURN VALUE

    public static void main(String[] args) {
        checkNum();

    }

    public static void checkNum() {
        int num = 7, temp = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.println("Prime number");

        } else {
            System.out.println("Not prime");
        }
    }
}
