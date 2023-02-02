import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product1 me = new Product1();
		
		int button = JOptionPane.showConfirmDialog(null, "Is the progarm run on Pattanakarn Branch?");
		if(button==0) {
			me = new PattanakarnBranch();
		}
		
		
		
		
		
		
		
		me.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, me);
		

	}

}
