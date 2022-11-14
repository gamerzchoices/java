/*String Functions in JAVA
 
.length(): Length of a String starts from 1 
.toUpperCase(): Text uppercase
.toLowerCase(): Text lowercase
.concat(): Join two string
.charAt(): Find character of String from index starts from 0
.substring(): Get a substring from a string
.equals(): Check if two string are equal or not
.replace(): Replace a string with another string
.isEmpty(): Checks if a string is empty or not


 */

public class StringFunctions {
    public static void main(String[] args) {
        String address = "Pepsicola";
        String capital = "Kathmandu";
        String country = "Nepal.";

        // LENGTH
        System.out.println(address.length());

        // UPPERCASE
        System.out.println(capital.toUpperCase());

        // LOWERCASE
        System.out.println(country.toLowerCase());

        // STRING CONCAT
        System.out.println("Full Address is " + address + ", " + capital + ", " + country);
        System.out.println("I live in " + address.concat(capital));

        // INDEXING
        System.out.println(address.charAt(2));

        // SUBSTRING
        System.out.println(capital.substring(3));
        System.out.println(address.substring(5, 9));

        // EQUALS
        String tempValue = "Pepsicola";

        System.out.println(address.equals(tempValue));

        // EMPTY
        System.out.println(country.isEmpty());

        // REPLACE STRING
        String paragraph = "I am Aayush Gupta. I live in Pepsicola,Kathmandu.";
        System.out.println(paragraph.replace("Aayush", "Prabesh"));

    }

}
