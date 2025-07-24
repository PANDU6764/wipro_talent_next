package Strings;

import java.util.Scanner;

public class MoreStringsconcatenation{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		String a=sc.nextLine();
		System.out.print("Enter string:");
		String b=sc.nextLine();
		if(a.length()<b.length()) {
			System.out.println("concatenated string:" + a.concat(b).concat(a));
		}
		else {
			System.out.println("concatenated string:" + b.concat(a).concat(b));
		}
		
	}

}