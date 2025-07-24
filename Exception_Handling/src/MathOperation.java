public class MathOperation {
    public static void main(String[] args) {
        try {
            
            if (args.length != 5) {
                throw new ArrayIndexOutOfBoundsException("Exactly 5 integer values are required.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];
            }

            int average = sum / numbers.length;

            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: One or more inputs are not valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic Exception occurred - " + e.getMessage());
        }
    }
}
