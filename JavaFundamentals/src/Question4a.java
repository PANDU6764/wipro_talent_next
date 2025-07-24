
import java.util.*;
public class Question4a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Num: "+num);
		if(num>0) {
			System.out.println("Given integer is positive!..");
		}
		else if(num<0) {
			System.out.println("Given integer is Negative!..");
		}
		else {
			System.out.println("Given number is zero..");
		}
		sc.close();
		
	}

}
