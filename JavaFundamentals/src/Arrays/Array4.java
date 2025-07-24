package Arrays;
import java.util.*;
@SuppressWarnings("unused")
public class Array4 {

	public static void main(String[] args) {
		int[] ascii_values= {65,66,67,68,69,70,71,72,73,74,75,76,78,79,80,81,82,83,84,85,86,87,88,89,90};
		for(int i=0;i<ascii_values.length;i++) {
			System.out.print(ascii_values[i]+" = "+(char)ascii_values[i] +"\t");
		}
	}

}