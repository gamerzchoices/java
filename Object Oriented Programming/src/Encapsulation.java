
/* ENCAPSULATION - hide data from users

We use private keyword and create getter and setter methods

 */

public class Encapsulation {
    public static void main(String[] args) {

        Bottle b1 = new Bottle();
        b1.setName("Alumino");
        b1.setCapacity(0.75);

        Bottle b2 = new Bottle();
        b2.setName("Rara mineral water");
        b2.setCapacity(1);

        System.out.println(b1.getName());
        System.out.println(b1.getCapacity());
        System.out.println();
        System.out.println(b2.getName());
        System.out.println(b2.getCapacity());

    }
}

class Bottle {
    private String name;
    private double capacity;

    // MAKING GETTER AND SETTER

    String getName() {
        return name;

    }

    double getCapacity() {
        return capacity;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
