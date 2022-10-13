import java.io.File;

//Write a java program to delete the file.
 

public class Qn6 {
    public static void main(String[] args) {
        try{
            File f = new File("fello.txt");
            if(f.delete()){
                System.out.println("File is deleted.");

            }else{
                System.out.println("File doesn't exist.");
            }

        }catch(Exception ex){
            System.out.println("Something went wrong.");
        }
    }
}
