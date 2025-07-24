package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class Array5 {

	public static void main(String[] args) {
		int[] arr= {23,45,67,11,07,03,97};
		int min1=Integer.MAX_VALUE;int min2=Integer.MAX_VALUE;
		int max1=Integer.MIN_VALUE;int max2=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num<min1) {
				min2=min1;
				min1=num;
			}
			else if(num<min2) {
				min2=num;
			}
			if(num>max1) {
				max2=max1;
				max1=num;
			}else if(num>max2) {
				max2=num;
			}
		}
		System.out.println("smallest two numbers:"+min1+","+min2);
		System.out.println("largest two numbers:"+max1+","+max2);
		
	}

}