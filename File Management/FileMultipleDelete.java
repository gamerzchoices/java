import java.io.File;

public class FileMultipleDelete {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)
            deleteFiles("newFiles " + i + ".txt");
    }

    public static void deleteFiles(String newFiles) {
        try {
            File f = new File(newFiles);

            if (f.delete()) {
                System.out.println("File Deleted Successfully.");

            } else {
                System.out.println("File Don't Exist.");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}
