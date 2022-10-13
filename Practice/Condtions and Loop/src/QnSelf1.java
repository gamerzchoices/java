// WAP TO CHECK RARITY OF BLOOD

import java.util.Scanner;

public class QnSelf1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Choose blood group A,B,O,AB ");
        String bloodGroup = sc.nextLine().toUpperCase();

        System.out.println(" Choose type + or - ");
        char bloodType = sc.next().charAt(0);

        if (bloodGroup.equals("A") && bloodType == '+' || bloodGroup.equals("B") && bloodType == '+'
                || bloodGroup.equals("O") && bloodType == '+' || bloodGroup.equals("AB") && bloodType == '+') {
            System.out.println("Your bloodgroup " + bloodGroup + bloodType + " is common.");
        } else {
            System.out.println("Your bloodgroup " + bloodGroup + bloodType + " is rare.");
        }
    }
}
