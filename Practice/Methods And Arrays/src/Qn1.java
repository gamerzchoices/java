//Write a program in Java to create and print your name using the method.


public class Qn1 {
    
//USING PARAMETER AND RETURN TYPE
    public static void main(String[] args) {
        String firstName = "Prabesh";
        String secondName = "Gupta";

        String fullName = name(firstName,secondName);
        System.out.println(fullName);

    }
    public static String name(String fName, String lName){
        return "Full name is "+fName+" "+lName;
    }
    
}
