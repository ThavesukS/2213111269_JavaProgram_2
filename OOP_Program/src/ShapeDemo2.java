import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Cylinder[] cyl = new Cylinder[5];
		for (int i = 0; i < cyl.length; i++) {
			System.out.print("Enter radius "+(i+1)+" : ");
			double radius = scan.nextDouble();
			System.out.print("Input height "+(i+1)+" : ");
			double height = scan.nextDouble();
			
			cyl[i] = new Cylinder(radius,height);

		}
		
		for (int i = 0; i < cyl.length; i++) {
			System.out.println("Cylider "+(i+1)+", volume = "+cyl[i].getVolume());
			
		}

	}
}
