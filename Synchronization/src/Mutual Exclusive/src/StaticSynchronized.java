// Static Synchronization --> To acheive class level lock we can use static synchronized or synchronized static. Every class has lock. It will work similar as object lock with additional class lock

class Apple {
    static int totalIphones = 100000;

    static synchronized void booking(int iphones) {
        if (iphones <= totalIphones) {
            System.out.println(iphones + " Order placed");
            totalIphones = totalIphones - iphones;
            System.out.println("Iphones avialable " + totalIphones);
        } else {
            System.out.println("Order failed");
            System.out.println("Iphones available " + totalIphones);
        }
    }

}

class MyThread1 extends Thread {

    Apple ap; // reference of Apple
    int iphones;

    // Parameterized constructor
    MyThread1(Apple ap, int iphones) {

        this.ap = ap; // this denotes current class instance variable
        this.iphones = iphones;

    }

    public void run() {
        ap.booking(iphones);
    }
}

class MyThread2 extends Thread {

    Apple ap;
    int iphones;

    // parameterized constructor

    MyThread2(Apple ap, int iphones) {
        this.ap = ap;
        this.iphones = iphones;
    }

    public void run() {
        ap.booking(iphones);
    }
}

public class StaticSynchronized {

    public static void main(String[] args) {

        // First object of class Apple

        Apple a1 = new Apple();

        MyThread1 m1 = new MyThread1(a1, 30000);
        m1.start();

        MyThread2 m2 = new MyThread2(a1, 50000);
        m2.start();

        // Second object of class Apple

        Apple a2 = new Apple();
        MyThread1 m3 = new MyThread1(a2, 10000);
        m3.start();

        MyThread2 m4 = new MyThread2(a2, 35000);
        m4.start();

    }
}
