public class MathFunctions {
    public static void main(String[] args) {
        int a = 34;
        int b = 46;
        float c = 5f;
        float d = -7.8735f;

        // MINIMUM
        System.out.println(Math.min(a, b));

        // MAXIMUM
        System.out.println(Math.max(c, d));

        // ABSOLUTE
        System.out.println(Math.abs(d));

        // ROUND
        System.out.println(Math.round(d));

        // CEILING - JUMPS TO NEXT NUMBER
        System.out.println(Math.ceil(10.1));

        // FLOOR - SHOW SAME NUMBER
        System.out.println(Math.floor(10.1));

        // SQUAREROOT
        System.out.println(Math.sqrt(25));

        // POWER
        System.out.println(Math.pow(2, 4));

        /*
         * RANDOM NUMBER
         * 
         * Math.random(Generates between 0-1) * (max - min + 1) + min
         * 
         */
        int randNum = (int) (Math.random() * (30 - 10 + 1) + 10);
        System.out.println(randNum);
    }

}
