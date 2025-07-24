package StringJoiners;
import java.util.*;
public class ArrayListTopic {

	public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("john");
	names.add("bob");
	names.add("raju");
	StringJoiner str=new StringJoiner(",", "{", "}");
	
	for(String name:names) {
		str.add(name);
	}
	System.out.println("Formatted Name:"+str);
	

	}

}