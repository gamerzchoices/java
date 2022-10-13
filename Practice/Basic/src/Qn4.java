//Write a program to print String entered by the user.

import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        // Making Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favourite player name ");
        String pName = sc.nextLine();

        System.out.println("Your favourite player name is " + pName);

    }
}
