package chapter14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;


public class QuizCardBuilder
{
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	
	
	public static void main(String[] args)
	{
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
	}
	
	public void go()
	{
		frame = new JFrame("Quiz Card Builder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24); 
		
		question = new JTextArea(6, 20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane questionScrollPane = new JScrollPane(question);
		questionScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		questionScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6, 20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane answerScrollPane = new JScrollPane(answer);
		answerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		answerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		cardList = new ArrayList<QuizCard>();
		
		JLabel questionLabel = new JLabel("Question:");
		JLabel answerLabel = new JLabel("Answer:");
		
		mainPanel.add(questionLabel);
		mainPanel.add(questionScrollPane);
		mainPanel.add(answerLabel);
		mainPanel.add(answerScrollPane);
		mainPanel.add(nextButton);
		
		nextButton.addActionListener(new NextCardListener());

		JMenu menu = new JMenu("File");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		
		newMenuItem.addActionListener(new NewMenuListener());
		saveMenuItem.addActionListener(new SaveMenuListener());
		
		menu.add(newMenuItem);
		menu.add(saveMenuItem);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	private void clearCard()
	{
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	private void saveFile(File file)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			Iterator iterator = cardList.iterator();
			
			while (iterator.hasNext())
			{
				QuizCard card = (QuizCard) iterator.next();
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
		} 
		catch (IOException e)
		{
			System.out.println("Failed to saveFile");
			e.printStackTrace();
		}
	}
	
	public class NextCardListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}	
	}
	
	public class SaveMenuListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showSaveDialog(frame);
			saveFile(fileChooser.getSelectedFile());
		}
	}
	
	public class NewMenuListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			cardList.clear();
			clearCard();
		}
	}
}
