
package Arrays;
import java.util.*;
public class Array3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of the array:");
		int size= sc.nextInt();
		//System.out.println("Enter array values:");
		int[] array=new int[size];
		System.out.print("Enter "+size+ " elements:");
		//To store values in array
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("Enter search value:");
		int search_element=sc.nextInt();
		boolean found=false;
		for(int arr:array) {
			if(arr==search_element) {
				found=true;
				break;
			}			
		}
		if(found) {
			System.out.println(search_element + " is present in array 😍");
		}
		else {
			System.out.println("-1");
		}
		
	}

	
}
