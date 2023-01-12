import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.*;


public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculaterTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(10, 11, 92, 14);
		contentPane.add(lblNumber1);
		
		txtnumber1 = new JTextField();
		txtnumber1.setBounds(123, 8, 143, 20);
		contentPane.add(txtnumber1);
		txtnumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(10, 48, 92, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(122, 45, 144, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(307, 242, 70, 40);
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(10, 86, 70, 23);
		contentPane.add(lblOperator);
		
		final JComboBox chOparetor = new JComboBox();
		chOparetor.setBounds(123, 86, 67, 22);
		
		chOparetor.addItem("+");
		chOparetor.addItem("-");
		chOparetor.addItem("*");
		chOparetor.addItem("/");
		contentPane.add(chOparetor);
		
		JLabel rdbOparetor = new JLabel("How tpo show Digit");
		rdbOparetor.setBounds(10, 133, 103, 14);
		contentPane.add(rdbOparetor);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(123, 129, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(123, 155, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JLabel lblOptions = new JLabel("Option to show");
		lblOptions.setBounds(10, 193, 92, 14);
		contentPane.add(lblOptions);
		
		final JCheckBox chckDialogbox = new JCheckBox("Show Result to DialogBox");
		chckDialogbox.setBounds(104, 189, 162, 23);
		contentPane.add(chckDialogbox);
		
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(txtnumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOparetor.getSelectedItem();
					if(operator.equals("+"))
					sum=num1+num2;
					if(operator.equals("-"))
					sum=num1-num2;
					if(operator.equals("*"))
						sum=num1*num2;
					if(operator.equals("/"))
						sum=num1/num2;
					
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
					 frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						 frmNumber = new DecimalFormat("#,###.00");
						}
					
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chckDialogbox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+sum);
						
					}
				}
			}
		});
		btnOk.setBounds(104, 301, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(228, 301, 89, 23);
		contentPane.add(btnExit);
		
		
		
		
		
		
	}
}
