package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test01 {
	public static void main(String[] args) {
		new UI_1();
		
		
	}

}

class UI_1 {
	Frame f1;
	Button red,blue,exit;
	Panel p1;
	ActionEvent a1;
	
	UI_1(){
		f1 = new Frame("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("REA"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		
			f1.add(p1,BorderLayout.SOUTH);
			f1.setSize(300,300);
			f1.setVisible(true);
			
			red.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					p1.setBackground(Color.RED);
		
				}
			});
			
			blue.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					p1.setBackground(Color.BLUE);
				}
			});
			exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
	
//			f1.addWindowListener(new WindowEventP());
			f1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					f1.setVisible(false);
					f1.dispose();
					System.exit(0);
				}
				});
			
//		red.addActionListener();

	
		
	}
}

//class WindowEventP implements WindowListener { // 위 Inner 클래스로 변경
//  class WindowEventP extends WindowAdapter{ // 위 WindowListener를 implements 한 클래스
//	  
//	@Override
//	public void windowClosing(WindowEvent e) {
//		
//		System.exit(0);
//	
//	}

	
	
