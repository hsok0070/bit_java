package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {
	public static void main(String[] args) {
		new UI_5().createUI();
		
		
	}

}

class UI_5 extends JFrame implements ActionListener { // Frame 상속
//	Frame f1;
	JButton red,blue,exit;
	TextField msg;
	TextArea output;
	
	
	Panel p1,p2;
//	ActionEvent a1;


	
	
//	UI_5(){
	void createUI() { // 생성자 함수에서 instance로 변경
		//new Frame("awt UI Test ~~");
		super.setTitle("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		
		p2 = new Panel();
	//	p2.setLayout(new GridLayout(1,2,20,20));
		p2.add(new JLabel("메세지창"));
		p2.add(msg = new TextField("input message"));
		add(p2,BorderLayout.NORTH);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

			
			
			red.addActionListener(this);
			blue.addActionListener(this);
			exit.addActionListener(this);
	
			
	
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
		case "RED":
			p1.setBackground(Color.red);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;
		case "종료":
			System.exit(0);
			default :
				break;
		}
		
	}
}



	
	
