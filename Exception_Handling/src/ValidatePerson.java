@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ValidatePerson {
    public static void main(String[] args) {
        try {
            
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two arguments: <Name> <Age>");
            }

            String name = args[0];
            int age;

            
            try {
                age = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Age must be a valid integer.");
            }

            
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration Successful!");

        } catch (InvalidAgeException | IllegalArgumentException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
    }
}
