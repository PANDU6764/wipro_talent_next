package Strings;
import java.util.*;
public class Concatenation {
	public static String concate(String str1,String str2){
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
			return str1.concat(str2.substring(1));
		}
		else {
			return str1.concat(str2);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String:");
		String first=sc.nextLine();
		System.out.println("Enter second String:");
		String second=sc.nextLine();
		String result= concate(first,second);
		System.out.print("concatenated string:"+result);
	}
}
