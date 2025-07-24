package Classes_Objects;
import java.util.*;
public class Question2 {
	public static class Calculator {
		public static int powInt(int num1,int num2) {
			return (int)Math.pow(num1,num2);
			
		}
		public static  double powDouble(double num1,int num2) {
			return Math.pow(num1,num2);
		}
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter integer num1:");
		int num1=sc.nextInt();
		
		System.out.print("enter integer num2:");
		int num2=sc.nextInt();
				
		int powInt=Calculator.powInt(num1,num2);
		double powDouble=Calculator.powDouble(num1,num2);
		
		System.out.println("powInt:"+powInt);
		System.out.println("powDouble:"+powDouble);

		
		

	}

}