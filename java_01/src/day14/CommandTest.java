package day14;

import javax.swing.JOptionPane;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null;
		//String key = "";
		String key = JOptionPane.showInputDialog("list/delete/insert/update 중 하나 입력");
		switch (key) {
		case "list":
			cmd = new ListCommand();
			break;
		case "Delete":
			cmd = new DeleteCommand();
			break;
		case "Insert":
			cmd = new InsertCommand();
			break;
		case "Update":
			cmd = new UpdateCommand();
			break;
		default:
			break;
		}
		cmd.exec();
		cmd.check();
	}

}
