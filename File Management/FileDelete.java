import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        try {
            // MAKE FILE OBJECT

            File f = new File("Hello.txt");
            if (f.delete()/* IS RESPONSIBLE TO DELETE FILES */) {
                System.out.println("File Deleted Successfully.");
            } else {
                System.out.println("File Don't exist.");
            }

        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}
