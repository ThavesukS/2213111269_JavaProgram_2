import java.io.*;
import java.text.*;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking (String accountNumber,String password , int money) {
		super(accountNumber,password);
		this.money=0;
		
	}
	
	public boolean checkBookBank()throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		String[] data = temp.split(" ");
		money = Integer.parseInt(data[2]);
		
		return true;
		
	}
	
	public void show() {
		
	}

}
