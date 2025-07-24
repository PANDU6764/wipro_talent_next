
package Polymorphism;

import java.util.*;

@SuppressWarnings("unused")
public class Fruit {
	String name;
	String taste;
	int size;

	Fruit(String name, String taste, int size) {
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	void eat() {
		System.out.println("name of the fruit:" + name);
		System.out.println("taste of the fruit" + taste);
	}
}
