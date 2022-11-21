/*Synchronized Block - if we want to synchronize particular code inside method instead as of whole method then we use synchronized block

Advantages:
Thread waiting time decreases
Performance of project increase

*/
class BookHotelRooms {

    int totalRooms = 20;

    void booking(int rooms) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        // this is object reference
        synchronized (this) {
            if (rooms <= totalRooms) {
                System.out.println("Rooms Booked successfully");
                totalRooms = totalRooms - rooms;
                System.out.println("Available rooms " + totalRooms);
            } else {
                System.out.println("Rooms weren't booked.");
                System.out.println("Available rooms " + totalRooms);
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }

}

public class SynchronizedBlock extends Thread {
    static BookHotelRooms bh;
    int rooms;

    public void run() {
        bh.booking(rooms);

    }

    public static void main(String[] args) {
        bh = new BookHotelRooms();

        SynchronizedBlock student = new SynchronizedBlock();
        student.rooms = 13;
        student.start();

        SynchronizedBlock teacher = new SynchronizedBlock();
        teacher.rooms = 8;
        teacher.start();
    }

}
