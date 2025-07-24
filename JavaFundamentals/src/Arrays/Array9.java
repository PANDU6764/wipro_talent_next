package Arrays;
import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in the array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] updated_arr=new int[size];
		int index=0;
		for(int i=0;i<size;i++) {
			if(arr[i]!=10) {
				updated_arr[index]=arr[i];
				index++;
			}
		}
		System.out.print("updated_array:");
		for(int num:updated_arr) {
			System.out.print(num+" ");
		}
	}

}