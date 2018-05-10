// Flow Layout

package �ǽ�4;

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

		button1 = new JButton("1 ��ư");
		button2 = new JButton("2 ��ư");
		button3 = new JButton("3 ��ư");
		button4 = new JButton("4 ��ư");
		button5 = new JButton("5 ��ư");
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(comboBox);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flow Layout �׽�Ʈ (�⺻ ���̾ƿ�)");
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		FlowFrame flow = new FlowFrame();
		flow.go();
	}
}
