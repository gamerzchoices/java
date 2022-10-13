//Write a java program to append content to a file that already has your name.

import java.io.FileWriter;
public class Qn3 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("hello.txt",true);
            fw.write("I Love football.");
            fw.close();
            System.out.println("Written in File.");

        }catch(Exception ex){
            System.out.println("Something went wrong.");
        }
    } 
}
