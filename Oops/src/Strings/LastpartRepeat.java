package Strings;
import java.util.*;
public class LastpartRepeat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("Enter Integer:");
		int num=sc.nextInt();
		
		String sub=str.substring(str.length()-num);
		
		String result="";
		
		for(int i=0;i<num;i++) {
			result+=sub;
		}
		System.out.println("Result:"+result);
		sc.close();
	}

}
