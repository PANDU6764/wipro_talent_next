package Polymorphism;

import java.util.Scanner;

public class TestFruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------Enter Apple Details---------");

		System.out.println("Enter name of the fruit:");
		String Apple_name = sc.nextLine();

		System.out.println("Enter taste of the fruit :");
		String Apple_taste = sc.nextLine();

		System.out.println("Enter size of the fruit:");
		int Apple_size = sc.nextInt();
		sc.nextLine();

		Apple apple = new Apple(Apple_name, Apple_taste, Apple_size);

		System.out.println("-----------Enter Orange Details---------");

		System.out.println("Enter name of the fruit:");
		String Orange_name = sc.nextLine();

		System.out.println("Enter taste of the fruit:");
		String Orange_taste = sc.nextLine();

		System.out.println("Enter size of the fruit:");
		int Orange_size = sc.nextInt();

		Orange orange = new Orange(Orange_name, Orange_taste, Orange_size);

		System.out.println("\n-----Displaying Apple details------");
		apple.eat();

		System.out.println("\n----Displaying Orange details-----");
		orange.eat();

		sc.close();

	}

}