
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
//				for(int i=n-1;i>=0;i--) {
//					System.out.println(i);
//				}sc.close();
				int rev=0;
				while(n !=0) {
					int digit =n% 10;
					rev=rev*10+digit;
					n=n/10;
					//System.out.println(rev);
				}
				System.out.println(rev);
				sc.close();
			}

	
		
	}
