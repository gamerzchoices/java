/*IF ELSE-IF

if(condition){
    Statements;
}
else if(Condition){
    statements;
}
else if(Condition){
    statements;
}
else{
    statements;
}


 */

// WAP TO CHECK GRADE OF STUDENT

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your percentage ");
        float percentage = sc.nextFloat();

        if (percentage >= 90) {
            System.out.println("A+");
        }

        else if (percentage <= 90 && percentage >= 80) {
            System.out.println("A");

        } else if (percentage <= 80 && percentage >= 70) {
            System.out.println("B+");

        } else if (percentage <= 70 && percentage >= 60) {
            System.out.println("B+");

        } else if (percentage <= 60 && percentage >= 50) {
            System.out.println("C");

        } else {
            System.out.println("Fail");
        }

    }

}
