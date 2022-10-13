import java.io.File;

public class FileCreate {

    public static void main(String[] args) {
        try {
            // MAKE FILE OBJECT

            File f = new File("Hello.txt");
            if (f.createNewFile()/* IS RESPONSIBLE TO CREATE FILE */) {
                System.out.println("File Created Successfully.");
            } else {
                System.out.println("File exist already.");
            }

        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}
