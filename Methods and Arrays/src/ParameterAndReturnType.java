public class ParameterAndReturnType {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(10));
    }

    public static double areaOfCircle(double radius) {
        final double pi = 3.14;
        return pi * radius * radius;
    }
}
