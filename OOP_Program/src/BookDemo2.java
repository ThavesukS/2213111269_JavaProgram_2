import java.awt.JobAttributes;

import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author email: ");
		
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		 Book1 book1 = new Book1(title,new Author1(name ,email) ,page);
		int confirm = JOptionPane.showConfirmDialog(null, "is the page correct?","Comfirm",JOptionPane.YES_NO_OPTION);
		if(confirm == 1) {
		 page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
		 book1.setPage(page);
		}
		
		JOptionPane.showMessageDialog(null, "Book title : "+book1.getTitle()+
				"\nAuthor name : "+book1.getAuthor().getName()+"("+book1.getPage()+"page)"+
				"\nAuthor e-mail: "+book1.getAuthor().getEmail());

	}

}
