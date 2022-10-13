public class MainCalculator {
    public static void main(String[] args) {

        MainAdd a1 = new MainAdd(5, 4);

        a1.printSum();

        MainMul m1 = new MainMul();
        m1.setNum1(4);
        m1.setNum2(5);

        m1.printMul();
    }
}
