import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		System.out.println("character1:"+ch1);
		System.out.println("character2:"+ch2);
		if(ch1<ch2) {
			System.out.println(ch1 +","+ ch2);
		}
		else {
			System.out.println(ch2 +","+ ch1);
		}
		sc.close();
	}

}