package ½Ç½À1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleGUI implements ActionListener
{
	JButton button;
	JFrame frame;
	
	public void go()
	{
		frame = new JFrame();
		
		button = new JButton("Click me LOL");
		button.addActionListener(this);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		MyDrawPanel md = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, md);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("KappaRoss");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String text = button.getText();
		
		if (text.equals("Clicked"))
			button.setText("Click me LOL");
		else
			button.setText("Clicked");
	}
	
	public static void main(String[] args)
	{
		SimpleGUI sg = new SimpleGUI();
		sg.go();
	}
}
