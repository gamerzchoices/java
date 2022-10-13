/* POLYMORPHISM - use same method or object for different operations for different cases.

poly - many
morph - forms

 */

public class Polymorphism {
    public static void main(String[] args) {

        Planet p1 = new Planet();
        p1.printInfo();

        Mars m1 = new Mars();
        m1.printInfo();

        Pluto p2 = new Pluto();
        p2.printInfo();

    }
}

class Planet {
    void printInfo() {
        System.out.println("Earth is default planet.");
    }
}

class Mars extends Planet {
    void printInfo() {
        System.out.println("Mars is new home.");
    }

}

class Pluto extends Planet {

}