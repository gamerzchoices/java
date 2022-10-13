/*  IF 

if(condtion){
    statements;
}

*/

// WAP TO CHECK IF USER CAN PARTICIPATE IN eSPORTS

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        // Make Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you play Mobile Legends? Type Y or N");
        char check = sc.next().toUpperCase().charAt(0); // STRING USER INPUT

        if (check == 'Y') {
            System.out.println("Cheers! You can participate in eSports.");
        }
    }

}
