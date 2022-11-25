/* Boxing --> Conversion of primitive data type into wrapper class object is boxing by using methods 

Auto Boxing --> Automatic conversion of primitive data type into wrapper class object by JAVA

Unboxing ---> Vice Versa
Autoboxing --> Vice Versa

*/



public class BoxingAndUnboxing {

    public static void main(String[] args) {
        
        //AutoBoxing

        int a = 48;
        Integer b = a; //Integer = 48;
        System.out.println(b);

        //Boxing

        int c = 85;
        Integer d = Integer.valueOf(c);
        System.out.println(d);

        //Unboxing

        Double e = 345.3;
        double f = e.doubleValue();
        System.out.println(f);

        //Auto unboxing
        Double g = 64.34;
        double h =g;
        System.out.println(h);



    }
    
}
