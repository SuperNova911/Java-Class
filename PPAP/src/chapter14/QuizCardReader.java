package chapter14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

public class QuizCardReader
{
	private JFrame frame;
	private JButton nextButton;
	private JTextArea display;
	private JTextArea answer;
	private QuizCard currentCard;
	private ArrayList<QuizCard> cardList;
	private Iterator<QuizCard> cardIterator;
	private boolean isShowAnswer;
	
	public static void main(String[] args)
	{
		QuizCardReader cardReader = new QuizCardReader();
		cardReader.go();
	}
	
	public void go()
	{
		frame = new JFrame("Quiz Card Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		display = new JTextArea(9, 20);
		display.setFont(bigFont);
		display.setLineWrap(true);
		display.setWrapStyleWord(true);
		display.setEditable(false);
		
		JScrollPane questionScrollPane = new JScrollPane(display);
		questionScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		questionScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		nextButton = new JButton("Show Question");
		mainPanel.add(questionScrollPane);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NewCardListener());
		
		JMenu menu = new JMenu("File");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem loadMenuItem = new JMenuItem("Load card set");
		
		loadMenuItem.addActionListener(new OpenMenuListener());
		menu.add(loadMenuItem);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	private void loadFile(File file)
	{
		cardList = new ArrayList<QuizCard>();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while ((line = reader.readLine()) != null)
			{
				makeCard(line);
			}
			reader.close();
		}
		catch (IOException e)
		{
			System.out.println("Failed to loadFile");
			e.printStackTrace();
		}
		
		cardIterator = cardList.iterator();
		showNextCard();
	}
	
	private void makeCard(String lineToParse)
	{
		StringTokenizer tokenizer = new StringTokenizer(lineToParse, "/");
		
		if (tokenizer.hasMoreTokens())
		{
			QuizCard card = new QuizCard(tokenizer.nextToken(), tokenizer.nextToken());
			cardList.add(card);
		}
	}
	
	private void showNextCard()
	{
		currentCard = (QuizCard) cardIterator.next();
		display.setText(currentCard.getQuestion());
		nextButton.setText("Show Answer");
		
		isShowAnswer = true;
	}
	
	public class NewCardListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (isShowAnswer)
			{
				display.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				
				isShowAnswer = false;
			}
			else
			{
				if (cardIterator.hasNext())
				{
					showNextCard();
				}
				else
				{
					display.setText("That was last card");
					nextButton.disable();
				}
			}
		}
	}
	
	public class OpenMenuListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showOpenDialog(frame);
			loadFile(fileChooser.getSelectedFile());
		}
	}
}
