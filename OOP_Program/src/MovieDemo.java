import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Input movie id :");
		String id = scan.nextLine();
		System.out.print("Input movie name :");
		String Moviename = scan.nextLine();
		System.out.println();
		
		System.out.print("Input director name :");
		String name = scan.nextLine();
		System.out.print("Input director e-mail :");
		String email = scan.nextLine();
		System.out.print("Input director gender : ");
		char gender = scan.next().toUpperCase().charAt(0);
		while(gender != 'F'&&gender != 'M') {
			System.out.print("Input director gender,again : ");
			gender = scan.next().toUpperCase().charAt(0);
		}
		System.out.println();
		
		
		System.out.print("Input movie theater no. :");
		int numTheater = scan.nextInt();
		while(numTheater <1||numTheater>15) {
			System.out.print("Please input 1 - 15 only : ");
			numTheater = scan.nextInt();
		}
		System.out.println();
		
		
		Theater theater = new Theater(id,Moviename,new Director(name,email,gender),numTheater);
		System.out.println(theater);



	}

}
