// Write a Java program to check whether a character is a vowel or consonant.

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character ");
        char charName = sc.next().charAt(0);

        if (charName == 'A' || charName == 'E' || charName == 'I' || charName == 'O' || charName == 'U' ||
                charName == 'a' || charName == 'e' || charName == 'i' || charName == 'i' || charName == 'u') {
            System.out.println("Vowels");
        } else {
            System.out.println("Consonant");
        }
    }

}
