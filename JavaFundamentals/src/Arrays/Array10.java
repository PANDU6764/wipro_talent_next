
package Arrays;

import java.util.*;

public class Array10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				res[index++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				res[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
		sc.close();
	}

}
