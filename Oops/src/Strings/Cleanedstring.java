package Strings;
import java.util.*;
public class Cleanedstring {
	static String cleanString(String str) {
		StringBuilder Final_String=new StringBuilder();
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='*') {
				continue;
			}
			if(i<len-1 && str.charAt(i+1)=='*') {
				continue;
			}
			if(i>0 && str.charAt(i-1)=='*') {
				continue;
			}
			Final_String.append(str.charAt(i));
		}
		return Final_String.toString();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String Final_String=cleanString(str);
		System.out.println("Final_String:"+Final_String);
		sc.close();

	}

}