package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("unused")
public class SumUsingFunction {

    public static void main(String[] args) {

        
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7, 15, 3, 6, 10, 9);

        
        Function<List<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        
        int totalSum = sumFunction.apply(numbers);

       
        System.out.println("Sum of all elements: " + totalSum);
    }
}

