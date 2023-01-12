import java.awt.*;
import javax.swing.*;
public class testGUI extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	private JLabel lblLenght,lblWidth,lblArea,lblParimeter;
	private JTextField txtLenght,txtWidth,txtArea,txtParimeter;
	
	
	public testGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLenght = new JLabel("Enter the lenght : ");
		lblWidth = new JLabel("Enter the width : ");
		lblArea = new JLabel("Area : ");
		lblParimeter= new JLabel("Perimeter : ");
		
		//txtLenght = new JTextField(10);
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLenght);
		add(lblWidth);
		add(lblArea);
		add(lblParimeter);
	}
	
	
	

	public static void main(String[] args) {
		testGUI prog = new testGUI();

	}

}
