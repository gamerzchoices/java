// PRINT MULTIPLICATION TABLE FROM 1 TO 20

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(+i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
