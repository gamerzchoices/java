//Write a program to remove all whitespaces from the String.

import java.util.Scanner;

public class Qn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter few lines ");
        String line = sc.nextLine();

        System.out.println(line.replace(" ", ""));
    }

}
