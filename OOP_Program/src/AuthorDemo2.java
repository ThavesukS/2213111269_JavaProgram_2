
import java.util.*;


public class AuthorDemo2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Author[] aut = new Author[4];
		
		for(int i = 0 ;i<aut.length;i++) {
			System.out.println("Information Author "+(i+1));
			i++;
			System.out.println("--------------------------------------------");
			System.out.println("Input author name : ");
			String name = scan.nextLine();
			System.out.print("Input author e-mail : ");
			String email = scan.nextLine();
			System.out.println("--------------------------------------------");
			aut[i] = new Author();
		}
		
		System.out.println();
		for(int i = 0; i<aut.length;i++) {
			System.out.println((i+1)+aut.ge);
		}

	}

}
