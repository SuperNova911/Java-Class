package �ǽ�4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx	extends JFrame
{
	JTextField textField = new JTextField(20);
	JTextArea textArea = new JTextArea(7, 20);
	
	public TextAreaEx()
	{
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���"));
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
