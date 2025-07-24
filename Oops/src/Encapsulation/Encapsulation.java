package Encapsulation;

import java.util.Scanner;

public class Encapsulation {
	// Author class
	public static class Author {
		private String name;
		private String email;
		private char gender;

		// constructor
		public Author(String name, String email, char gender) {
			this.name = name;
			this.email = email;
			this.gender = gender;
		}

		// getter and setter methods to access and store the data
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public char getGender() {
			return gender;
		}

		public void setEmail(char gender) {
			this.gender = gender;
		}

		// to display Author info line by line and overrides the toString()
		public String toString() {
			return "Author name:" + name + "\n"
					+"Email:" + email + "\n"
					+"Gender:" + gender;
		}
	}

	// book class
	public static class Book {
		private String name;
		private Author author;
		private double price;
		private int qtyInstock;

		// constructor
		public Book(String name, Author author, double price, int qtyInstock) {
			this.name = name;
			this.author = author;
			this.price = price;
			this.qtyInstock = qtyInstock;
		}
		//getter and setter methods
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQtyInstock() {
			return qtyInstock;
		}

		public void setQtyInstock(int qtyInstock) {
			this.qtyInstock = qtyInstock;
		}

		// to display info line by line and calling toString()
		public String toString() {
			return "Book name:" + name + "\n"
					+ "price:Rs." + price + " per each" + "\n"
					+"QtyIStock:" + qtyInstock + "\n" 
					+ author.toString();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Enter author details----");

		System.out.print("Author name:");
		String name = sc.nextLine();

		System.out.print("Author email:");
		String email = sc.nextLine();

		System.out.print("Gender:");
		char gender = sc.next().charAt(0);
		//author object
		Author author = new Author(name, email, gender);

		sc.nextLine();
		
		System.out.println("-----Enter Book details----");

		System.out.print("enter book name:");
		String Book_Name = sc.nextLine();

		System.out.print("enter price:");
		double Book_price = sc.nextDouble();

		System.out.print("enter quantity:");
		int Book_quantity = sc.nextInt();
		//book object
		Book book = new Book(Book_Name,author,Book_price,Book_quantity);
		//to display book details
		System.out.println("\n-----BOOK DETAILS----");
		System.out.println(book);
		sc.close();

	}

}