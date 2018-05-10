package 실습4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx	extends JFrame
{
	JTextField textField = new JTextField(20);
	JTextArea textArea = new JTextArea(7, 20);
	
	public TextAreaEx()
	{
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		container.add(textField);
		container.add(new JScrollPane(textArea));
		
		textField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JTextField jTextField = (JTextField) e.getSource();
				textArea.append(jTextField.getText() + "\n");
				jTextField.setText("");
			}
		});
		
		setSize(300, 300);;
		setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new TextAreaEx();
	}
}
