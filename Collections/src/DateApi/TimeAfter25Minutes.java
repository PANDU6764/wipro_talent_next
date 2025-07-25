package DateApi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAfter25Minutes {

    public static void main(String[] args) {

        
        LocalTime currentTime = LocalTime.now();

       
        LocalTime timeAfter25Minutes = currentTime.plusMinutes(25);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        
        System.out.println("Current Time        : " + currentTime.format(formatter));
        System.out.println("Time After 25 Mins  : " + timeAfter25Minutes.format(formatter));
    }
}

