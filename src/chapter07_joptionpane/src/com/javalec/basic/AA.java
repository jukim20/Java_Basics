package com.javalec.basic;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AA {
	
	JFrame frame;
	BorderLayout borderLayout;
	GridLayout gridLayout;
	TextField textField; // 한 줄 입력용
	TextArea textArea;
	JButton resetButton;
	Container smallerContainer;
	// 한꺼번에 import : ctrl + shift + 'o' 
	
	AA(){
		// frame 준비
		frame = new JFrame("나만의 메모장");
		frame.setVisible(true);
		frame.setSize(300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		frame.setLayout(borderLayout);
		
		textArea = new TextArea(25, 50); // 25줄, 50글자
		textArea.setEditable(false); // 타이핑 불가능하게
		frame.add(textArea, BorderLayout.CENTER);
		
		textField = new TextField();
		
		
		gridLayout = new GridLayout(1, 2);  
		smallerContainer = new Container();
		smallerContainer.setLayout(gridLayout);
		smallerContainer.add(textField, 0);
		
		resetButton = new JButton("초기화");
		smallerContainer.add(resetButton, 1); 
		
		frame.add(smallerContainer, BorderLayout.SOUTH);
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 방금 눌린 키가 enter니? 
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String data = textField.getText(); // 텍스트 얻어 옴
					textArea.append(data + "\n"); // 추가하다 (이어서 쓰다)
					textField.setText(""); // 사용자 눈에는 아무 것도 안보이도록 빈문자열로 세팅
				}
				
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TextArea의 모든 데이터가 ""이 되도록
				textArea.setText("");
			}
		});
		textField.requestFocus(); // 운영체제에게 여기에 커서를 위치시키도록 요청
	}
	
	
	public static void main(String[] args) {
		new AA();
	}
}










