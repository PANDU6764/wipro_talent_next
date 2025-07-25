package List;
import java.util.LinkedList;

public class NumberLinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<Number> numberList = new LinkedList<>();
        numberList.add(25);           
        numberList.add(42.5f);        
        numberList.add(99.99);       
        numberList.add(100L);        
        System.out.println("Contents of NumberLinkedList:");
        for (Number n : numberList) {
            System.out.println(n);
        }
    }
}
