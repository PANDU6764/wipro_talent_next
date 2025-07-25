package Set;

import java.util.*;

public class MonthsTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> months = new TreeSet<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Months stored in TreeSet (sorted alphabetically):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

