import java.time.LocalDate;
import java.time.Month;

public class Year {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // FOR DAY
        int day = date.getDayOfMonth();

        // FOR MONTH
        int month = date.getMonthValue();

        // FOR YEAR
        int year = date.getYear();

        System.out.println("yyyy-mm-dd");
        System.out.println(year + "-" + month + "-" + day);
    }

}
