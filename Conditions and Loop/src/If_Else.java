/* IF ELSE 

if(condition){
    statements;
}
else{
    statements;
}

*/

// WAP TO CHECK HEIGHT FOR ARMY FORCE ENTRY

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        // Making Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your height? ");
        double height = sc.nextDouble();

        if (height >= 5) {
            System.out.println("Congrats! You're eligible for Army.");
        } else {
            System.out.println("Eat goat bone-marrow");
        }
    }
}
