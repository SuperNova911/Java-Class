package ¹®Á¦5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		int random = (int) (Math.random() * 3);
		
		g.setColor(Color.RED);
		
		switch (random)
		{
		case 0:
			g.fillRect(100, 100, 200, 200);
			break;
			
		case 1:
			g.fillOval(100, 100, 200, 200);
			break;
			
		case 2:
			g.fillArc(100, 100, 200, 200, 60, 60);
			break;
		}
	}
}
