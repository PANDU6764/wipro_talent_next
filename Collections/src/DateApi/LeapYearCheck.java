package DateApi;

import java.time.Year;

public class LeapYearCheck {

    public static void main(String[] args) {

        
        int currentYear = Year.now().getValue();

        
        boolean isLeap = Year.isLeap(currentYear);

        
        System.out.println("Current Year: " + currentYear);
        if (isLeap) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is NOT a Leap Year.");
        }
    }
}
