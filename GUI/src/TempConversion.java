import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame {
	
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 150;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;
	
	private JTextField tfCelsius;
	private JTextField tfFahrenheit;
	
	public TempConversion() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		lblCelsius = new JLabel("Temp in Clesius : ");
		lblFahrenheit = new JLabel("Temp in Fahrenheit : ");
		 tfCelsius = new JTextField(10);
		 tfFahrenheit = new  JTextField(10);
		 c.add(lblCelsius);
		 c.add(tfCelsius);
		 c.add(lblFahrenheit);
		 c.add(tfFahrenheit);
		 
		 CelsHandler  celsiusHandler = new CelsHandler();
		 tfCelsius.addActionListener(celsiusHandler);
		 
		 FahHandler  fahHandler = new FahHandler();
		 tfCelsius.addActionListener(celsiusHandler);
		
		setTitle("Conversion Temp");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheith;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenheith = celsius * CTOF+OFFSET;
			tfFahrenheit .setText(String.format("%.2f",fahrenheith));
			
		}
	}
	
	private class FahHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheith;
			fahrenheith = Double.parseDouble(tfFahrenheit.getText());
			celsius = (fahrenheith-OFFSET) * FTOC;
			tfFahrenheit .setText(String.format("%.2f",fahrenheith));
			
		}
	}
	
	

	public static void main(String[] args) {
		TempConversion tempCov = new TempConversion();

	}

}
