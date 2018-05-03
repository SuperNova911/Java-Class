package ½Ç½À1;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		Image image = new ImageIcon("test.jpg").getImage();
		
		g.drawImage(image, 100, 100, this);

		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		Color random = new Color(red, green, blue);
		
		g.setColor(random);
		g.fillRect(20, 50, 50, 50);
		
		g.setColor(Color.ORANGE);
		g.fillOval(100, 20, 70, 70);
	}
	
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		
		MyDrawPanel md = new MyDrawPanel();
		
		f.add(md);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Kappa");
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
