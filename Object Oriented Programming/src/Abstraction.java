/* ABSTRACTION - showing necessary information but hiding its internal functions 

abstract class ClassName{
    public abstract void methodName();
}
*/

public class Abstraction {
    public static void main(String[] args) {
        JavaBook j1 = new JavaBook();
        j1.pages = 500;
        j1.bookPages();
    }
}

// Abstract Class
abstract class Book {

    // Abstract Method
    public abstract void bookPages(); // It doesn't return anything

}

class JavaBook extends Book {
    // Property
    int pages;

    // Non Abstract method
    public void bookPages() {
        System.out.println("Numbers of pages is " + this.pages);
    }

}