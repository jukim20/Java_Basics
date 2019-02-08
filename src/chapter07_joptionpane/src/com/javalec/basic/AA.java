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
	TextField textField; // �� �� �Է¿�
	TextArea textArea;
	JButton resetButton;
	Container smallerContainer;
	// �Ѳ����� import : ctrl + shift + 'o' 
	
	AA(){
		// frame �غ�
		frame = new JFrame("������ �޸���");
		frame.setVisible(true);
		frame.setSize(300, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		frame.setLayout(borderLayout);
		
		textArea = new TextArea(25, 50); // 25��, 50����
		textArea.setEditable(false); // Ÿ���� �Ұ����ϰ�
		frame.add(textArea, BorderLayout.CENTER);
		
		textField = new TextField();
		
		
		gridLayout = new GridLayout(1, 2);  
		smallerContainer = new Container();
		smallerContainer.setLayout(gridLayout);
		smallerContainer.add(textField, 0);
		
		resetButton = new JButton("�ʱ�ȭ");
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
				// ��� ���� Ű�� enter��? 
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String data = textField.getText(); // �ؽ�Ʈ ��� ��
					textArea.append(data + "\n"); // �߰��ϴ� (�̾ ����)
					textField.setText(""); // ����� ������ �ƹ� �͵� �Ⱥ��̵��� ���ڿ��� ����
				}
				
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TextArea�� ��� �����Ͱ� ""�� �ǵ���
				textArea.setText("");
			}
		});
		textField.requestFocus(); // �ü������ ���⿡ Ŀ���� ��ġ��Ű���� ��û
	}
	
	
	public static void main(String[] args) {
		new AA();
	}
}










