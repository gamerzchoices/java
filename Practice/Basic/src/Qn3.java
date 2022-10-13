//Write a program to print an integer entered by the user.

import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        // Making Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        System.out.println("Wala! Your number is " + num);
    }
}
