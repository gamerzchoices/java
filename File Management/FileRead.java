import java.util.Scanner;
import java.io.File;

public class FileRead {
    public static void main(String[] args) {

        try {
            // Make object of class file
            File f = new File("info.txt");

            // Make Scanner object
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }

    }
}
