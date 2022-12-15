import javax.swing.*;
public class Lab_Example602_2 {

	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean found = false;
	public static void main(String[] args) {
		String inputdeptname = JOptionPane.showInputDialog("Enter a department name");
		for(int i=0;i<deptName.length;i++) {
			if (inputdeptname.equalsIgnoreCase(deptName[i])) {
				found=true;
			}
		}
		
		if(found) {
			JOptionPane.showMessageDialog(null, inputdeptname+"was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, inputdeptname+"was not found in the list");
		}

	}

}
