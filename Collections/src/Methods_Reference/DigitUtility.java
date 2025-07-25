package Methods_Reference;


@FunctionalInterface
interface DigitCounter {
 int countDigits(int n);  
}


public class DigitUtility {
 

 public static int digitCount(int n) {
     n = Math.abs(n); 
     if (n == 0) return 1; 
     int count = 0;
     while (n > 0) {
         count++;
         n /= 10;
     }
     return count;
 }

 
 public static void main(String[] args) {
     
     DigitCounter dc = DigitUtility::digitCount;

     
     int number = 123456;

     
     int digits = dc.countDigits(number);

     System.out.println("Number of digits in " + number + " is: " + digits);
 }
}

