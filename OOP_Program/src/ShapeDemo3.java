import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cyl = new Cylinder[5];
		for (int i = 0; i < cyl.length; i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius"+(i+1)));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height"+(i+1)));
			
			cyl[i] = new Cylinder(radius,height);

		}
		

        JOptionPane.showMessageDialog(null, "Cylinder 1, [volume = " + cyl[0].getVolume() + "]"
                + "\nCylinder 2, [volume = " + cyl[1].getVolume() + "]"
                + "\nCylinder 3, [volume = " + cyl[2].getVolume() + "]"
                + "\nCylinder 4, [volume = " + cyl[3].getVolume() + "]"
                + "\nCylinder 5, [volume = " + cyl[4].getVolume() + "]");


	}

}
