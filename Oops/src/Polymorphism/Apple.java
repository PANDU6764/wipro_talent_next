package Polymorphism;

class Apple extends Fruit {
	Apple(String name, String taste, int size) {
		super(name, taste, size);
	}

	@Override
	void eat() {
		System.out.println("Name of the fruit:" + name);
		System.out.println("Taste of the fruit:" + taste);
	}
}