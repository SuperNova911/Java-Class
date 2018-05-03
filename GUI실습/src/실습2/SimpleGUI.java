// 내부 클래스를 이용한 GUI

package 실습2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import 실습1.MyDrawPanel;

public class SimpleGUI
{
	JFrame frame;
	JButton button;
	JButton labelButton;
	JLabel label;
	
	public void go()
	{
		frame = new JFrame();
		
		button = new JButton("Click me");
		button.addActionListener(new buttonListener());
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		labelButton = new JButton("Change Label");
		labelButton.addActionListener(new labelListener());
		frame.getContentPane().add(BorderLayout.WEST, labelButton);
		
		label = new JLabel("Who r u");
		Font font = new Font("gulim", Font.BOLD, 28);
		label.setFont(font);
		frame.getContentPane().add(BorderLayout.EAST, label);
		
		MyDrawPanel md = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, md);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hi");
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	class buttonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			frame.repaint();
			
			String text = button.getText();
			
			if (text.equals("Clicked"))
				button.setText("Click me");
			else
				button.setText("Clicked");
		}
	}
	
	class labelListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			label.setText("hi im label");
		}
	}
	
	
	public static void main(String[] args)
	{
		SimpleGUI sg = new SimpleGUI();
		sg.go();
	}
}
