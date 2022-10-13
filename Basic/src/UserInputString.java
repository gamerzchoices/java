import java.util.Scanner;

public class UserInputString {
    public static void main(String[] args) {

        // Making Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name ");
        String fName = sc.nextLine();
        System.out.println("Enter last name ");
        String lName = sc.nextLine();

        System.out.println("Full name is " + fName + " " + lName + ".");
    }
}
