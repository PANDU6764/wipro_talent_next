package Strings;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		String s=sc.nextLine();
		int n=s.length();
		String result=s.substring(1,n-1);
		System.out.println("Substring:"+result);
	}

}
