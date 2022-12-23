import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("##,###.00");
		Product[] product = new Product[4];
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
			System.out.print("Input product Id : ");
			product[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			product[i].setUnit(scan.nextInt());
			System.out.print("Input product Price  : ");
			product[i].setPrice(scan.nextDouble());
			System.out.println();
			while(product[i].getPrice()<0) {
				System.out.print("Input product Price  : ");
				product[i].setPrice(scan.nextDouble());
			}

		}
		double sum=0;
		
		System.out.println("----------------------------------------------------------");
		for (Product Pro : product) {
			
				System.out.println("Product ID : " + Pro.getId() + ", Total price = " + df.format(Pro.calculate())+" baht.");
				
				 sum+=Pro.calculate();
			}
		System.out.println("----------------------------------------------------------");
		System.out.println("Total price of all product is "+df.format(sum)+" baht.");

		}

	}


