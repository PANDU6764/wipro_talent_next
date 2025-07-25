package List;
import java.util.ArrayList;

public class NumberListExample {
    public static void main(String[] args) {  
        ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(10);          
        numberList.add(15.75f);      
        numberList.add(20.5);        
        numberList.add(100L);       
        System.out.println("Contents of NumberList:");
        for (Number n : numberList) {
            System.out.println(n);
        }
    }
}

