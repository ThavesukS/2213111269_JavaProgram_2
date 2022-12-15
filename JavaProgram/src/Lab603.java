import java.util.*;

public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberofInteger = { 78, 36, 58, 41, 25, 92, 75 };

		System.out.print("Input index of array : ");
		int indexofArray = scan.nextInt();
		while (indexofArray < 0 || indexofArray < (numberofInteger.length - 1)) {
			System.out.print("Input index of array, again : ");
			indexofArray = scan.nextInt();
		}

		System.out.println();
		System.out.println("Value in current index is " + (numberofInteger[indexofArray]));
		// System.out.println("Value in next current index is
		// "+(numberofInteger[indexofArray+1]));
		if (indexofArray==(numberofInteger.length-1)) {
			System.out.println("Sorry " + indexofArray + " is the last index in array.");
		} else {
			System.out.println("Value in next current index is " + (numberofInteger[indexofArray + 1]));
		}

	}

}
