/* Wrapper Class --> It is predefined class in JAVA that includes primitive data type

In other words, we wrap primitive values into object of Wrapper Class

Primitive type      Wrapper Class
boolean             Boolean
byte                Byte
char                Character
int                 Interger
float               Float
double              Double
short               Short
long                Long

Uses :

While using Collection Framework

ArrayList<Interger> list = new ArrayList<Integer>(); Allowed
ArrayList<int> list = new ArrayList<int>(); Not Allowed

Convert primitive data type into object and vice versa.

 */

public class Introduction {

    public static void main(String[] args) {
        

        int a = 40;
        Integer b = 50;

        System.out.println("Primitive "+ a);
        System.out.println("Wrapper "+b);


        String price1 = "440";
        String price2 = "300";

        int p1 = Integer.parseInt(price1);
        int p2 =  Integer.parseInt(price2);

        System.out.println(p1+p2);

        String length = "55.2";
        String breadth = "22.5";

        double len = Double.parseDouble(length);
        double brd = Double.parseDouble(breadth);

        System.out.println(len*brd);


    }

    
}
