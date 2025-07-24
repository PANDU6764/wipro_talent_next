package Arrays;

import java.util.*;

public class Array13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 4 integer number's: ");
		int n=sc.nextInt();
		if(n !=4) {
			System.out.println("Error: Please enter 4 integer number's: ");
			
		}
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}System.out.println("The given array is: ");
		System.out.println(arr[0]+" "+arr[1]);
		System.out.println(arr[2]+" "+arr[3]);
		//Reverse
		System.out.println("The reverse of the array is: ");
		System.out.println(arr[3]+" "+arr[2]);
		System.out.println(arr[1]+" "+arr[0]);
		sc.close();
	}

}