import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("Given number is EVEN");
			}
			else {
				System.out.println("Given number is ODD");
			}
		}
		else {
			System.out.println("Given number is negative or zero!");
		}
		sc.close();
		

	}

}