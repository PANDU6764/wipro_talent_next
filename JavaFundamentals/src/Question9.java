import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(Character.isLetter(ch)) {
			if(Character.isLowerCase(ch)) {
				char upper=Character.toUpperCase(ch);
				System.out.println("upper:"+upper);
			}
			else{
				char lower=Character.toLowerCase(ch);
				System.out.println("lower:"+lower);
			}
		}
		else {
			System.out.println("given is not an Alphabet");
		}
		sc.close();
	}

}