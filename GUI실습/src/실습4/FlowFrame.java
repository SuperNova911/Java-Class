// Flow Layout

package 실습4;

import java.awt.FlowLayout;

import javax.swing.*;

public class FlowFrame 
{
	JFrame frame;
	JButton button1, button2, button3, button4, button5;
	JComboBox comboBox;
	
	public void go()
	{
		frame = new JFrame();
		
		String[] text = {"Green", "Red", "Blue"};
		comboBox = new JComboBox(text);

		button1 = new JButton("1 버튼");
		button2 = new JButton("2 버튼");
		button3 = new JButton("3 버튼");
		button4 = new JButton("4 버튼");
		button5 = new JButton("5 버튼");
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(comboBox);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flow Layout 테스트 (기본 레이아웃)");
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		FlowFrame flow = new FlowFrame();
		flow.go();
	}
}
