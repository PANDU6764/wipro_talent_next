package StringJoiners;
import java.util.*;
public class MergeTwoStrings {

	public static void main(String[] args) {
		StringJoiner str1=new StringJoiner("-","[","]");
		str1.add("john");
		str1.add("mark");
		StringJoiner str2=new StringJoiner("-","[","]");
		str2.add("raj");
		str2.add("kumar");
		StringJoiner merged=new StringJoiner("-", "[", "]");
		merged.merge(str2);
		merged.merge(str1);
		System.out.println("merged:"+merged);
		StringJoiner merged2=new StringJoiner("-", "[", "]");
		merged2.merge(str1);
		merged2.merge(str2);
		System.out.println("merged2:"+merged2);
		

	}

}