//Write a program that finds simple interest

public class Qn2 {
    public static void main(String[] args) {
        double principle = 10000;
        double time = 1;
        double rate = 10;

        double simpleInterest = (principle * time * rate) / 100;

        System.out.println("Simple Interest is " + simpleInterest);
    }
}
