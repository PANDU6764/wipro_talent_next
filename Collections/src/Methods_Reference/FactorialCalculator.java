package Methods_Reference;


@FunctionalInterface
interface MyFunctionalInterface {
 int compute(int n);  
}


public class FactorialCalculator {

 public int factorial(int n) {
     if (n < 0) return -1;
     int result = 1;
     for (int i = 2; i <= n; i++) {
         result *= i;
     }
     return result;
 }

 public static void main(String[] args) {
     
     FactorialCalculator obj = new FactorialCalculator();

     
     MyFunctionalInterface mf = obj::factorial;

    
     int number = 5;
     int result = mf.compute(number);

     System.out.println("Factorial of " + number + " is: " + result);
 }
}

