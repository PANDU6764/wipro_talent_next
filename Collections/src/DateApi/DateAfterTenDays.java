package DateApi;

import java.time.LocalDate;

public class DateAfterTenDays {

    public static void main(String[] args) {

        
        LocalDate today = LocalDate.now();
        
        LocalDate dateAfterTenDays = today.plusDays(10);

        System.out.println("Today's Date       : " + today);
        System.out.println("Date After 10 Days : " + dateAfterTenDays);
    }
}

