import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] number = { 25, 78, 41, 22, 36, 85, 37 };
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (CheckIndex(number, index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, agin:"));
		}

		String prevData = (prevData(number, index) != -1)
				? ("Previous data, nums" + "[" + (index - 1) + "]" + " is " + prevData(number, index))
				: ("No previous data");

		String nextData = (nextData(number, index) != -1)
				? ("Next data, nums" + "[" + (index + 1) + "]" + " is " + nextData(number, index))
				: ("No next data");

		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + index + "]" + currentData(number, index) + "\n" + prevData + "\n" + nextData);

	}

	public static boolean CheckIndex(int[] num, int index) {
		return index < 0 || index > (num.length - 1) ? true : false;
	}

	public static int currentData(int[] num, int index) {
		return num[index];
	}

	public static int prevData(int[] num, int index) {
		return index == 0 ? -1 : num[index - 1];
	}

	public static int nextData(int[] num, int index) {
		return index == num.length - 1 ? -1 : num[index + 1];

	}
}
