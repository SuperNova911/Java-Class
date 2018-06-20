package 문제2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AddressManager implements Serializable
{	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton buttonRead = new JButton("주소록 읽기");
		JButton buttonSave = new JButton("저장하기");
		JTextArea textArea = new JTextArea();
		
		buttonRead.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File file = new File("address.txt");
					FileReader reader = new FileReader(file);
					BufferedReader bufferedReader = new BufferedReader(reader);
					
					String address = null;
					while ((address = bufferedReader.readLine()) != null)
					{
						textArea.append(address + "\n");
					}
					
					bufferedReader.close();
				} catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
		buttonSave.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					File file = new File("address.txt");
					FileWriter writer = new FileWriter(file);
					BufferedWriter bufferedWriter = new BufferedWriter(writer);
					
					bufferedWriter.write(textArea.getText());
					
					bufferedWriter.close();
				} 
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
		textArea.setSize(400, 300);
		textArea.setBackground(Color.WHITE);
		
		frame.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout());
		panel.add(buttonRead);
		panel.add(buttonSave);
		frame.getContentPane().add(textArea);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
