//Write a java program to add your name to hello.txt


import java.io.FileWriter;;
public class Qn2 {

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("hello.txt");
            fw.write("Prabesh Gupta");
            fw.close();
            System.out.println("Written in File.");

        }catch(Exception ex){
            System.out.println("Something went wrong.");
        }
    }
    
    
}
