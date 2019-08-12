package day23;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Savepoint;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp2 {
	static int number;
	
	public static void main(String [] args) {
		new Gui();
	}
	
}
class Gui extends JFrame {
	static int num = 0;
	BookMgr mgr;
	JButton insert,delete,list,search,exit ;
	TextField title,price;
	TextArea output;
	
	Gui(){
		mgr = new BookMgr();
		
		
		
		Panel p1 = new Panel();
		p1.add(insert = new JButton("INSERT"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(list = new JButton("LIST"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(exit = new JButton("EXIT"));
		
		add(p1,BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
		
		//p2.setLayout(new GridBagLayout(3,2));
		p2.add(new JLabel("제목"));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("가격"));
		p2.add(price = new TextField(20));
		add(p2,BorderLayout.NORTH);
		
		add(output = new TextArea(15,40));
		output.setFont(new Font(null,1,20));
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		delete.addActionListener(e -> {
			mgr.delete(getTitle());
		});
		insert.addActionListener(e -> {
			mgr.add(new Book(title.getText(),Integer.parseInt(price.getText())));
			
		});
		
		exit.addActionListener(e -> {
			mgr.save();
			System.exit(0);
		});
		
		list.addActionListener(e -> {
			output.setText("Book List \n");
			mgr.getBookList().forEach(i -> {
				output.append(i+ "\n");

			});
			
		});
		
		
	
	
	}
//	class AutoSave implements Runnable{
//		BookMgr mgr;
//
//		@Override
//		public void run() {
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			mgr.save();
//		}
//	}

}

	
		
	

	
