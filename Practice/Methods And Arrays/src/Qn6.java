//Write a program in Java to store 10 student names and print all using array.

import java.util.Scanner;

public class Qn6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] studentNames = new String[10];

        System.out.println("Enter students name");

        for (int i = 0; i < studentNames.length; i++) {

            studentNames[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Name of Students are listed below");

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }
    }
}
