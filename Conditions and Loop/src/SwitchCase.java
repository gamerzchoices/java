/*SWITCH CASE

switch(expression){
    case 1:
        statement;
        break;
    case 2:
        statement;
        break;
    default:
        statement;
}
 */

//  TWO NUMBERS CALCULATOR

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // SCANNER OBJECT

        System.out.println("Do you want to add, sub, mul, div or mod?");
        String userCalc = sc.nextLine(); // STRING USERINPUT
        String calc = userCalc.toLowerCase(); // LOWERCASE

        // CHECKING IF INPUT MATCHED WITH USER INPUT
        if (calc.equals("add") || calc.equals("sub") || calc.equals("mul") || calc.equals("div")
                || calc.equals("mod")) {

            System.out.println("Enter Number 1");
            int num1 = sc.nextInt(); // INTEGER USERINPUT
            System.out.println("Enter Number 2");
            int num2 = sc.nextInt();

            // DECLARING SWITCH CASE
            switch (calc) {
                case "add":
                    int sum = num1 + num2;
                    System.out.println("Addition is " + sum);
                    break;
                case "sub":
                    int difference = num1 - num2;
                    System.out.println("Subtraction is " + difference);
                    break;
                case "mul":
                    int multiply = num1 * num2;
                    System.out.println("Multiplication is " + multiply);
                    break;
                case "div":
                    int divison = num1 / num2;
                    System.out.println("Division is " + divison);
                    break;
                case "mod":
                    int modulos = num1 % num2;
                    System.out.println("Mudulos is " + modulos);
                    break;
                default:

            }

        } else {
            System.out.println("Choose add, sub, mul, div or mod");
        }
    }
}
