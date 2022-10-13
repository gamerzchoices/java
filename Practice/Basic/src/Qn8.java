//Write a program to calculate the square of a number.

import java.util.Scanner;

public class Qn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int square = num * num;

        System.out.println("Square of " + num + " is " + square);
    }

}
