// WAP TO FIND SUM AND THEIR AVERAGES

import java.util.Scanner;

public class ArraysUserInput2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = 0;

        System.out.println("Size of array"); // SIZE OF ARRAY
        int size = sc.nextInt();

        int[] prices = new int[size]; // INITIATING ARRAY

        System.out.println("Enter prices ");

        // FOR USER INPUT
        for (int i = 0; i < size; i++) {

            prices[i] = sc.nextInt();

        }

        // FOR DISPLAY ELEMENTS
        for (int i = 0; i < size; i++) {
            temp = temp + prices[i];
        }
        System.out.println("Sum is " + temp);

        int avg = temp / size;
        System.out.println("Avg is " + avg);
    }
}
