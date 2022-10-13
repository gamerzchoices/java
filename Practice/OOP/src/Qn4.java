//Write a java program to create a class Animal with properties [id, name, color]. Create another class called Cat and extends it from Animal. Add new properties sound in String. Create an object of a Cat and print all details.


public class Qn4 {
    public static void main(String[] args) {
       Cat c1=new Cat();
       c1.id = 1; 
       c1.name = "British Shorthair";
       c1.color ="Grey"; 
       c1.sound = "Meow";

       c1.cM();
    }
}

class Animal{
    int id;
    String name;
    String color;

    void aM(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Color: "+this.color);
    }
}

class Cat extends Animal{
    String sound;

    void cM(){
        aM();
        System.out.println("Sound: "+this.sound);
    }
}