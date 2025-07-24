import java.util.*;
@SuppressWarnings("unused")
public class Question14 {

	public static void main(String[] args) {
		
		        for (int num = 2; num <= 100; num++) {
		            int count = 0;

		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    count++;
		                    break;
		                }
		            }

		            if (count == 0) {
		                System.out.print(num + "\t");
		            }
		        }
		    }
		

	}