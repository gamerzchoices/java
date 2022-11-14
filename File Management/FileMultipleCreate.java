import java.io.File;

public class FileMultipleCreate {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)
            createFiles("newFiles " + i + ".txt");
    }

    public static void createFiles(String files) {
        try {
            File f = new File(files);

            if (f.createNewFile()) {
                System.out.println("File Created Successfully.");

            } else {
                System.out.println("File exist Already.");
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
}
