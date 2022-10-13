public class StaticWork {
    public static void main(String[] args) {
        Student.school = "Nexus School";

        Student s1 = new Student();
        s1.name = "Prabesh Gupta";
        s1.rollNo = 1;
        s1.standard = 10;

        Student s2 = new Student();
        s2.name = "Aayush gupta";
        s2.rollNo = 5;
        s2.standard = 8;

        Student[] group = { s1, s2 };

        for (Student printInfo : group) {
            printInfo.info();
            System.out.println(Student.school);
            System.out.println();
        }

    }

}

class Student {
    String name;
    int rollNo;
    int standard;

    static String school;

    void info() {
        System.out.println("Name " + this.name);
        System.out.println("Roll no " + this.rollNo);
        System.out.println("Standard " + this.standard);
    }

}