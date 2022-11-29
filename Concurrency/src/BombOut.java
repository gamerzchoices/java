
import java.util.*;

// Implementing Runnable interface
public class BombOut implements Runnable {

    @Override
    public void run() {

        // Creating String array for time countdown
        String[] time = { "nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero" };

        // For loop for countdown
        for (int i = 0; i <= 9; i++) {

            // Synchronized block
            synchronized (this) {
                try {
                    Thread.sleep(1000); // Set time in milliSeconds

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (i < 9) {
                System.out.println("  Remaining time:  " + time[i]);
            } else {

                System.out.println("Bomb Exploded!!");

                // Exit the program
                System.exit(0);
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {

        // Creating program pattern
        System.out.println();
        System.out.println("b                      b                      t");
        System.out.println("b                      b                      t");
        System.out.println("b b    o o o  m     m  b b    o o o  u   u  t t t");
        System.out.println("b   b  o   o  m m m m  b   b  o   o  u   u    t");
        System.out.println("b b    o o o  m  m  m  b b    o o o  u u u u  t ");
        System.out.println();
        System.out.println("Try your best to diffuse Bomb");
        System.out.println("-----------------------------");

        // Creating objects of Class BombOut and Thread then passing reference of
        // Bombout in Thread Constructor
        BombOut bO = new BombOut();
        Thread t1 = new Thread(bO);
        t1.start();

        // Object of Scanner and Random Class
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        // Initialization of empty variables
        int num = 0;
        int input = 0;

        // Checking if user inputs are correct for first 5 times
        for (int j = 0; j < 5; j++) {

            // Generating a random integer
            num = ran.nextInt(9);

            // User input
            System.out.print("Type " + num + " => ");
            input = sc.nextInt();

            // If only true, this if statement will run
            if (input != num) {
                System.out.println("Noob! Bomb Exploded.");

                System.exit(0);
            }

        }
        System.out.println("Congrats! Bomb is diffused.");
        System.exit(0);

        // Scanner object is closed
        sc.close();
    }

}
