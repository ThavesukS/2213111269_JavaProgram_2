import java.util.*;

public class BookDemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Book bk = new Book();
		
		System.out.print("Input book title : ");
		bk.setTitle(scan.nextLine());
		System.out.print("Input book price : ");
		bk.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		bk.setPublishyear(scan.nextInt());
		System.out.println();
		System.out.println(bk.toString());



	}

}
