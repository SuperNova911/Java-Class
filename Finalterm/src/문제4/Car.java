package 문제4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Car
{
	public static int speed;
	public static int fuel;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panelNorth = new JPanel();
		JPanel panelSouth = new JPanel();
		JButton buttonAccel = new JButton("Accelerator");
		JButton buttonBrake = new JButton("Brake");
		JTextField textFieldSpeed = new JTextField();
		JTextField textFieldFuel = new JTextField();
		JTextArea textArea = new JTextArea();
		
		speed = 0;
		fuel = 75;

		textFieldSpeed.setText("시속: " + speed + "km");
		textFieldFuel.setText("연료: " + fuel + "리터");

		panelNorth.add(buttonAccel, BorderLayout.WEST);
		panelNorth.add(buttonBrake, BorderLayout.EAST);
		panelSouth.add(textFieldSpeed, BorderLayout.WEST);
		panelSouth.add(textFieldFuel, BorderLayout.EAST);
		frame.add(textArea, BorderLayout.CENTER);

		frame.getContentPane().add(panelNorth, BorderLayout.NORTH);
		frame.getContentPane().add(panelSouth, BorderLayout.SOUTH);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		buttonAccel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				textArea.setText("소나타가 가속하고 있습니다.");
				
				speed += 10;
				fuel -= 5;

				textFieldSpeed.setText("시속: " + speed + "km");
				textFieldFuel.setText("연료: " + fuel + "리터");
			}
		});
		
		buttonBrake.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				textArea.setText("소나타가 브레이크를 밟고 있습니다.");
				
				speed -= 10;

				textFieldSpeed.setText("시속: " + speed + "km");
			}
		});
	}
	

}
