package Arrays;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		int[] array= {10,23,45,25,17};
		int sum=Arrays.stream(array).sum();
		OptionalDouble average=Arrays.stream(array).average();
		System.out.println("sum:"+sum);
		System.out.println("average:"+average);

	}

}