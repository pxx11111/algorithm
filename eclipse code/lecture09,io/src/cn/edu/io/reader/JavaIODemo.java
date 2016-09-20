package cn.edu.io.reader;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JavaIODemo extends JFrame implements ActionListener, ItemListener {
	JPanel p1, p2, p3, p4;
	JTextArea textArea;
	JScrollPane scrollPane;
	JLabel labelQuestion, labelSelection, labelScore;
	JButton startButton, nextButton;
	JRadioButton button[];
	ButtonGroup buttonGroup;
	BufferedReader br;// 缓冲流
	String answer;

	void display() throws IOException {
		p1 = new JPanel();
		p2 = new JPanel(); // 创建组件
		p3 = new JPanel();
		p4 = new JPanel();
		textArea = new JTextArea(3, 30);
		scrollPane = new JScrollPane(textArea);
		labelQuestion = new JLabel("题目:");
		labelSelection = new JLabel("选项:");
		labelScore = new JLabel("");
		startButton = new JButton("开始");
		nextButton = new JButton("下一个题目");
		button = new JRadioButton[4];
		buttonGroup = new ButtonGroup();
		for (int i = 0; i < 4; i++) {
			button[i] = new JRadioButton(" ");
			buttonGroup.add(button[i]);
			button[i].addItemListener(this);
		}
		br = new BufferedReader(new FileReader("test.txt"));
		Container c = getContentPane(); // 装配组件
		p3.add(labelQuestion);
		p3.add(scrollPane);
		c.add(p3, BorderLayout.NORTH);
		p1.setLayout(new GridLayout(2, 1));
		p1.add(p4);
		p1.add(labelScore);
		p4.add(labelSelection);
		for (int i = 0; i < 4; i++) {
			p4.add(button[i]);
		}
		c.add(p1, BorderLayout.CENTER);
		p2.add(startButton);
		p2.add(nextButton);
		c.add(p2, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		startButton.addActionListener(this);
		nextButton.addActionListener(this);
	}

	void showQuestion( )throws IOException {       //显示问题及选项
			textArea.setText(br.readLine());                //题目内容显示在编辑框
	        	for(int i=0;i<4;i++){                                     //显示四个选项
	           		button[i].setText(br.readLine());
	        	}
	        	answer=new String(br.readLine());           //从文件中读取标准答案
	            labelScore.setText("");                              //判断正误文本框清空
		 }

	public void actionPerformed(ActionEvent e) {
		try {
			showQuestion();
		} catch (Exception e1) {
		}
	}

	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < 4; i++) {
			if (button[i].isSelected())
				if ((int) answer.charAt(0) == i + 65)
					labelScore.setText("     恭喜你，答对了！");
				else
					labelScore.setText("    回答错误！");
		}
	}

	public static void main(String[] args) throws IOException {
		(new JavaIODemo()).display();
	}
}
