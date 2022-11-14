/* 
 
OBJECT ORIENTED PROGRAMMING (OOP) is the methodology to build real time applications using class and objects

CLASS is the blueprint for creating Objects. 

Syntax
public class ClassName{
    //Properties - to store data

    //Methods - to perform operation
}

OBJECTS is the instance of the class and declared using keyword new

ClassName objectName = new ClassName();
 

 */

public class Intro {
    public static void main(String[] args) {
        // Making object of class Bike
        Bike b = new Bike();

        b.name = "Pulsar";
        b.speed = 200;
        b.milage = 5;
        b.cost = 300000;
        b.bikeMethod();

        System.out.println();

        // Making second object of class bike

        Bike c = new Bike();
        c.name = "Hayabusa turbo";
        c.speed = 400;
        c.milage = 2;
        c.cost = 3000000;

        c.bikeMethod();

    }

}

/* CREATING CLASS */
class Bike {

    // Creating Properties
    String name;
    int speed;
    float milage;
    double cost;

    // Creating Methods
    void bikeMethod() {

        System.out.println("Name of bike " + this.name);
        System.out.println("Speed " + this.speed);
        System.out.println("Milage " + this.milage);
        System.out.println("Cost " + this.cost);
    }

}
