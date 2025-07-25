package SreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class NegativeEvenFilter {

    public static void main(String[] args) {
        
        List<Integer> originalList = Arrays.asList(-10, 15, -3, -8, 22, 0, -6, 9, -5);

        
        List<Integer> negativeEvenList = originalList.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        
        System.out.println("Negative even numbers: " + negativeEvenList);
    }
}
