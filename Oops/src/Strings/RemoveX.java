package Strings;
import java.util.*;
public class RemoveX {
	public static String removeX(String str) {
		int len=str.length();
		if(len==0) {
			return str;
		}
		if(str.charAt(0)=='x') {
			str=str.substring(1);
			len--;
		}
		if(len>0 && str.charAt(len-1)=='x') {
			str=str.substring(0,len-1);	
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String result=removeX(str);
		System.out.println("Result:"+result);
		sc.close();
	}

}
