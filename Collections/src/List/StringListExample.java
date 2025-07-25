package List;
import java.util.ArrayList;
import java.util.Iterator;

public class StringListExample {

    public static void printAll(ArrayList<String> list) {
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
     
        ArrayList<String> stringList = new ArrayList<>();

        
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        
        System.out.println("Printing all elements:");
        printAll(stringList);
    }
}

