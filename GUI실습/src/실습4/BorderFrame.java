// Border Layout

package �ǽ�4;

import java.awt.*;

import javax.swing.*;

public class BorderFrame
{
	JFrame frame;
	JButton button1, button2, button3, button4;
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
		
		frame.setLayout(new BorderLayout());

		frame.add("North", button1);
		frame.add("West", button2);
		frame.add("Center", button3);
		frame.add("East", button4);
		frame.add(BorderLayout.SOUTH, comboBox);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Border ���̾ƿ�");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		BorderFrame border = new BorderFrame();
		border.go();
	}
}
