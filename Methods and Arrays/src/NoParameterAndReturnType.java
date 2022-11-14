public class NoParameterAndReturnType {
    public static void main(String[] args) {
        // double simpleInterest = SI();
        System.out.println(SI());
    }

    public static double SI() {
        double P = 10000;
        double T = 5;
        double R = 14;
        return (P * T * R) / 100;
    }
}
