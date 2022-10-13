//Write a Java program to check if the number is odd or even.

import java.util.Scanner;

public class Qn1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(+num + " is even.");
        } else {
            System.out.println(+num + " is odd.");
        }
    }

}