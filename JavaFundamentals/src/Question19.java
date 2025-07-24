
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int temp=n;
				int sum=0;
				for(int i=0;i<=n;i++) {
					int rem = n%10;
				    sum=sum*10+rem;
					n=n/10;
				}
				if(sum==temp) {
					System.out.println(temp +" is a palindrome");
				}else {
					System.out.println(temp+" is not a palindrome");
				}sc.close();

			}	
	}
