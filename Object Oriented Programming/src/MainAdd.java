public class MainAdd {
    // Properties

    int num1;
    int num2;
    int sum;

    MainAdd(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void printSum() {
        this.sum = this.num1 + this.num2;
        System.out.println("Sum is " + this.sum);

    }
}
