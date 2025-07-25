package Methods_Reference;


@FunctionalInterface
interface PrimeChecker {
 PrimeClass check(int n);  
}


class PrimeClass {

 
 PrimeClass(int num) {
     if (isPrime(num)) {
         System.out.println(num + " is Prime");
     } else {
         System.out.println(num + " is Not Prime");
     }
 }


 private boolean isPrime(int n) {
     if (n <= 1) return false;
     for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) return false;
     }
     return true;
 }
}


public class ConstructorReferenceDemo {
 public static void main(String[] args) {

     
     PrimeChecker checker = PrimeClass::new;

     
     checker.check(29);  
 }
}

