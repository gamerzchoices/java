import java.util.Random;
import java.util.Scanner;

// PASSWORD GENERATOR

public class Qn8 {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password Length ");
        int len = sc.nextInt();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String digit = "0123456789";
        String sChar = "~`!@#$%^&*()_+=-[]{}|:;'<>.?/,";
        String combo = upper + lower + digit + sChar;

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {

            password[i] = combo.charAt(ran.nextInt(combo.length()));
        }
        System.out.println("Password is " + new String(password));

    }
}
