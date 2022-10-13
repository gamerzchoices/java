import java.io.FileWriter;

public class FileWrite {

    public static void main(String[] args) {

        try {
            // MAKE OBJECT OF CLASS FILE

            FileWriter fw = new FileWriter("info.txt", true);

            // ,true IT WILL ADD THE GIVEN TEXT IN END OF FILE INSTEAD REPLACING THE WHOLE
            // TEXT OF FILE

            fw.write("I live in pepsicola, Kathmandu.");
            fw.close();
            System.out.println("Successfully Written :)");

        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }

}
