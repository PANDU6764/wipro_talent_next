
package Strings;
import java.util.*;
public class mergeString {
	static String Merge(String str1,String str2) {
		StringBuilder result=new StringBuilder();
		int len_str1=str1.length();
		int len_str2=str2.length();
		int max=Math.max(len_str1, len_str2);
		for(int i=0;i<max;i++) {
			if(i<len_str1) {
				result.append(str1.charAt(i));
			}
			if(i<len_str2) {
				result.append(str2.charAt(i));
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1=");
		String str1=sc.nextLine();
		System.out.println("Enter String2=");
		String str2=sc.nextLine();
		String result=Merge(str1,str2);
		System.out.println("Result:"+result);
		
	}

}
