package DateApi;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class WiproExperienceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your Wipro joining date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();
        LocalDate joiningDate = LocalDate.parse(inputDate);

        
        LocalDate today = LocalDate.now();

        
        Period experience = Period.between(joiningDate, today);

        
        System.out.println("\nYour Experience in Wipro:");
        System.out.println("Years : " + experience.getYears());
        System.out.println("Months: " + experience.getMonths());
        System.out.println("Days  : " + experience.getDays());

        sc.close();
    }
}

