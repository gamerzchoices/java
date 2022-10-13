//Write a program in Java to reverse a String using a function.


public class Qn4 {
    // NO PARAMETER AND RETURN TYPE

    public static void main(String[] args) {
        
        String reversedWord = reverse();
        System.out.println(reversedWord);
        
    }
    public static String reverse(){
        String name = "Prabesh Gupta";
        String temp = "";
        int len = name.length();

        for(int i=(len-1);i>=0;i--){
            temp += name.charAt(i);
        }
        return temp;
    }
}
