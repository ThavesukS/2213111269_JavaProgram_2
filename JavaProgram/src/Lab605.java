import javax.swing.*;

public class Lab605 {


	public static void main(String[] args) {
		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
		
		number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " :"));
		}

		ShowEven(number);
		ShowOdd(number);

	}

	public static void ShowEven(int[] num) {
		String even = " ";
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				//even = even + num[i];
				even += num[i] + " ";
			}

		}
		JOptionPane.showMessageDialog(null, "list of even number:\n" + even);
	}

	public static void ShowOdd(int[] num) {
		String odd = " ";
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				odd = odd + num[i] ;
				odd += " ";
			}

		}
		JOptionPane.showMessageDialog(null, "list of odd number:\n" + odd);
	}

}
