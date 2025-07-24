package Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] array= {10,20,47,32,11,53};
		 int min=array[0];
		 int max=array[0];
		 for(int arr:array) {
			 if(arr<min) {
				 min=arr;
			 }
			 if(arr>max) {
				 max=arr;
			 }
		 }
		 System.out.println("Min:"+min);
		 System.out.println("Max:"+max);
	}

}