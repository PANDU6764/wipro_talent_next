package Arrays;
import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter "+size+" numbers:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		boolean skip=false;
		for(int num:arr) {
			if(num==6) {
				skip=true;
				continue;
			}
			if(skip && num==7) {
				skip=false;
				continue;
			}
			if(!skip) {
				sum+=num;
			}
		}
		System.out.println("sum(except 6 and 7):"+sum);
		
	}

}