package ¹®Á¦5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Paint
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		JMenuBar menuBar = new JMenuBar();
		JMenu menuScreen = new JMenu("Screen");
		JMenu menuSource = new JMenu("Source");
		JMenu menuProject = new JMenu("Project");
		JMenuItem menuItemDraw = new JMenuItem("Draw");
		JMenuItem menuItemHide = new JMenuItem("Hide");
		JMenuItem menuItemReshow = new JMenuItem("Reshow");
		JMenuItem menuItemExit = new JMenuItem("Exit");

		menuScreen.add(menuItemDraw);
		menuScreen.add(menuItemHide);
		menuScreen.add(menuItemReshow);
		menuScreen.add(menuItemExit);
		
		menuBar.add(menuScreen);
		menuBar.add(menuSource);
		menuBar.add(menuProject);
		
		frame.add(menuBar, BorderLayout.NORTH);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
		
		menuItemDraw.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
			}
		});
		
		menuItemHide.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					frame.getContentPane().remove(drawPanel);
				} 
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
		menuItemReshow.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
			}
		});
		
		menuItemExit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
}
