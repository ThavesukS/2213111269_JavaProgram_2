import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.println("INPUT INFOMATION OF STUDENT "+(i+1));
			System.out.println("---------------------------------------------");
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}

		/*
		 * /System.out.println(); System.out.println("LIST OF PASS STUDENT (>=50)");
		 * System.out.println("------------------------------------");
		 * 
		 * for(int i=0 ;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+"("+std[i].getScore()+")"); } }
		 */
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade(STD.getScore()));
			}

		}

	}
}
