package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java_15_ex.Book;
import java_15_ex.BookManager;

public class BookTest {
	public static void main(String[] args) {
		new UI_6().createUI();
		new Book();
	}

}

class UI_6 extends JFrame implements ActionListener { // Frame 상속
//	Frame f1;
	JButton insert,select,delete,list,exit;
	TextField msg;
	TextArea output;
	
	BookManager bm = new BookManager();
	
	Panel p1,p2;
//	ActionEvent a1;


	
	
//	UI_5(){
	void createUI() { // 생성자 함수에서 instance로 변경
		//new Frame("awt UI Test ~~");
		super.setTitle("awt UI Test ~~");
		p1 = new Panel();
		p1.add(insert = new JButton("등록"));
		p1.add(select = new JButton("검색"));
		p1.add(delete = new JButton("삭제"));
		p1.add(list = new JButton("리스트"));
		
		p2 = new Panel();
	//	p2.setLayout(new GridLayout(1,2,20,20));
		p2.add(new JLabel("책이름 가격"));
		p2.add(msg = new TextField("input message"));
		add(p2,BorderLayout.NORTH);
		
		
		
		msg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText()+"\n");
				msg.setText("");
			}
		});
		
		add(output = new TextArea(15, 40));
		
		output.setFont(new Font(null, 0, 24));
			add(p1,BorderLayout.SOUTH);
			setSize(300,300);
			setVisible(true);

			
			
			insert.addActionListener(this);
			select.addActionListener(this);
			delete.addActionListener(this);
			list.addActionListener(this);
			exit.addActionListener(this);
	
			
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			f1.addWindowListener(new WindowEventP());
//			addWindowListener(new WindowAdapter() {
//				public void windowClosing(WindowEvent e) {
//					setVisible(false);
//					dispose();
//					System.exit(0);
//				}
//				});
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			// 위 Frame 기능을 JFrame에서 표현하는 방식. JFrame 에서는 둘다 사용 가능. 
	
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent 발생");
		System.out.println(e.getActionCommand());
		
//		red.setBackground(Color.RED);
//		blue.setBackground(Color.BLUE);
		
		switch (e.getActionCommand()) {
		case "insert":
			p1.setBackground(Color.red);
			break;
		case "select":
			p1.setBackground(Color.BLUE);
			break;
		case "delete":
			p1.setBackground(Color.DARK_GRAY);
			break;
		case "list":
			p1.setBackground(Color.GREEN);
		case "종료":
			System.exit(0);
			default :
				break;
		}
		
		
	}
//	@Override
//	public void DeleteBook(String title) {
//		Iterator<Book> it = list.iterator();
//		while (it.hasNext()) {
//			Book data = it.next();
//			if(data.getTitle().equals(title)) {
//				System.out.println(data+" => 삭제 됩니다.");
//				it.remove();
//				
//			}
//		}
//	}
}

