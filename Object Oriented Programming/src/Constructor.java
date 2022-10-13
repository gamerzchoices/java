/*CONSTRUCTORS is the special methods to initialize objects in Java. Name of Class is name of Constructor. */

public class Constructor {
    public static void main(String[] args) {
        // Making objects having constructors

        Carpet cp1 = new Carpet("Green", 1, 0.5, 3000);
        Carpet cp2 = new Carpet("Red", 0.5, 0.2, 1500);

        // Calling method using array
        Carpet[] cp = { cp1, cp2 };

        for (Carpet cpa : cp) {
            cpa.carpetMethod();
        }

    }

}

class Carpet {

    // Properties

    String color;
    double length;
    double breadth;
    double cost;

    // Constructor

    Carpet(String color, double length, double breadth, double cost) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
        this.cost = cost;

    }

    // Method
    void carpetMethod() {
        System.out.println("Color of carpet " + this.color);
        System.out.println("Length is " + this.length);
        System.out.println("Breadth is " + this.breadth);
        System.out.println("Cost is " + this.cost);
        System.out.println();
    }

}