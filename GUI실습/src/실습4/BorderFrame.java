// Border Layout

package 실습4;

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

		button1 = new JButton("1 버튼");
		button2 = new JButton("2 버튼");
		button3 = new JButton("3 버튼");
		button4 = new JButton("4 버튼");
		
		frame.setLayout(new BorderLayout());

		frame.add("North", button1);
		frame.add("West", button2);
		frame.add("Center", button3);
		frame.add("East", button4);
		frame.add(BorderLayout.SOUTH, comboBox);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Border 레이아웃");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		BorderFrame border = new BorderFrame();
		border.go();
	}
}
