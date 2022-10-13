//CONTINUE- Skip the statement and works with OR only

public class Continue {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            if (i == 57 || i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
