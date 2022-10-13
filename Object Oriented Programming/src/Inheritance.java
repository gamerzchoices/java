/*INHERITANCE- if one class uses properties and methods of another class

 */

public class Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Prabesh";
        s1.age = 20;

        s1.pM();

        System.out.println();

        Teacher t1 = new Teacher();
        t1.name = "Roshan";
        t1.age = 40;
        t1.subject = "Science";
        t1.tM();
    }
}

class Person {
    String name;
    int age;

    void pM() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

    }
}

class Student extends Person {

}

class Teacher extends Person {
    String subject;

    void tM() {
        pM();
        System.out.println("Subject: " + this.subject);
    }
}