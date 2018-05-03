// Box Layout

package 실습3;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class BoxFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button1 = new JButton("shock me");
		JButton button2 = new JButton("bliss");
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.BLACK);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(button1);
		panel.add(button2);
		
		frame.add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Box 레이아웃 테스트");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
