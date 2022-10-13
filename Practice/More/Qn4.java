import java.time.LocalDate;

//Write a java program to ask the user to enter birth year and find age using the current date year.

import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.now();

        int currentYear = date.getYear();

        System.out.println("Enter birth year ");
        int birthYear = sc.nextInt();

        int age = currentYear - birthYear;
        System.out.println("Your age is " + age);

    }
}
