package Set;

import java.util.*;

public class StateCapitalProperties {
    public static void main(String[] args) {
        
        Properties stateCapital = new Properties();
        stateCapital.setProperty("Andhra Pradesh", "Amaravati");
        stateCapital.setProperty("Telangana", "Hyderabad");
        stateCapital.setProperty("Maharashtra", "Mumbai");
        stateCapital.setProperty("Karnataka", "Bengaluru");
        stateCapital.setProperty("Tamil Nadu", "Chennai");
        stateCapital.setProperty("West Bengal", "Kolkata");

        
        Set<Object> states = stateCapital.keySet();

        
        Iterator<Object> iterator = states.iterator();

        System.out.println("List of States and their Capitals:\n");

        while (iterator.hasNext()) {
            String state = (String) iterator.next();
            String capital = stateCapital.getProperty(state);
            System.out.println("State: " + state + ", Capital: " + capital);
        }
    }
}

