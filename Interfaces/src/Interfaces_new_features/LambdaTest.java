package Interfaces_new_features;

@FunctionalInterface
interface Test {
 int myFunction(int a, int b, int c);
}

public class LambdaTest {
 public static void main(String[] args) {
    
     Test t1 = (a, b, c) -> a + b + c;
    
     Test t2 = (a, b, c) -> a * b * c;

     int x = 2, y = 3, z = 4;
     
     System.out.println("Addition result (t1): " + t1.myFunction(x, y, z));     // 2 + 3 + 4 = 9
     System.out.println("Multiplication result (t2): " + t2.myFunction(x, y, z)); // 2 * 3 * 4 = 24
 }
}
