package DateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSundayNextMonth {

    public static void main(String[] args) {

        
        LocalDate today = LocalDate.now();

        
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;
        LocalDate secondSunday = null;

        
        for (int i = 0; i < 31; i++) {
            LocalDate current = firstDayNextMonth.plusDays(i);
            if (current.getMonth() != firstDayNextMonth.getMonth()) {
                break; // Stop if we reach the next month
            }
            if (current.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    secondSunday = current;
                    break;
                }
            }
        }

       
        if (secondSunday != null) {
            System.out.println("Second Sunday of next month: " + secondSunday);
        } else {
            System.out.println("Second Sunday not found.");
        }
    }
}
