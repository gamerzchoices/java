import java.util.Random;
import java.util.Scanner;

public class TimeBomb implements Runnable {
    private int time;

    public TimeBomb() {
        time = 9;
    }

    public void run() {
        while (time >= 0) {
            synchronized (this) {
                try {
                    wait(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (time > 0) {
                System.out.println(time);
                time--;
            } else {
                System.out.println("BOOM!!!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TimeBomb timeBomb = new TimeBomb();
        Thread thread = new Thread(timeBomb);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int input = 0;
        int num = 0;

        System.out.println("Diffuse the bomb");
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            num = random.nextInt(9);
            System.out.print(num + " ");

            input = scanner.nextInt();

            if (input != num) {
                System.out.println("BOMB BLASTED!!!");
                System.exit(0);
            }
        }

        if (input == num) {
            System.out.println("Bomb Diffused!!!");
            System.exit(0);
        }

        scanner.close();
    }
}