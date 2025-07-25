package List;
import java.util.*;
public class Vector7{
	static class Employee{
		int id;
		String name;
		double salary;
		Employee(int id,String name,double salary){
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public void display() {
			System.out.println("id : "+id+" name: "+name+" salary: "+salary);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> a=new Vector<>();
		a.add(new Employee(1, "Sunil", 5657));
		a.add(new Employee(2, "Uma", 4590));

		 // Using Iterator
		System.out.println("Using Iterator: ");
		Iterator<Employee> iterator=a.iterator();
		while(iterator.hasNext()) { //hasNext() checks if more elements exist.
			Employee e=iterator.next(); //next() gets the next element.
			e.display();
		}
		
		// Using Enumeration
		System.out.println("Using Enumeration: ");
		Enumeration<Employee> em=a.elements();
		while(em.hasMoreElements()) {
			Employee e=em.nextElement();
			e.display();
		}
	}

}
