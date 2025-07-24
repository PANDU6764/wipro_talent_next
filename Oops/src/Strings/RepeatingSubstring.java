package Strings;
import java.util.*;
public class RepeatingSubstring {
	static String generateCopies(String input) {
		int n=input.length();
		String firstTwo;
		if(n<2) {
			firstTwo=input;
		}
		else {
			firstTwo=input.substring(0,2);
		}
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<n;i++) {
			builder.append(firstTwo);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String input=sc.nextLine();
		String result=generateCopies(input);
		System.out.println("copied string:"+result);
	}

}