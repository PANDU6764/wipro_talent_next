package Abstract_Classes;

import java.util.Random;

@SuppressWarnings("unused")
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment: For reserved passengers with high fare.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for female passengers.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Open for all passengers with general fare.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: For transporting luggage and goods only.";
    }
}



