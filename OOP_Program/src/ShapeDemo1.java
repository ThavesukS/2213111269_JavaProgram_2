import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle Cir =new Circle(radius,null);
		System.out.println("Circle["+Cir+"]");
		System.out.println("Circle[area="+Cir.getArea()+"]");
		
		
		System.out.println();
		
		Cylinder Cyl =new Cylinder(radius,height);
		System.out.println("Cylinder["+Cyl+"]");
		System.out.println("Cylinder[area="+Cyl.getArea()+"]");
		System.out.println("Cylinder[volume="+Cyl.getVolume()+"]");
		


	}

}
