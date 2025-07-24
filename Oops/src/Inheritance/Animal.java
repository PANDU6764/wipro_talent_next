package Inheritance;

import java.util.*;

@SuppressWarnings("unused")
public class Animal {
	public void eat() {
		System.out.println("it prints animal eat action");
	}

	public void sleep() {
		System.out.println("it prints animal sleep action");
	}

}

class Bird extends Animal {
	// override because same methods are writing in different class
	public void eat() {
		System.out.println("it prints bird eat action");
	}

	// override because same methods are writing in different class
	public void sleep() {
		System.out.println("it prints bird sleep action");
	}

	// new method
	public void fly() {
		System.out.println("it prints bird fly action");
	}
}
class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("-----Animal objects------");
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		System.out.println("-----Bird objects------");
		bird.eat();
		bird.sleep();
		bird.fly();

	}
}