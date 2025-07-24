package Arrays;
import java.util.Scanner;

public class Array11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean a=Number(arr);
		System.out.println(a);
		sc.close();

	}
	public static boolean Number(int[] array) {
		for(int i=0;i<array.length;i++) {
			if(array[i] !=1) {
				if(array[i] !=4) return false;
			}
		}return true;
	}
}