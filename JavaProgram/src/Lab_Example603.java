import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("input number " + (i + 1) + " : ");
			num[i] = scan.nextInt();
		}

		System.out.println();

		int totalNumber = sumOfPos(num);
		System.out.println("Summation of positive number is " + totalNumber);

	}

	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _number : nums) {
			sum += _number;
		}
		return sum;
	}

}
