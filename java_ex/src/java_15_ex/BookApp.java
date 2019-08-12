package java_15_ex;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookApp {
	static int number;
	
	public static void main(String [] args) {
		new Gui();
	}
	
}
class Gui extends JFrame {
	static int num = 0;
	BookManager mgr;
	JButton insert,select,delete,list,search,exit ;
	TextField title,price,isbn;
	TextArea output;
	
	Gui(){
		mgr = new BookManager();
		
		Panel p1 = new Panel();
		p1.add(insert = new JButton("INSERT"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(list = new JButton("LIST"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(exit = new JButton("EXIT"));
		
		add(p1,BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
		
		//p2.setLayout(new GridBagLayout(3,2));
		p2.add(new JLabel("ISBN"));
		p2.add(isbn = new TextField(20));
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
		
		list.addActionListener(
			e ->  { output.setText(" *** Book list ***\n");
			mgr.bookList().forEach(i-> output.append(i+"\n"));
			});
		
		insert.addActionListener(
				e -> {
				int p = 0;
				try {
				p = Integer.parseInt(price.getText());
				}catch (Exception e1) {
					output.setText(" Book 등록 실패 \n");
					output.append("가격에 문자가 포함되면 안됩니다. \n");
					output.append(e1.getMessage());
					return;
				
				}
				
				boolean b = mgr.addBook(new Book(++num,title.getText(),p));
				if(b) {
					output.setText("등록 성공");
				}else {
					output.setText("등록 실패");
				}
				}
				);
				
		delete.addActionListener(
				e -> {
				int p = 0;
				try {
				p = Integer.parseInt(price.getText());
				}catch (Exception e2) {
					output.setText(" Book 등록 실패 \n");
					output.append("가격에 문자가 포함되면 안됩니다. \n");
					output.append(e2.getMessage());
					return;
				
				}
				
				boolean b = mgr.DeleteBook(title.getText(),p);
				if(b) {
					output.setText("삭제 성공");
				}else {
					output.setText("삭제 실패");
				}
				}
				);
		
		search.addActionListener(
//				(e) -> {
//					
//				}
//			
//			);
				e ->  { output.setText(" *** Book Search ***\n");
				mgr.searchTitleBook(getTitle()).forEach(i-> output.append(i+"\n"));
				});
	
		exit.addActionListener(e -> System.exit(0));
		

	}
}
	
		
	

	
