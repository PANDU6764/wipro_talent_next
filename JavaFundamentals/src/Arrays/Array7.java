
package Arrays;
import java.util.*;
public class Array7 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,20,30,40};
		int[] unique=Arrays.stream(arr).distinct().toArray();
		System.out.print("unique_array:");
		for(int num:unique) {
			System.out.print(num+" ");
		}
	}

}
