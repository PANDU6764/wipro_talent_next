package Inheritance;

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee name:");
		String name = sc.nextLine();

		System.out.print("joining date:");
		int join_year = sc.nextInt();

		System.out.print("Enter Annual salary:");
		double Annual_salary = sc.nextDouble();
		
		sc.nextLine();

		System.out.print("Enter National insurance number:");
		String National_Insurance_number = sc.nextLine();

		Employee emp = new Employee(name,Annual_salary,join_year, National_Insurance_number);

		System.out.println("--------Employee details--------");
		System.out.println(emp);

		sc.close();

	}

}