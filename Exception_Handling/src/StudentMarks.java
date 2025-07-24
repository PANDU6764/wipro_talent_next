import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

@SuppressWarnings("serial")
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int STUDENTS = 2;
        final int SUBJECTS = 3;

        for (int i = 1; i <= STUDENTS; i++) {
            try {
                System.out.println("Enter name of student " + i + ":");
                String name = sc.nextLine();

                int[] marks = new int[SUBJECTS];
                int total = 0;

                for (int j = 0; j < SUBJECTS; j++) {
                    System.out.println("Enter marks for subject " + (j + 1) + ":");
                    String input = sc.nextLine();

                    // May throw NumberFormatException
                    int mark = Integer.parseInt(input);

                    // May throw custom exceptions
                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks are not allowed.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks cannot be more than 100.");
                    }

                    marks[j] = mark;
                    total += mark;
                }

                double average = total / (double) SUBJECTS;
                System.out.println("Average marks for " + name + ": " + average);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integer values for marks.");
            } catch (NegativeValueException | OutOfRangeException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}
