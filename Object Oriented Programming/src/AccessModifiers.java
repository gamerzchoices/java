/* MODIFIERS - are used to set the visibility of the classes, properties, methods, etc

Access Modifiers

1. For classes:
public --> The class is accessible by other class.
default	--> The class is accessible by other class in the same package.

2. For properties and methods:

public --> Accessible by other class.
default	--> Accessible by other class in the same package.
private	--> Accessible within the same class.
protected --> Accessible within a package and subclass.

*/
public class AccessModifiers {
    public static void main(String[] args) {
        Drone d1 = new Drone("HMxRC", 3.2);

        System.out.println(d1.name);
    }
}

class Drone {
    String name;
    double weight;

    Drone(String name, double weight) {
        this.name = name;
        this.weight = weight;

    }

    void dm() {
        System.out.println("Name  " + this.name);
        System.out.println("Weight " + this.weight);
    }
}