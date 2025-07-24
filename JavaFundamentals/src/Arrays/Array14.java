package Arrays;
import java.util.*;
public class Array14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 9 integer number's: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n*m !=9) {
			System.out.println("Error: Please enter 9 integer number's: ");
			return;
		}
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given array is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		int max=arr[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}System.out.println("Maximum: "+max);
	}

}