//Write a Java program to create a simple calculator using a switch case.

import java.util.Scanner;

public class Qn9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char calc;
        double num1, num2, result;

        System.out.println("Choose +, - , *, / ");
        calc = sc.next().charAt(0);

        System.out.println("Enter first number ");
        num1 = sc.nextInt();
        System.out.println("Enter second number ");
        num2 = sc.nextInt();

        switch (calc) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division is " + result);
                break;

        }
    }

}
