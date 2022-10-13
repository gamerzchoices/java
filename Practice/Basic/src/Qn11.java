//Write a program to convert String to int.

public class Qn11 {
    public static void main(String[] args) {

        String pin = "1234";

        // 1st WAY
        int newpin1 = Integer.parseInt(pin);
        System.out.println(newpin1);

        // 2nd WAY
        int newpin2 = Integer.valueOf(pin);
        System.out.println(newpin2);
    }
}
