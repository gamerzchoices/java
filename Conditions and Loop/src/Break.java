// BREAK - Used to terminte loop or switch

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            if (i == 40) {
                break;
            }
            System.out.println(i);
        }
    }

}