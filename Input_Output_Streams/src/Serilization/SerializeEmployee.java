package Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {
 @SuppressWarnings("deprecation")
public static void main(String[] args) {
     Employee emp = new Employee("Chaitanya", new Date(2002-1900, 5, 15), "IT", "Developer", 75000.0);

     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
         oos.writeObject(emp);
         System.out.println("Employee object has been serialized to 'data'");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

