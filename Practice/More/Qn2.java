import java.time.LocalDate;
import java.time.LocalTime;

//Write a java program to print the current date and time.

public class Qn2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        LocalTime time = LocalTime.now();

        System.out.println(time);
    }
}
