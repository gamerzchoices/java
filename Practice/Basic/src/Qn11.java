//Write a program to convert String to int.

public class Qn11 {
    public static void main(String[] args) {

        String pin = "1234";

        // 1st WAY
        int firstPin = Integer.parseInt(pin);
        System.out.println(firstPin);

        // 2nd WAY
        int secondPin = Integer.valueOf(pin);
        System.out.println(secondPin);
    }
}
