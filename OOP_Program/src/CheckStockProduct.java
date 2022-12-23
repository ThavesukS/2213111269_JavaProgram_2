import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		Product[] product = new Product[size];
		System.out.println();
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
			System.out.print("Input product Id : ");
			product[i].setId(scan.next());
			System.out.print("Input product unit : ");
			product[i].setUnit(scan.nextInt());

			System.out.println();
		}
		System.out.println();

		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------------------");
		for (Product Pro : product) {
			if (Pro.status(Pro.getUnit(), Pro.getId())=="Low") {
				System.out.println(">> " + Pro.getId() + " has " + Pro.getUnit() + " units");
			}
		}

		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------------------");
		for (Product Pro : product) {
			if (Pro.status(Pro.getUnit(), Pro.getId())=="Normal") {
				System.out.println(">> " + Pro.getId() + " has " + Pro.getUnit() + " units");
			}
		}

		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------------------");
		for (Product Pro : product) {
			if (Pro.status(Pro.getUnit(), Pro.getId())=="High") {
				System.out.println(">> " + Pro.getId() + " has " + Pro.getUnit() + " units");
			}
		}
	}

}
