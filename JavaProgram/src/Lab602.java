import java.util.*;
public class Lab602 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] inputscore = new double[5];
		double sum=0;
		double averageNumber=0;
		
		for(int i = 0 ;i<inputscore.length;i++) {
			System.out.print("input score of student "+(i+1)+" : ");
			inputscore[i]=scan.nextDouble();
			sum+=inputscore[i];
		}
		
		System.out.println();
		averageNumber = sum/(inputscore.length);
		System.out.println("Average of "+inputscore.length+" student is "+averageNumber);
		
		for(int i = 0 ;i<inputscore.length;i++) {
			if(inputscore[i]>averageNumber) {
				System.out.println("student "+(i)+" ("+inputscore[i]+")");
			}
		}
	}

}
