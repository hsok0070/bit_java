package day15;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String [] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert 5.quit");
		
		Command list = () -> {
								System.out.println(" *** list ***");
							 };
		
		
		
		Command update = () -> {
								System.out.println(" *** update ***");
							   };
		
		Command delete = () -> {
								System.out.println(" *** delete ***");
							   };

		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println(" *** insert ***");
			}
		};
	
		switch (msg) {
		case "1":
			 list.exec();
			break;
		case "2":
			 update.exec();
			break;
		case "3":
			 delete.exec();
			break;
		case "4":
			 insert.exec();
			break;
		default:
			break;
		}
	

  }
}
