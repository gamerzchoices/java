/*INTERFACE - pure abstraction and allows multiple inheritences
 
interface InterfaceName{
    void methodName();
}

 */

public class Interface {
    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.noOfPages();

        Mathematics m1 = new Mathematics();
        m1.noOfPages();

        Social s1 = new Social();
        s1.noOfPages();
    }
}

interface Book {
    void noOfPages();
}

class Computer implements Book {
    public void noOfPages() {
        System.out.println("300 pages");
    }

}

class Mathematics implements Book {
    public void noOfPages() {
        System.out.println("1000 pages");
    }
}

class Social implements Book {
    public void noOfPages() {
        System.out.println("250 Pages");
    }
}