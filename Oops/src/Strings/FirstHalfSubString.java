package Strings;

import java.util.*;

public class FirstHalfSubString {
	static String FirstHalf(String input) {
		if (input.length() % 2 == 0) {
			return input.substring(0, input.length() / 2);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = sc.nextLine();
		String result = FirstHalf(input);
		System.out.println("First half of the string:" + result);

	}
}