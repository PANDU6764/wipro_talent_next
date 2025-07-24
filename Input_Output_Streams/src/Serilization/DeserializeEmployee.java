package Serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
 public static void main(String[] args) {
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
         Employee emp = (Employee) ois.readObject();
         System.out.println("Deserialized Employee object:");
         System.out.println(emp);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}

