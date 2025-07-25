package List;
import java.util.Vector;

public class NumberVectorExample {
    public static void main(String[] args) {
        
        Vector<Number> numberVector = new Vector<>();

        numberVector.add(10);           
        numberVector.add(25.75f);       
        numberVector.add(99.99);       
        numberVector.add(1000L);      
        System.out.println("Contents of NumberVector:");
        for (Number number : numberVector) {
            System.out.println(number);
        }
    }
}
