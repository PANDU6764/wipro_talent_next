package Strings;
import java.util.*;
public class CheckPalindromeOrNot {
	public static void main(String[] args) {
		/*Palindrome in strings  means string to be same,
		 * when we read it from left to right and right to left
		 * E.g:madam,eye,level etc....
		 */
		// scanner class for user input
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string:");
		String input=sc.nextLine();
		String cleanedInput=input.replaceAll("\\s+", "").toLowerCase();
		String reverse=new StringBuilder(cleanedInput).reverse().toString();
		if(cleanedInput.equals(reverse)) {
			System.out.println(input+" is a palindrome");
		}
		else {
			System.out.println(input+" is not a palindrome");
		}
		
		
		
		
		
	}

}
