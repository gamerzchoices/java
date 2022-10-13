import java.io.File;
import java.nio.file.Files;

//Write a java program to copy the file.

public class Qn5 {
    public static void main(String[] args) {

        try {
            File f1 = new File("hello.txt");
            File f2 = new File("fello.txt");

            Files.copy(f1.toPath(), f2.toPath());
        } catch (Exception ex) {
            System.out.println("Something went wrong.");

        }
    }
}
