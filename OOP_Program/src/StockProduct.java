import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] product = new Product[4];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
			System.out.print("Input product Id : ");
			product[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			product[i].setUnit(scan.nextInt());
			System.out.print("Input product Price  : ");
			product[i].setPrice(scan.nextDouble());

		}

	}

}
