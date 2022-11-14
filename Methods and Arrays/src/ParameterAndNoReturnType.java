public class ParameterAndNoReturnType {
    public static void main(String[] args) {
        birthYear(20); // Also called argument
    }

    public static void birthYear(int age) {
        int birthYear = 2022 - age;
        System.out.println(birthYear);

    }
}
