//Write a program to multiply two floating-point numbers.

import java.util.Scanner;

public class Qn5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first decimal number ");
        float num1 = sc.nextFloat();
        System.out.println("Enter second decimal number ");
        float num2 = sc.nextFloat();

        float mul = num1 * num2;

        System.out.println("Multiplication is " + mul);

    }

}
