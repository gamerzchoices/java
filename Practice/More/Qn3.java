import java.time.LocalDate;

//Write a java program to print the current year.

public class Qn3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int year = date.getYear();

        System.out.println(year);
    }
}
