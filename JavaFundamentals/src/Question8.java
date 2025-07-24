import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.next().trim();
        int age = sc.nextInt();
        gender = gender.toLowerCase();
        if (gender.equals("male") && age >= 1 && age <= 58) {
            System.out.println("The percentage of interest is 8.4%");
        } else if (gender.equals("male") && age >= 59 && age <= 100) {
            System.out.println("The percentage of interest is 10.5%");
        } else if (gender.equals("female") && age >= 1 && age <= 58) {
            System.out.println("The percentage of interest is 8.2%");
        } else if (gender.equals("female") && age >= 59 && age <= 100) {
            System.out.println("The percentage of interest is 9.2%");
        } else {
            System.out.println("Invalid input. Please check age or gender.");
        }
        sc.close();
        
    }
}