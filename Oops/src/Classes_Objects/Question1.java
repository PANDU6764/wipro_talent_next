
package Classes_Objects;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter height:");
		double height=sc.nextDouble();
		
		System.out.print("Enter width:");
		double width=sc.nextDouble();
		
		System.out.print("Enter depth:");
		double depth=sc.nextDouble();
		
		Box mybox =new Box(height,width,depth);
		double volume=mybox.calculate_volume();
		System.out.print("volume:"+volume);
		sc.close();

		
	}

}

class Box{
	double height;
	double width;
	double depth;
	
	public Box(double height,double width,double depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public double calculate_volume(){
		double volume=height*width*depth;
		return volume;
	}
	
}
