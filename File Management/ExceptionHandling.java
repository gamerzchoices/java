
/* 

EXCEPTION - An exception (or exceptional event) is a problem that arises during the execution of a program. 

EXCEPTION HANDLING - If users enters wrong value but we dont want program to terminate

try{
    statements;
}
catch(Exception ex){
    statements;
}
finally{
    statements;
}

 */
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number ");
            int num1 = sc.nextInt();

            System.out.println("Enter Second number ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum is " + sum);
        } catch (Exception ex) {
            System.out.println("Only Integers");
        } finally {
            System.out.println("At last.");
        }

    }

}
