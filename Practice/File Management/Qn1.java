// Write a java program to create a new file called hello.txt

import java.io.File;
public class Qn1 {
    public static void main(String[] args) {
        try{
            //make File object
            File f =  new File("hello.txt");

            if(f.createNewFile()){
                System.out.println("File is created.");
            }else{
                System.out.println("File exist already.");
            }

        }catch(Exception ex){
            System.out.println("Something went wrong.");
        }
    }

    
}
