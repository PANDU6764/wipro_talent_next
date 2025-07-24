
package Polymorphism;

import java.util.*;

@SuppressWarnings("unused")
public class Testshape {
	static class Shape {
		void draw() {
			System.out.println("Drawing shape");
		}

		void erase() {
			System.out.println("Erasing shape");
		}
	}

	static class Circle extends Shape {
		void draw() {
			System.out.println("Drawing Circle");
		}

		void erase() {
			System.out.println("Erasing Circle");
		}
	}

	static class Triangle extends Shape {
		void draw() {
			System.out.println("Drawing Triangle");
		}

		void erase() {
			System.out.println("Erasing Trianagle");
		}
	}

	static class Square extends Shape {
		void draw() {
			System.out.println("Drawing Square");
		}

		void erase() {
			System.out.println("Erasing Square");
		}

	}

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();

		System.out.println("-----Circle outputs------");
		circle.draw();
		circle.erase();
		
		System.out.println("-----Triangle outputs------");
		triangle.draw();
		triangle.erase();

		System.out.println("-----Square outputs------");
		square.draw();
		square.erase();
	}
}
