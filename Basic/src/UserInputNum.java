import java.util.Scanner;

public class UserInputNum {
    public static void main(String[] args) {
        // Making Scanner object

        Scanner sc /* sc can be renamed */ = new Scanner(System.in);

        System.out.println("Enter First number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        sum += 36;

        System.out.println("Sum is " + sum);

    }
}
