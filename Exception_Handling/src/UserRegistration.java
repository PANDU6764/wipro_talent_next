@SuppressWarnings("serial")

class InvalidCountryException extends Exception {

    
    public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException() {
        super("Invalid Country");
    }
}

public class UserRegistration {

    
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    
    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();

        
        try {
            ur.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }

       
        try {
            ur.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }
    }
}
