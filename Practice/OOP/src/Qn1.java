//Write a java program to create a class Laptop with properties [id, name, ram] and create 3 objects of it and print all details

public class Qn1 {
    public static void main(String[] args) {

    Laptop l1 = new Laptop();
    l1.id =  1;
    l1.name = "Acer";
    l1.ram = 12;

    Laptop l2 = new Laptop();
    l2.id = 2;
    l2.name = "Asus";
    l2.ram = 8;

    Laptop l3 = new Laptop();
    l3.id =3; 
    l3.name = "Lenovo";
    l3.ram = 16;

    l1.lM();
    l2.lM();
    l3.lM();


        
    }

}

class Laptop{
    //Properties
    int id;
    String name;
    int ram;

    //Method
    void lM(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Ram: "+this.ram);
        System.out.println();
    }
}