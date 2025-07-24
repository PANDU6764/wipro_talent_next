
import java.util.*;
public class Question4b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean isTrue = lastDigit(num1,num2);
		System.out.println(isTrue);
		sc.close();
		}
	
	static boolean lastDigit(int num1,int num2) {
		return (num1%10) == (num2%10);
		}		
}
