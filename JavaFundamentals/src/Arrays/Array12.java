package Arrays;

import java.util.*;

public class Array12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int result[]= {a[1],b[1]};
		//System.out.println("Middle Element: " +result[0] +" , "+result[1]);
		//(or)
		System.out.println(Arrays.toString(result));
sc.close();
	}

}