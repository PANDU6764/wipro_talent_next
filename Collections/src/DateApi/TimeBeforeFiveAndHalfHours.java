package DateApi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeBeforeFiveAndHalfHours {

    public static void main(String[] args) {

        
        LocalTime currentTime = LocalTime.now();

        
        LocalTime timeBefore = currentTime.minusHours(5).minusMinutes(30);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        
        System.out.println("Current Time               : " + currentTime.format(formatter));
        System.out.println("Time Before 5 Hrs 30 Mins  : " + timeBefore.format(formatter));
    }
}

